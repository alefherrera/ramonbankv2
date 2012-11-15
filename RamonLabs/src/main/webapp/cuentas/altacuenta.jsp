<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
<s:include value="/estructura/header.jsp"></s:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear Cuenta</title>
</head>
<body>
<h1>Alta Cuenta</h1>

	<s:if test="error != null">
		<s:text name="error"></s:text>
	</s:if>
	
<s:form action="submitaltacuenta">
<s:hidden name="idCliente"></s:hidden>
		<table>
			<tbody>
				<tr>
					<td>
					<s:label label="Cliente:" name="dni" />
					</td>
				</tr>
				<tr> 
					<s:select label="Selecion tipo"
						headerKey="-1" headerValue="--- Seleccione ---" listValue="nombre" listKey="id" list="tipos" name="tipo" />
				</tr>
				<tr>
					<td><input type="submit" value="Dar de Alta"></input></td>
				</tr>
			</tbody>
		</table>

</s:form>
</body>
</html>
<s:include value="/estructura/footer.jsp"></s:include>