<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 这是html注释，这部分内容用户查看源代码可以看到 --> 
	<%--这是jsp注释 ，用户在开发者模式下不可以看到--%>

	<%	//这是小脚本
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date date=new Date();
		String time=sdf.format(date);
	%>
		今天日期：<%=time %><hr/>
		<%=3+5 %>
	<hr/>
	<%
		int sum=0;
		for(int i=0;i<=100;i++){
			for(int j=1;j<=i;j++){
				if(i%j!=0&&i%i==0&&i%1==0){
					sum+=i;
					out.println(i+" "+j+"\n");
				}
			}
		}
	%>
 	1-100之间素数之和为：<%=sum %>

</body>
</html>