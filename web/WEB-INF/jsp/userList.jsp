<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>userList</title>
</head>
<script type="text/javascript" src="/web-inf/js/jquery-1.8.2.js"/>
<body>
<script type="text/javascript">
    $(function(){
        alert(0);
    });
</script>
<h1><a href="/springTest">新增用户</a></h1>
<table border="1" cellspacing="0" width="50%">
    <tr align="center">
        <th width="30%">姓名</th>
        <th width="30%">密码</th>
        <th width="40%">操作</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr align="center">
            <td><c:out value="${user.uname}"/></td>
            <td><c:out value="${user.upw}"/></td>
            <td><a href="${pageContext.request.contextPath}/delete/${user.id}.do">delete</a></td>
            <td><a href="${pageContext.request.contextPath}/edit/${user.id}.do">edit</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>