package com.ramonlabs.ramonbank.action.cuenta;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import utils.Contexto;
import utils.Enums;
import utils.Enums.TIPO_CUENTA;
import utils.OperationException;
import utils.Validator;
import cliente.ClienteManager;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cliente;
import com.ramonlabs.ramonbank.dbaccess.Cuenta;

import cuenta.CuentaManager;

public class AltaCuentaAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	
	
	private String tipo;
	private String error;
	private String dni;
	private String idCliente;
	private List<TIPO_CUENTA> tipos;
	
	@Override
	public String execute() throws Exception{
    	Cuenta cuenta = (Cuenta) Contexto.getBean("cuentaBean");
    	
    	if(!Validator.isNumeric(getIdCliente())){
    		setError("Id incorrecto");
    		return ERROR;
    	}
    	
    	if(!Validator.isNumeric(tipo)){
    		setError("Tipo incorrecto");
    		
    		return ERROR;
    	}
    	
    	cuenta.setTipo(Integer.parseInt(tipo));
    	cuenta.setIdCliente(Integer.parseInt(getIdCliente()));
    	
		try{
			CuentaManager.Registro(cuenta);
		}
		catch(OperationException ex)
		{
			setError(ex.getMessage());
			display();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String display() throws Exception{
		tipos = new ArrayList<TIPO_CUENTA>();
		
		for(TIPO_CUENTA tipo : Enums.TIPO_CUENTA.values()){
			tipos.add(tipo);
		}
		
		HttpServletRequest request = ServletActionContext.getRequest();
		if(!(request.getParameter("idCliente") == null))
			setIdCliente(request.getParameter("idCliente"));
		try{
			Cliente cliente = ClienteManager.CargarClienteID(getIdCliente());
			setDni(cliente.getDni());
		}
		catch(OperationException ex)
		{
			setError(ex.getMessage());
			return ERROR;
		}
	
		return NONE;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public List getTipos() {
		return tipos;
	}

	public void setTipos(List tipos) {
		this.tipos = tipos;
	}
	
}
