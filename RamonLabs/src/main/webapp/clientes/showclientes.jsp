<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Show Clientes All</h1>

<table>
<s:iterator value="clientes">
  <tr>
  	<td>
  	<s:property value="dni" />
  	</td>
  		<td>
  	</td>
  		<td>
  	</td>
  		<td>
  	</td>
  		<td>
  	</td>
  </tr>
</s:iterator>
</table>

</body>
</html>