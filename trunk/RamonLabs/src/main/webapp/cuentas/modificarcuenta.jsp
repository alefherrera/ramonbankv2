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
<s:form action="modificarCuenta">
		<table>
			<tbody>
				<tr>
					<td>ID Cuenta:</td>
					<td>
					<s:textfield name="id"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>Cliente:</td>
					<td>
					<s:textfield name="dni"></s:textfield>
					</td>
				</tr>
				<tr> 
					<td>Tipo:</td>
					<td>
					<s:textfield name="tipo"></s:textfield>
<%-- 					<s:label name="tipo"/> --%>
					</td>
				</tr>
				<tr>
					<td>Descubierto:</td>
					<td>
					<s:textfield name="descubierto"></s:textfield>
<%-- 					<s:label name="descubierto"/> --%>
					</td>
				</tr>
				<tr>
					<td>Saldo:</td>
					<td>
					<s:textfield name="saldo"></s:textfield>
<%-- 					<s:label name="saldo"/> --%>
					</td>
				</tr>
				<tr>
					<td>Estado:</td>
					<td>
<%-- 					<s:if test="estado==1"> --%>
<%-- 						<s:label value="Activo"/> --%>
<%-- 					</s:if> --%>
<%-- 					<s:elseif test="estado==0"> --%>
<%-- 						<s:label value="Desactivo"/> --%>
<%-- 					</s:elseif> --%>
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