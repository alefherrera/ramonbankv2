package com.ramonlabs.ramonbank.action.cuenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import utils.Contexto;
import utils.OperationException;

import cliente.ClienteManager;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cliente;
import com.ramonlabs.ramonbank.dbaccess.Cuenta;

import cuenta.CuentaManager;

public class ExtraccionAction extends ActionSupport implements SessionAware {
	
	private static final long serialVersionUID = 1L;
	
	private String idCliente;
	private String idCuenta;
	private List<Cuenta> cuentas;
	private String error;
	private String monto;
	
	@Override
	public String execute() throws Exception{
		Cuenta cuenta = (Cuenta) Contexto.getBean("cuentaBean");
		cuenta.setId(Integer.parseInt(getIdCuenta()));
		
		try{
			CuentaManager.Extraer(cuenta, monto);			
		}catch(OperationException ex)
		{
			setError(ex.getMessage());
			display();
			return ERROR;
		}
		
		return SUCCESS;
	}


	
	public String display() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		if(!(request.getParameter("idCliente") == null))
			setIdCliente(request.getParameter("idCliente"));
		try{
			Cliente cliente = ClienteManager.CargarClienteID(getIdCliente());
			cuentas = CuentaManager.ListarCuentasActivas(cliente.getId());
		}
		catch(OperationException ex)
		{
			setError(ex.getMessage());
			return ERROR;
		}
		
		return NONE;
	}
	
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}



	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}



	public String getIdCuenta() {
		return idCuenta;
	}


	public String getMonto() {
		return monto;
	}



	public void setMonto(String monto) {
		this.monto = monto;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}
}
