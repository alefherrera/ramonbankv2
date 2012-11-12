package com.ramonlabs.ramonbank.action.prestamo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import utils.OperationException;

import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Prestamo;

public class ShowPrestamosAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	
	private List<Prestamo> prestamo = new ArrayList<Prestamo>();
	
 	public List<Prestamo> getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(List<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}

	@Override
	public String execute() throws Exception, OperationException{
		return SUCCESS;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
}
