<%--
  Created by IntelliJ IDEA.
  User: yanglin
  Date: 2019/12/20
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> %>
<html>
<head>
    <title>Test</title>
</head>
<body>
这是test页面<br>
${requestScope.get("name")}
</body>

</html>
