<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="http://localhost:8080/mispruebas/datos/pagina2">Siguiente</a>
	<form:form method="POST" action="" modelAttribute="country">
		<fieldset>
			<legend>Weather form</legend>
			<form:label path="country">Pais</form:label>
			<form:input path="country"  /><br/>
		</fieldset>
		<input type="submit" value="Enviar" >
	</form:form>	

</body>
</html>