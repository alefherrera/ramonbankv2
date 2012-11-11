<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TP Banco Web</title>
</head>
<body>
	<ul>
	<li><a href=clienteAction>Clientes</a></li>
	
	<li><a href=cuentaAction>Cuentas</a></li>
	
	<li><a href=servicioAction>Servicio</a></li>
	</ul>
	
	<s:a action="strutsAction">Struts</s:a>
	
	<a href="strutsAction">Ejecutar strutsAction</a>
	
</body>
</html>