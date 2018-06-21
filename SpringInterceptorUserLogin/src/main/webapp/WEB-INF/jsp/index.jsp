<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>编号</th>
				<th>账号</th>
				<th>密码</th>
				<th>昵称</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users }" var="itme">
				<tr>
					<td>${itme.id }</td>
					<td>${itme.loginName }</td>
					<td>${itme.password }</td>
					<td>${itme.nickName }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>