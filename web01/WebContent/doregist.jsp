<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息接收页面</title>
</head>
<body>
	<!-- 接收用户请求，相当于接收用户注册信息，并显示出来 -->
	<%
		//request可以接收用户的请求，注意参数的值应该与表单中元素name一致
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		String newpassword=request.getParameter("newpassword");
		String froms[]=request.getParameterValues("from");
		
		if("admin".equals(name)&&"admin".equals(password)&&"admin".equals(newpassword)){
			//response.sendRedirect("welcome.jsp");//页面重定向
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}else{
			response.sendRedirect("regist.jsp");
		}
	%>
	用户名：<%=name %><br/>
	密码：<%=password %><br/>
	信息来源：
	<%
		for(String s:froms){
			out.print(s+" ");
		}
	%>
</body>
</html>