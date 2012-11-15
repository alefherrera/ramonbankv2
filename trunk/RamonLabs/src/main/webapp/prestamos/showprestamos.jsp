<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<s:include value="/estructura/header.jsp"></s:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Prestamos All</title>
</head>
<body>
<h1>Show Prestamos All</h1>
		<table border="1">
		<thead><tr>
		<th>ID</th>
		<th>CLIENTE</th>
		<th>CUENTA</th>
		<th>INTERES</th>
		<th>CANTIDAD DE CUOTAS</th>
		<th>MONTO</th>
		<th>FECHA APERTURA</th>
<!-- 		<th>ACTIVO</th> -->
		
		</tr>
		</thead>
			<s:iterator value="prestamo">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="idcliente" /></td>
					<td><s:property value="idcuenta" /></td>
					<td><s:property value="interes" /></td>
					<td><s:property value="cantidad" /></td>
					<td><s:property value="monto" /></td>
					<td><s:property value="fecha" /></td>
				</tr>
			</s:iterator>
		</table>
</body>
</html>
<s:include value="/estructura/footer.jsp"></s:include>