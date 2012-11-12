package com.ramonlabs.ramonbank.action.cuenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import utils.OperationException;


import com.opensymphony.xwork2.ActionSupport;
import com.ramonlabs.ramonbank.dbaccess.Cuenta;

public class ShowCuentasAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	
	private List<Cuenta> cuentas = new ArrayList<Cuenta>();

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String execute() throws Exception, OperationException {
		return SUCCESS;
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
	}
	
}
