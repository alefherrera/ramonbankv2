<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<s:include value="/estructura/header.jsp"></s:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Servicio</title>
</head>
<body>
<h1>Alta Servicio</h1>
<s:form action="crearServicio">
		<table>
			<tbody>
				<tr> 
					<td>Descripcion:</td>
					<td>
						<s:textfield name="descripcion"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>Monto Fijo:</td>
					<td>
					<s:textfield	name="montoFijo"></s:textfield>
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