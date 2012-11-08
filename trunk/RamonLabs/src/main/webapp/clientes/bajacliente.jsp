<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Baja Cliente</title>
</head>
<body>
<h1>Alta Cliente</h1>
<s:form action="borrarCliente">

		<table>
			<tbody>
				<tr>
<!-- 				habria que poner los labels con los datos del cliente -->
					<td>DNI:</td>
					<td>
					<s:textfield name="dni"></s:textfield>
					<!--<input type="text" name="dni" class="required number minlength" minlength="8" maxlength="8" />-->
					</td>
				</tr>
				<tr> 
					<td>Nombre:</td>
					<td>
					
					<s:label name="nombre"></s:label>
					<!--<input type="text" name="nombre" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>Apellido:</td>
					<td>
<!-- 					<s:label	name="apellido"></s:label> -->
					<!--<input type="text" name="apellido" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>Direccion:</td>
					<td>
<!-- 					<s:label	name="direccion"></s:label> -->
					<!--<input type="text" name="apellido" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td>
<!-- 					<s:label	name="email"></s:label> -->
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