<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear Cuenta</title>
</head>
<body>
<h1>Alta Cuenta</h1>
<s:form action="crearCuenta">
		<table>
			<tbody>
				<tr>
					<td>Cliente:</td>
					<td>
					<s:combobox label="Selecion cliente" 
						headerKey="-1" headerValue="--- Seleccione ---"
						list="clientes" 
						name="comboclientes" />
					<s:textfield name="dni"></s:textfield>
					<!--<input type="text" name="dni" class="required number minlength" minlength="8" maxlength="8" />-->
					</td>
				</tr>
				<tr> 
					<td>Tipo:</td>
					<td>
					<s:combobox label="Selecion tipo" 
						headerKey="-1" headerValue="--- Seleccione ---"
						list="clientes" 
						name="comboclientes" />
					<s:textfield name="dni"></s:textfield>
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