<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<s:include value="/estructura/header.jsp"></s:include>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Show Clientes All</h1>

	<table border="1">
	<thead><tr>
	<th>DNI</th>
	<th>NOMBRE</th>
	<th>APELLIDO</th>
	<th>DIRECCION</th>
	<th>EMAIL</th>
	
	</tr>
	</thead>
		<s:iterator value="clientes">
			<tr>
				<td><s:property value="dni" /></td>
				<td><s:property value="nombre" /></td>
				<td><s:property value="apellido" /></td>
				<td><s:property value="direccion" /></td>

				<td><s:property value="email" /></td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>
<s:include value="/estructura/footer.jsp"></s:include>
