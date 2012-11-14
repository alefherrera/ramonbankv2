<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear Cliente</title>
</head>
<s:include value="/estructura/header.jsp"></s:include>
<body>
	<h1>Alta Cliente</h1>
	
	<s:if test="error != null">
		<s:text name="error"></s:text>
	</s:if>
	
	
	<s:form action="crearCliente">

		<table>
			<tbody>
				<tr>
					<td>DNI:</td>
					<td><s:textfield name="dni"></s:textfield></td>
				</tr>
				<tr>
					<td>Nombre:</td>
					<td><s:textfield name="nombre"></s:textfield></td>
				</tr>
				<tr>
					<td>Apellido:</td>
					<td><s:textfield name="apellido"></s:textfield></td>
				</tr>
				<tr>
					<td>Direccion:</td>
					<td><s:textfield name="direccion"></s:textfield></td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td><s:textfield name="email"></s:textfield></td>
				</tr>
				<tr>
					<td><input type="submit" value="Entrar"></input></td>
				</tr>
			</tbody>
		</table>

	</s:form>
</body>
</html>
<s:include value="/estructura/footer.jsp"></s:include>