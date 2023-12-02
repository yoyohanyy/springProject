<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit Form</title>
</head>
<body>

<h1>Edit Form</h1>
<%--@elvariable id="boardVo" type=""--%>
<form:form commandName="boardVo" method="post" action="../editok">
	<form:hidden path="seq"/>
	<table id="edit">
		<tr><td>category</td><td><form:input path="category"/></td></tr>
		<tr><td>title</td><td><form:input path="title"/></td></tr>
		<tr><td>writer</td><td><form:input path="writer"/></†d></tr>
		<tr><td>content</td><td><form:textarea cols="50" rows="5" path="content" /></td></tr>
	</table>
	<input type="submit" value="edit"/>
	<input type="button" value="cancel" oncLick="history"/>
</form:form>

</body>
</html>