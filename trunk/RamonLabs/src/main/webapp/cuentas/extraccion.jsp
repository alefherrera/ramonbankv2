<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Extracción</title>
</head>
<body>
<h1>Extracción</h1>

	<s:if test="error != null">
		<s:text name="error"></s:text>
	</s:if>
	
<s:form action="submitextraccion">
<s:hidden name="idCliente"></s:hidden>
		<table>
			<tbody>
				<tr>
					<s:select label="Seleccionar Cuenta" name="idCuenta" list="cuentas" listKey="id" listValue="nombre_combo" ></s:select>
				</tr>
				
				<tr>
				<td>
					<s:textfield label="Ingrese Monto" name="monto"></s:textfield>
				</td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Extraer"></input></td>
				</tr>
			</tbody>
		</table>
</s:form>
</body>
</html>