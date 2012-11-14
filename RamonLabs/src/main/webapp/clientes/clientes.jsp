<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<s:include value="/estructura/header.jsp"></s:include>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clientes</title>
</head>

<body>
	
	<s:if test="error != null">
		<s:text name="error"></s:text>
	</s:if>
	
	<ul>
		<li><a href="altacliente">Alta</a></li>

		<li><a href="showClientes">Mostrar todos</a></li>
	</ul>
 	<br/>
 		<s:select label="Selecion cliente" headerKey="-1"
 	headerValue="--- Seleccione ---" list="clientes"
 	name="idcliente" listKey="id" listValue="dni" />
	<ul>
		<li><a href="bajacliente">Baja</a></li>
		<li><a href="modificarCliente">Modificar</a></li>
	</ul>
</body>

</html>
<s:include value="/estructura/footer.jsp"></s:include>
