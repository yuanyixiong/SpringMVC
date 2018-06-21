<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				<th>错误发生时间</th>
				<th>错误信息</th>
				<th>错误发生位置</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${errorList }" var="itme">
				<tr>
					<td>${itme.createDate }</td>
					<td>${itme.info }</td>
					<td>${itme.location }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>