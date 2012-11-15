<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="s" uri="/struts-tags" %>
<s:include value="/estructura/header.jsp"></s:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Servicio</title>
</head>
<body>
	<ul>
		<li><a href="altaservicio">Alta</a></li>
		<li><a href="bajaservicio">Baja</a></li>
		<li><a href="modificarservicio">Modificar</a></li>
		<li><a href="showservicios">Mostrar todos</a></li>
	</ul>
</body>
</html>
<s:include value="/estructura/footer.jsp"></s:include>