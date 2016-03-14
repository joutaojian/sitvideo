<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> 
<title>首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords" content="java,学习" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="../frontDesign/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="../frontDesign/css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--webfont-->
<link href='http://fonts.useso.com/css?family=Quicksand:300,400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="../frontDesign/js/jquery-1.11.1.min.js"></script>
<script src="../frontDesign/js/menu_jquery.js"></script>

<!-- start -->



<!-- end -->

</head>

<body>
	<div class="header">	
      <div class="container"> 
  	     <div class="logo">
			<h1><a href="index.html">Java Hub</a></h1>
		 </div>
		 <div class="top_right">
		   <ul>
			<li><a href="../user/register.do">注册</a></li>|
			<li class="login" >
				 <div id="loginContainer">
				 <a href="#" id="loginButton"><span>登录</span></a>
					  <div id="loginBox">                
						  <form id="loginForm" action="login.do" method="post">
			                <fieldset id="body">
			                	<fieldset>
			                          <label for="email">邮箱</label>
			                          <input type="text" name="email" id="email">
			                    </fieldset>
			                    <fieldset>
			                            <label for="password">密码</label>
			                            <input type="password" name="password" id="password">
			                     </fieldset>
			                    <input type="submit" id="login" value="登录">
			                	<label for="checkbox"><input type="checkbox" id="checkbox"> <i>记住我</i></label>
			                	 
			            	</fieldset>
			                 <span><a href="#">忘记密码?</a></span>
			                 <a align="right"><font color="red" >${error} &nbsp;</font></a>
						   </form>
				        </div>
			      </div>
			  </li>
		   </ul>
	     </div>
		 <div class="clearfix"></div>
		</div>
	</div>
	<div class="banner">
		<div class="container">
			<div class="span_1_of_1">
			    <h2>Learn Java by<br> all over the world.</h2>
			    <div class="search">
			      <ul class="nav1">
		            <li id="search">
						<form action="" method="get">
							<input type="text" name="search_text" id="search_text" placeholder="搜索"/>
							<input type="button" name="search_button" id="search_button">
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
					    <li><a href=""></a><b>Level-1</b></li>
			            <li><a href="stock.html">面向对象</a></li>
			            <li><a href="stock.html">基本语法</a></li>
			            <li><a href="stock.html">集合框架</a></li>
			            <li><a href="stock.html">多线程</a></li>
			            <li><a href="stock.html">网络编程</a></li>
		            </ul>
				</div>
				<div class="col_1_of_5 span_1_of_5">
					<ul class="list1">
					    <li><a href=""></a><b>Level-2</b></li>
			            <li><a href="stock.html">数据结构</a></li>
			            <li><a href="stock.html">算法设计</a></li>
			            <li><a href="stock.html">设计模式</a></li>
			            <li><a href="stock.html">编程技巧</a></li>
			            <li><a href="stock.html">编程工具</a></li>
		            </ul>
				</div>
				<div class="col_1_of_5 span_1_of_5">
					<ul class="list1">
					    <li><a href="stock.html"></a><b>Level-3</b></li>
			            <li><a href="stock.html">数据库</a></li>
			            <li><a href="stock.html">操作系统</a></li>
			            <li><a href="stock.html">编译原理</a></li>
			            <li><a href="stock.html">计算机网络</a></li>
		            </ul>
				</div>
				<div class="col_1_of_5 span_1_of_5">
					<ul class="list1">
					    <li><a href="stock.html"></a><b>Level-4</b></li>
			            <li><a href="stock.html">Servlet/JSP</a></li>
			            <li><a href="stock.html">框架</a></li>
			            <li><a href="stock.html">Linux</a></li>
			            <li><a href="stock.html">前端技术</a></li>
			            <li><a href="stock.html">新技术</a></li>
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
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/g1.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/g2.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/g3.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/g4.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1" id="show">
			<img src="../frontDesign/images/g5.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<h4>Level-2</h4>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/f1.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/pic9.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/f2.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/f3.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/f4.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<h4>Level-3</h4>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/w1.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/pic15.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/w2.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/w3.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/w4.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<h4>Level-4</h4>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/pic20.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/pic21.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/pic22.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/pic23.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="col-md-2 col_1">
			<img src="../frontDesign/images/pic24.jpg" class="img-responsive" alt=""/>
		</div>
		<div class="clearfix"> </div>
	</div>
	
	
	<div class="grid_3">
	  <div class="container">
	  	 <ul id="footer-links">
			<li><a href="#">Terms of Use</a></li>
			<li><a href="#">Royalty Free License</a></li>
			<li><a href="#">Extended License</a></li>
			<li><a href="#">Privacy</a></li>
			<li><a href="support.html">Support</a></li>
			<li><a href="about.html">About Us</a></li>
			<li><a href="faq.html">FAQ</a></li>
			<li><a href="#">Categories</a></li>
         </ul>
         <!--<p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a> - Collect from <a href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿" target="_blank">ç½é¡µæ¨¡æ¿</a></p>-->
	  </div>
	</div>
</body>
</html>