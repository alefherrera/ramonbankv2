package com.ramonlabs.ramonbank.action;

import java.util.Map;
import cliente.ClienteManager;
import com.ramonlabs.ramonbank.dbaccess.Cliente;
import org.apache.struts2.interceptor.SessionAware;
import utils.Contexto;
import utils.OperationException;

import com.opensymphony.xwork2.ActionSupport;

public class AltaClienteAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private String dni;
	private String nombre;
	private String apellido;

	@Override
	public String execute() throws Exception, OperationException{
		
		//Cargo todo el cliente y lo mando a ClienteManager.Registro, esta clase valida cliente y devuelve una excepcion (OperationException) o grava en la db.
    	
    	Cliente cliente = (Cliente) Contexto.getBean("clienteBean");
    	
		cliente.setDni(dni);
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		
		ClienteManager.Registro(cliente);
		
		if (dni == null || dni.isEmpty())
			return ERROR;
		return SUCCESS;
		//s

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}

}
