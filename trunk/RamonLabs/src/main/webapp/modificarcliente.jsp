<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar Cliente</title>
</head>
<body>
<h1>Modificar Cliente</h1>
<s:form action="crearCliente">

		<table>
			<tbody>
				<tr>
					<td>DNI:</td>
					<td>
					<s:textfield name="dni"></s:textfield>
					<!--<input type="text" name="dni" class="required number minlength" minlength="8" maxlength="8" />-->
					</td>
				</tr>
				<tr> 
					<td>Nombre:</td>
					<td>
					<s:textfield name="nombre"></s:textfield>
					<!--<input type="text" name="nombre" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>Apellido:</td>
					<td>
					<s:textfield	name="apellido"></s:textfield>
					<!--<input type="text" name="apellido" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>Direccion:</td>
					<td>
					<s:textfield	name="direccion"></s:textfield>
					<!--<input type="text" name="apellido" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td>
					<s:textfield	name="email"></s:textfield>
					<!--<input type="text" name="apellido" class="required" />-->
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="Entrar"></input></td>
				</tr>
			</tbody>
		</table>

</s:form>
</body>
</html>