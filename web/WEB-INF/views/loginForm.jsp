<%--
  Created by IntelliJ IDEA.
  User: YouHuan
  Date: 17/9/4
  Time: 下午2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/User/login" method="post">
    <table>
        <tr>
            <td><label>登录名：</label></td>
            <td><input type="text" id="phone" name="phone"/></td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><input type="text" id="password" name="password"/></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="注册"/></td>
        </tr>
    </table>
</form>
</body>
</html>
