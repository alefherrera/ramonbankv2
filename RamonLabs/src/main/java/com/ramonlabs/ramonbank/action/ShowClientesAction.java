package com.ramonlabs.ramonbank.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import utils.Contexto;
import utils.OperationException;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cliente;

public class ShowClientesAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String execute() throws Exception, OperationException {

		Cliente cliente = (Cliente) Contexto.getBean("clienteBean");
		setClientes(cliente.loadAll());
		return SUCCESS;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}

}
