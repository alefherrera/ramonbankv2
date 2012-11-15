<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<s:include value="/estructura/header.jsp"></s:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar Prestamo</title>
</head>
<body>
<h1>Modificar Prestamo</h1>
<s:form action="modificarprestamo">
		<table>
			<tbody>
				<tr>
					<td>Cliente:</td>
					<td>
<%-- 					<s:combobox label="Selecion cliente" headerKey="-1" headerValue="--- Seleccione ---" list="clientes" name="comboclientes" listKey="id" listValue="dni" /> --%>
<%-- 					<s:textfield name="dni"></s:textfield> --%>
					</td>
				</tr>
				<tr> 
					<td>Cuenta:</td>
					<td>
<%-- 					<s:if test="comboclientes!='--- Seleccione ---'"> --%>
<%-- 						<s:combobox label="Selecion cuenta" headerKey="-1" headerValue="--- Seleccione ---" list="cuenta" name="combocuenta" listKey="id" listValue="" /> --%>
<%-- 					</s:if> --%>
<%-- 					<s:textfield name="dni"></s:textfield> --%>
					</td>
				</tr>
				<tr>
					<td>Interes:</td>
					<td>
					<s:textfield name="interes"/>
					<!--<input type="text" name="apellido" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>Fecha Alta:</td>
					<td>
					<s:textfield name="fecha"/>
					<!--<input type="text" name="apellido" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>Cantidad de Cuotas:</td>
					<td>
					<s:textfield name="cantidad"/>
					<!--<input type="text" name="apellido" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>Monto:</td>
					<td>
					<s:textfield name="monto"/>
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
<s:include value="/estructura/footer.jsp"></s:include>