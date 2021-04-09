<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <%--导入bootstrap--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>书籍列表 -------------- 显示所有数据</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
                <a href="/book/toAddBook">
                    <input type="submit" class="btn btn-primary" value="添加书籍">
                </a>
                <a href="/book/allBook">
                    <input type="submit" class="btn btn-primary" value="显示全部信息">
                </a>
            </div>
            <div class="col-md-4 column"></div>
            <div class="col-md-4 column">
                <%--查询书籍--%>
                <form class="form-inline" action="${pageContext.request.contextPath}/book/queryBook" method="post" style="float: right">
                    <span style="color: red;font-weight: bold">${error}</span>
                    <input type="text" class="form-control" name="queryBookName" placeholder="请输入要查询的书籍名称">
                    <input type="submit" class="btn btn-primary" value="查询">
                </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="row clearfix">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                        <th></th>
                    </tr>
                </thead>
                <%--书籍从数据库中查询出来，从这个list中遍历出来--%>
                <tbody>
                    <c:forEach var="book" items="${list}">
                        <tr>
                            <td>${book.bookID}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bookID}">修改</a>
                                &nbsp; | &nbsp;
                                <a href="${pageContext.request.contextPath}/book/deleteBook?id=${book.bookID}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
