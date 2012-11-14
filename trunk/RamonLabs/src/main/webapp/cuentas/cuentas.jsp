<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib prefix="s" uri="/struts-tags" %>

<s:include value="/estructura/header.jsp"></s:include>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cuentas</title>
</head>

<body>
	
	<s:if test="error != null">
		<s:text name="error"></s:text>
	</s:if>
	
	<s:select label="Selecion cliente" headerKey="-1"
 	headerValue="--- Seleccione ---" list="clientes"
 	name="idcliente" listKey="id" listValue="dni" />
	<ul>
		<li><a href="altacuenta?idCliente=2">Alta</a></li>
		<li><a href="bajacuenta?idCliente=2">Baja</a></li>
		<li><a href="extraccion?idCliente=2">Extraccion</a></li>
		<li><a href="deposito?idCliente=2">Deposito</a></li>
		<li><a href="showcuenta?idCliente=2">Mostrar todos</a></li>
	</ul>
</body>
</html>
<s:include value="/estructura/footer.jsp"></s:include>
