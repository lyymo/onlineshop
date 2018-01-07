<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style>
		*{
			margin:0px;
			padding:0px;
		}
		.background{
			width:100%;
			height:800px;
			background-image: url(images/background.jpg);
		}
		.body{
			width:70%;
			height:800px;
			margin-left:auto;
			margin-right:auto;
			background-image:url(images/body.jpg);
		}
		.list{
			width:300px;
			height:200px;
			margin-left: auto;
			margin-right: auto;
			padding-top: 200px;
		}
	</style>
</head>
<body>
	<div class="background">
		<div class="body">
			<div class="list">
				<form action="dologin.jsp" method="post">
					用户ID：<input type="text" name="user_id"/><br/><br/>
					用户名：<input type="text" name="user_name"/><br/><br/>
					密码：&nbsp;&nbsp;&nbsp;<input type="password" name="password"/><br/><br/>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="登录" />
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>