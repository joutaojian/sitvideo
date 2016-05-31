<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> 
<title>首页</title>

</head>

<body>
	
<jsp:include page="/WEB-INF/jsp/front/head.jsp"></jsp:include>

	<div class="banner">
		<div class="container">
			<div class="span_1_of_1">
			    <h2>Learn Java by<br> all over the world.</h2>
			    <div class="search">
			      <ul class="nav1">
		            <li id="search">
						<form action="../mov/search.do" method="get">
							<input type="text" name="content" id="search_text" placeholder="搜索"/>
							<input type="submit"  id="search_button" value="">
						</form>
					</li>
					<li id="options">
						<a href="#">全部视频</a>
						<ul class="subnav">
							<li><a href="#">&nbsp;Level-1&nbsp;视频</a></li>
							<li><a href="#">&nbsp;Level-2&nbsp;视频</a></li>
							<li><a href="#">&nbsp;Level-3&nbsp;视频</a></li>
							<li><a href="#">&nbsp;Level-4&nbsp;视频</a></li>
						</ul>
					</li>
	              </ul>
	            </div>
			</div>
		</div>
	</div>
	
	<div class="grid_2">
		<div class="container"> 
			<div class="col-md-3 col_2">
				<h3>JavaHub<br>等级划分</h3>
			</div>
			<div class="col-md-9 col_5">
				<div class="col_1_of_5 span_1_of_5">
					<ul class="list1">
					    <li><a ></a><b>Level-1</b></li>
			            <li><a >面向对象</a></li>
			            <li><a >基本语法</a></li>
			            <li><a >集合框架</a></li>
			            <li><a >多线程</a></li>
			            <li><a >网络编程</a></li>
		            </ul>
				</div>
				<div class="col_1_of_5 span_1_of_5">
					<ul class="list1">
					    <li><a href=""></a><b>Level-2</b></li>
			            <li><a >数据结构</a></li>
			            <li><a >算法设计</a></li>
			            <li><a >设计模式</a></li>
			            <li><a >编程技巧</a></li>
			            <li><a >编程工具</a></li>
		            </ul>
				</div>
				<div class="col_1_of_5 span_1_of_5">
					<ul class="list1">
					    <li><a ></a><b>Level-3</b></li>
			            <li><a >数据库</a></li>
			            <li><a >操作系统</a></li>
			            <li><a >编译原理</a></li>
			            <li><a >计算机网络</a></li>
		            </ul>
				</div>
				<div class="col_1_of_5 span_1_of_5">
					<ul class="list1">
					    <li><a ></a><b>Level-4</b></li>
			            <li><a >Servlet/JSP</a></li>
			            <li><a >框架</a></li>
			            <li><a >Linux</a></li>
			            <li><a >前端技术</a></li>
			            <li><a >新技术</a></li>
		            </ul>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	
	<div class="grid_1">
		<!--<h3>Now everything I do all is close to my dream.</h3> -->
		<div class="col-md-2 col_1">
			<h4>Level-1</h4>
		</div>
		<c:forEach items="${movRankLists1}" var="movRankLists1">
		<div class="col-md-2 col_1">
			<a href="${pageContext.request.contextPath}/mov/show/${movRankLists1.id}.do"> <img src="${pageContext.request.contextPath}/${movRankLists1.imgUrl}" class="img-responsive" alt=""/>
		</div>
		</c:forEach>
		<div class="col-md-2 col_1">
			<h4>Level-2</h4>
		</div>
		<c:forEach items="${movRankLists2}" var="movRankLists2">
		<div class="col-md-2 col_1">
			<a href="${pageContext.request.contextPath}/mov/show/${movRankLists2.id}.do"> <img src="${pageContext.request.contextPath}/${movRankLists2.imgUrl}" class="img-responsive" alt=""/>
		</div>
		</c:forEach>
		<div class="col-md-2 col_1">
			<h4>Level-3</h4>
		</div>
		<c:forEach items="${movRankLists3}" var="movRankLists3">
		<div class="col-md-2 col_1">
			<a href="${pageContext.request.contextPath}/mov/show/${movRankLists3.id}.do"> <img src="${pageContext.request.contextPath}/${movRankLists3.imgUrl}" class="img-responsive" alt=""/>
		</div>
		</c:forEach>
		<div class="col-md-2 col_1">
			<h4>Level-4</h4>
		</div>
		<c:forEach items="${movRankLists4}" var="movRankLists4">
		<div class="col-md-2 col_1">
			<a href="${pageContext.request.contextPath}/mov/show/${movRankLists4.id}.do"> <img src="${pageContext.request.contextPath}/${movRankLists4.imgUrl}" class="img-responsive" alt=""/>
		</div>
		</c:forEach>
		<div class="clearfix"> </div>
	</div>
	
	
	<jsp:include page="/WEB-INF/jsp/front/foot.jsp"></jsp:include>
</body>
</html>