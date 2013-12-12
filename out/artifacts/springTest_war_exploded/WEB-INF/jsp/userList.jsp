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
<a href="/springTest">新增用户</a>
<table border="1">
    <tr>
        <th>姓名</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td><c:out value="${user.uname}"/></td>
            <td><c:out value="${user.upw}"/></td>
            <td><a href="">删除</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>