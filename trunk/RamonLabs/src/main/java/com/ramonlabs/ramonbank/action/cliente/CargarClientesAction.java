package com.ramonlabs.ramonbank.action.cliente;

import java.util.List;
import java.util.Map;

import cliente.ClienteManager;
import com.ramonlabs.ramonbank.dbaccess.Cliente;
import org.apache.struts2.interceptor.SessionAware;
import utils.Contexto;
import utils.OperationException;

import com.opensymphony.xwork2.ActionSupport;

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
		
		setClientes(ClienteManager.ListarClientes());

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
