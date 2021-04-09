<%--
  Created by IntelliJ IDEA.
  User: sino
  Date: 2021/4/8
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>

    <style>
      h3{
        width: 180px;
        height: 38px;
      }
      a{
        text-decoration: none;
        color: blue;
      }
    </style>

  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">跳转到图书页面</a>
  </h3>
  </body>
</html>
