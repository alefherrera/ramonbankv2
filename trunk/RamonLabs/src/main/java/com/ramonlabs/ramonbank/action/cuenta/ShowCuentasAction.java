package com.ramonlabs.ramonbank.action.cuenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import utils.OperationException;
import utils.Validator;


import cliente.ClienteManager;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cliente;
import com.ramonlabs.ramonbank.dbaccess.Cuenta;

import cuenta.CuentaManager;

public class ShowCuentasAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	
	private String idCliente;
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();
	private String error;
	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String execute() throws Exception, OperationException {
		HttpServletRequest request = ServletActionContext.getRequest();
		if(!(request.getParameter("idCliente") == null))
			setIdCliente(request.getParameter("idCliente"));
		try{
			Cliente cliente = ClienteManager.CargarClienteID(getIdCliente());
			setIdCliente(String.valueOf(cliente.getId()));
			if(!Validator.isNumeric(getIdCliente()))
				throw new OperationException("Error de query string");
			
			setCuentas(CuentaManager.ListarCuentasActivas(Integer.parseInt(getIdCliente())));
		}
		catch(OperationException ex)
		{
			setError(ex.getMessage());
			return ERROR;
		}
		return SUCCESS;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	private String getError() {
		return error;
	}

	private void setError(String error) {
		this.error = error;
	}
	
}
