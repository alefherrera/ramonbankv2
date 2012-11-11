<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Cuentas All</title>
</head>
<body>
	<h1>Show Cuentas All</h1>
		<table border="1">
		<thead><tr>
		<th>ID</th>
		<th>CLIENTE</th>
		<th>TIPO</th>
		<th>ESTADO</th>
		<th>SALDO</th>
		<th>DESCUBIERTO</th>
<!-- 		<th>ACTIVO</th> -->
		
		</tr>
		</thead>
			<s:iterator value="cuentas">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="cliente_id" /></td>
					<td><s:property value="tipo" /></td>
					<td><s:property value="estado" /></td>
					<td><s:property value="saldo" /></td>
					<td><s:property value="descubierto" /></td>
				</tr>
			</s:iterator>
		</table>
</body>
</html>