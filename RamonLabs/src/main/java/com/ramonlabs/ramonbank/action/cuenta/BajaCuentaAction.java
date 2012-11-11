package com.ramonlabs.ramonbank.action.cuenta;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import utils.OperationException;

import com.opensymphony.xwork2.ActionSupport;

public class BajaCuentaAction  extends ActionSupport implements SessionAware{
	
	private static final long serialVersionUID = 1L;

	private int id;
	private int idCliente;
	private int tipo;
	private double saldo;
	private double descubierto;
	private boolean estado;
	
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String execute() throws Exception, OperationException{
		//llamar manager de cuentas
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}