package com.ramonlabs.ramonbank.action.prestamo;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import utils.OperationException;

import cliente.ClienteManager;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cliente;

public class CargarClientesAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private List<Cliente> clientes;
	private String error;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String execute() throws Exception, OperationException {
		
		setClientes(ClienteManager.ListarClientesActivos());

		return SUCCESS;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
