package com.ramonlabs.ramonbank.action.servicio;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import utils.OperationException;

import com.opensymphony.xwork2.ActionSupport;

public class AltaServicioAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	
	private String description;
	private double mentoFijo;
	
	
	@Override
	public String execute() throws Exception, OperationException {
		//llamar al manager
		return SUCCESS;
	}
	
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMentoFijo() {
		return mentoFijo;
	}

	public void setMentoFijo(double mentoFijo) {
		this.mentoFijo = mentoFijo;
	}

}
