<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="/estructura/header.jsp"></s:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cuentas</title>
</head>

<body>

	<s:if test="error != null">
		<s:text name="error"></s:text>
	</s:if>

	<s:select label="Selecion cliente" headerKey="-1"
		headerValue="--- Seleccione ---" list="clientes" name="idcliente"
		listKey="id" listValue="dni" />
	<ul>
		<li><a href="altacuenta" class="altacuenta b">Alta</a></li>
		<li><a href="bajacuenta" class="bajacuenta b">Baja</a></li>
		<li><a href="extraccion" class="extraccion b">Extraccion</a></li>
		<li><a href="deposito" class="deposito b">Deposito</a></li>
		<li><a href="showcuenta" class="showcuenta b">Mostrar todos</a></li>
	</ul>
</body>
<script type="text/javascript">
	$("#idcliente").change(
			function() {
				if ($(this).val() != -1) {
					$(".altacuenta").attr("href",
							"altacuenta?idCliente=" + $(this).val());
					$(".bajacuenta").attr("href",
							"bajacuenta?idCliente=" + $(this).val());
					$(".extraccion").attr("href",
							"extraccion?idCliente=" + $(this).val());
					$(".deposito").attr("href",
							"deposito?idCliente=" + $(this).val());
					$(".showcuenta").attr("href",
							"showcuenta?idCliente=" + $(this).val());
				} else {
					$(".b").attr("href", "javascript:void(0);");
				}
			});
	$(function() {
		$("#idcliente").change();
	});
</script>
</html>
<s:include value="/estructura/footer.jsp"></s:include>
