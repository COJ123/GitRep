<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Author</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>

<div id="wrapper">
	<div id="header">
		<h2>BookStore</h2>
	</div>
</div>

<div id="container">
	<h3>Save Author</h3>

	<p>
		<a href="${pageContext.request.contextPath}/bookstoreEditor/list">Back to List</a>
	</p>

	<form:form action="saveAuthor" modelAttribute="author">
		<form:hidden path="id"/>

		<table>
			<tbody>
			<tr>
				<td><label>Author:</label></td>
				<td><form:input path="author" itemValue ="id"/></td>
			</tr>
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save" class="save"/></td>
			</tr>
			</tbody>
		</table>
	</form:form>

	<div style=""></div>



</div>

</body>

</html>








