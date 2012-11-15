<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<s:include value="/estructura/header.jsp"></s:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Servicio All</title>
</head>
<body>
		<h1>Show Servicio All</h1>
		<table border="1">
		<thead><tr>
		<th>ID SERVICIO</th>
		<th>DESCRIPCION</th>
		<th>MONTO FIJO</th>
		</tr>
		</thead>
			<s:iterator value="servicios">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="descripcion" /></td>
					<td><s:property value="montofijo" /></td>
				</tr>
			</s:iterator>
		</table>
</body>
</html>
<s:include value="/estructura/footer.jsp"></s:include>