package com.ramonlabs.ramonbank.action.cliente;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import utils.Contexto;
import utils.OperationException;

import cliente.ClienteManager;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cliente;

public class BajaClienteAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private String dni;
	//Dejo los siguientes campos para mostrar los datos de la personal que se eliminara.
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String id;
	private String error;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	@Override
	public String execute() throws Exception{
		try
		{
			ClienteManager.Baja(id);
		}
		catch(OperationException ex)
		{
			error = ex.getMessage();
			return ERROR;
		}
		return SUCCESS;
	}

	public String display(){
		HttpServletRequest request = ServletActionContext.getRequest();
		setId((request.getParameter("idCliente")));
		try {
			Cliente cliente = ClienteManager.CargarClienteID(getId());
			setDni(cliente.getDni());
			setApellido(cliente.getApellido());
			setDireccion(cliente.getDireccion());
			setEmail(cliente.getEmail());
			setNombre(cliente.getNombre());
			
		} catch (OperationException e) {
			return ERROR;
		}
		
		return NONE;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
