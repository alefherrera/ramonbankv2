<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
<s:include value="/estructura/header.jsp"></s:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Baja Cliente</title>
</head>
<body>
<h1>Baja Cliente</h1>

	<s:if test="error != null">
		<s:text name="error"></s:text>
	</s:if>	
<s:form action="submitbajaCliente">
		<s:hidden name="id"/>
		<table>
			<tbody>
				<tr>
					<td>
					<s:label label="DNI" name="dni"></s:label>
					<!--<input type="text" name="dni" class="required number minlength" minlength="8" maxlength="8" />-->
					</td>
				</tr>
				<tr> 
					<td>
					<s:label label="Nombre" name="nombre"></s:label>
					<!--<input type="text" name="nombre" class="required" />-->
					</td>
				</tr>
				<tr>
					<td>
 					<s:label label="Apellido" name="apellido"></s:label>
					</td>
				</tr>
				<tr>
					<td>
 					<s:label label="Direccion" name="direccion"></s:label>
					</td>
				</tr>
				<tr>
					<td>
 					<s:label label="eMail" name="email"></s:label>
					<!--<input type="text" name="apellido" class="required" />-->
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="Dar de Baja"></input></td>
				</tr>
			</tbody>
		</table>

</s:form>
</body>

</html>
<s:include value="/estructura/footer.jsp"></s:include>