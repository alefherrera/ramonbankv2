<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:select label="Selecion cliente" headerKey="-1" 
	headerValue="--- Seleccione ---" list="clientes" 
	name="idcliente" listKey="id" listValue="dni" />
	<ul>
		<li><a href="altacliente">Alta</a></li>
		<li><a href="bajacliente">Baja</a></li>
		
		<s:url action="modificarCliente" var="modificarLink">
  			<s:param name="idCliente">2</s:param>
		</s:url>
		<li><a href="${modificarLink}">Modificar</a></li>
		<li><a href="showClientes">Mostrar todos</a></li>
	</ul>
</body>
</html>