<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="doregist.jsp" method="post">
		用户名：<input type="text" name="user_id"/>
		密码：<input type="password" name="password"/>
		再次输入密码：<input type="password" name="repassword">
		<input type="submit" value="注册" />
	</form>
</body>
</html>