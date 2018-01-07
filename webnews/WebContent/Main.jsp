<%@page import="cn.webnews.entity.News"%>
<%@page import="java.util.List"%>
<%@page import="cn.webnews.service.NewsService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		*{
			margin:0px;
			padding:0px;
		}
		.background{
			width:100%;
			height:2000px;
			background-image: url(images/background.jpg);
		}
		.body{
			width:70%;
			height:2000px;
			margin-left:auto;
			margin-right:auto;
			margin-top:200px;
			background-image:url(images/body.jpg);
			margin-top: -21px;
		}
		ul li{
			list-style: none;
			float:left;
			line-height: 25px;
		}
		ul li a{
			color: #2E3092;
			font-family: "黑体";
		}
		p{
			font-family: "黑体";
			float:left;
			margin-left: 50px;
			line-height: 25px;
		}
		a{
			text-decoration: none;
		}
		.login{
			width:100%;
			height:30px;
			background-image: url(images/nav.jpg);
		}
		.title{
			width:100%;
		}
		.section{
			width:80%;
			height:50px;
			float:left;
		}
		.section a{
			font-size: 25px;
			font-family: "黑体";
			margin-left: 30px;
			line-height: 50px;
		}
		.section a:link{
			color:black;
		}
		.section a:hover{
			color:red;
		}
		.section a:visited{
			color:black;
		}
		.aside{
			width:80%;
			height:200px;
			float:right;
			margin-right:20px;
			font-size:20px;
			line-height: 27px;
		}
		.adddate{
			width:80%;
			height:45px;
			float:right;
			margin-right:20px;
		}
		.adddate b{
			float:right;
			margin-right: 30px;
		}
	</style>
</head>
<body>
	<div class="login">
	
		<p>尊敬的用户<%=session.getAttribute("user_name") %></p>
	</div><br/>
	<div class="background">
		<div class="body">
	<%
		NewsService newsService=new NewsService();
		List<News> list=newsService.showAllService();
		for(int i=0;i<list.size();i++){
	%>
	
	        <%-- 循环打印新闻内容 --%>
			
			<div class="title">
				<div class="section">
					<b><a href="details.jsp?id=<%=list.get(i).getId() %>"><%=list.get(i).getTitle() %></a></b>
				</div><br/>
				<div class="aside">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=list.get(i).getBody() %>
				</div>
				<div class="adddate">
					<b><%=list.get(i).getAdddate() %></b>
				</div>
			</div>
			
	<%
		} //for循环的结束
	%>
			
			
		</div>
	</div>
	
</body>
</html>