<%--
  Created by IntelliJ IDEA.
  User: pradn
  Date: 4/7/2022
  Time: 10:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<%
    int i=10;
    session.setAttribute("test",i);
%>

<jsp:forward page="/TestServlet"></jsp:forward>

<body>

</body>
</html>
