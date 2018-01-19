<%--
  Created by IntelliJ IDEA.
  User: YouHuan
  Date: 17/8/30
  Time: 下午11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>你好！</title>
</head>
<body>
<p><h1>亲爱的[${requestScope.user.name}]召唤师，欢迎来到归来联盟！</h1></p>
<p><h2>${requestScope.message}</h2></p>
</body>
</html>
