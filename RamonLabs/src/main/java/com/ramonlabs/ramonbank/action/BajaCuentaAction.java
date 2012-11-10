package com.ramonlabs.ramonbank.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import utils.OperationException;

import com.opensymphony.xwork2.ActionSupport;

public class BajaCuentaAction  extends ActionSupport implements SessionAware{
	
	private static final long serialVersionUID = 1L;

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String execute() throws Exception, OperationException{
		
		return SUCCESS;
	}
	
	
}
