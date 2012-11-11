package com.ramonlabs.ramonbank.action.cuenta;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import utils.Contexto;
import utils.OperationException;
import cliente.ClienteManager;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cliente;

public class AltaCuentaAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	
	private Integer cliente_id;
	private Integer tipo;
	private Boolean estado;
	private double saldo;
	private double descubierto;
	private Boolean activo;
	
	@Override
	public String execute() throws Exception, OperationException{
		
		//Cargo todo el cliente y lo mando a ClienteManager.Registro, esta clase valida cliente y devuelve una excepcion (OperationException) o grava en la db.
    	
    	Cliente cliente = (Cliente) Contexto.getBean("clienteBean");
    	
		/*cliente.setDni(dni);
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDireccion(direccion);
		cliente.setEmail(email);*/
		
		ClienteManager.Registro(cliente);
		
		if (cliente_id == null || cliente_id==0)
			return ERROR;
		return SUCCESS;
	}

	public Integer getCliente_id() {
		return cliente_id;
	}



	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}



	public Integer getTipo() {
		return tipo;
	}



	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}



	public Boolean getEstado() {
		return estado;
	}



	public void setEstado(Boolean estado) {
		this.estado = estado;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getDescubierto() {
		return descubierto;
	}



	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}



	public Boolean getActivo() {
		return activo;
	}



	public void setActivo(Boolean activo) {
		this.activo = activo;
	}



	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
