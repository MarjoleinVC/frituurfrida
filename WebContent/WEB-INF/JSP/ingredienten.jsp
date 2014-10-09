<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="nl">
<head>
<c:import url="head.jsp">
	<c:param name="title" value="Ingredi&euml;nten" />
</c:import>
</head>
<body>
	<c:import url="/WEB-INF/JSP/menu.jsp" />
	<h1>Ingrediënten</h1>
	<form>
		<label>Ingrediënt:<span>${fouten.ingredient}</span><input
			name="ingredient" value="${param.ingredient}" autofocus required
			type="search"></label> <input type="submit" value="Zoeken">
	</form>
	<c:if test="${not empty sauzen}">
		<ul>
			<c:forEach var="saus" items="${sauzen}">
				<li>${saus.naam}</li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>