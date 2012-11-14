package com.ramonlabs.ramonbank.action.cuenta;

import java.util.List;

import cliente.ClienteManager;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cliente;

public class CargarCuentasAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<Cliente> clientes;
	private String cliente;
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	@Override
	public String execute() {
		setClientes(ClienteManager.ListarClientesActivos());
		return SUCCESS;
	}
	
	
	
}
