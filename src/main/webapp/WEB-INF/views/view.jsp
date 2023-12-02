<%--
  Created by IntelliJ IDEA.
  User: hani
  Date: 12/2/23
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.lang.reflect.Member" %>
<html>
<head>
  <title>Title</title>
</head>
<body>

<h1>${u.getTitle()}</h1>
<p>${u.getContent()}</p>
<h5>Category : ${u.getCategory()} / Writer : ${u.getWriter()}</h5>
</body>
</html>
