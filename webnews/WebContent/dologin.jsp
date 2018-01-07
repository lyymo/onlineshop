<%@page import="cn.webnews.entity.NewsUser"%>
<%@page import="cn.webnews.service.NewsService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		NewsService service=new NewsService();

		int user_id=Integer.parseInt(request.getParameter("user_id"));
//		int user_id=Integer.getInteger(request.getParameter("user_id"));
		String user_name=request.getParameter("user_name");
		String password=request.getParameter("password");
		
		//
		NewsUser newsUser=new NewsUser(user_id, user_name, password);
		//将用户名存入到session中
		session.setAttribute("user_name", user_name);
		newsUser=service.userLoginService(user_id, user_name, password);
		if(newsUser!=null){
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}
	%>
</body>
</html>
