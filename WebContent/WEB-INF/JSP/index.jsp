<%-- Een welkom pagina --%>

<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="nl">
<head>
<c:import url="/WEB-INF/JSP/head.jsp">
	<c:param name="title" value="Frituur Frida" />
</c:import>
<body>
	<c:import url="/WEB-INF/JSP/menu.jsp" />
	<h1>Frituur Frida</h1>
	<div>Vandaag zijn we ${openGesloten}</div>
	<img src="images/${openGesloten}.png" alt="${openGesloten}">
	<h2>Adres</h2>
	Adres${adres.straat} ${adres.huisNr}
	<br>${adres.gemeente.naam} ${adres.gemeente.postcode}
</body>
</html>