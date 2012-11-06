package com.ramonlabs.ramonbank.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

import utils.Contexto;
import utils.OperationException;

import cliente.ClienteManager;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cliente;

public class ModificarClienteAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private String dni;
	//Dejo los siguientes campos para mostrar los datos de la personal que se Modificara.
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;

	@Override
	public String execute() throws Exception, OperationException{
		
		//Cargo todo el cliente y lo mando a ClienteManager.Registro, esta clase valida cliente y devuelve una excepcion (OperationException) o grava en la db.
    	
    	Cliente cliente = (Cliente) Contexto.getBean("clienteBean");
    	
		cliente.setDni(dni);
		
		ClienteManager.Registro(cliente);
		
		if (dni == null || dni.isEmpty())
			return ERROR;
		return SUCCESS;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
