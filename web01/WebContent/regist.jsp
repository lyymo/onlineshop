<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path=request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息注册</title>
</head>
<body>
	<form action="doregist.jsp" method="post">
		用户名：<input type="text" name="username"/><br/>
		密码：<input type="password" name="password"/><br/>
		确认密码：<input type="password" name="newpassword"/><br/>
		性别：<input type="radio" name="sex"/>男
			  <input type="radio" name="sex"/>女<br/>
		电子邮件地址：<input type="text" name="email"/><br/>
		出生日期：
		<select name="year">
			<option values="nian"> --请选择年份-- </option>
			<option value="1994">1994</option>
			<option value="1995">1995</option>
			<option value="1996">1996</option>
			<option value="1997">1997</option>
		</select>年
		<select name="month">
			<option value="1">1月</option>
			<option value="2">2月</option>
			<option value="3">3月</option>
			<option value="4">4月</option>
			<option value="5">5月</option>
			<option value="6">6月</option>
			<option value="7">7月</option>
		</select>月
		<select name="day">
			<option value="1">1日</option>
			<option value="2">2日</option>
			<option value="3">3日</option>
			<option value="4">4日</option>
			<option value="5">5日</option>
		</select>日<br/>
		
		信息来源：
		<input type="checkbox" name="from" value="网络"/>网络
		<input type="checkbox" name="from" value="朋友"/>朋友
		<input type="checkbox" name="from" value="家庭"/>家人<br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>