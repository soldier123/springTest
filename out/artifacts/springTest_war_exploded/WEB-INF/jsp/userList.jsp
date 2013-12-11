<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Spring 3.0 MVC demo</title>
</head>
<script type="text/javascript" src="/web-inf/js/jquery-1.8.2.js"/>
<body>
<script type="text/javascript">
    $(function(){
        var userList = ${userList};
        alert(0);
    });
</script>
<a href="/UserController/addUser">新增用户</a>
<table>
    <tr>
        <th>姓名</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td><c:out value="${user.uname}"/></td>
            <td><c:out value="${user.upw}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>