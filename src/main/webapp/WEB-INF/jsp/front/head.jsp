<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>首页</title>
<!-- start -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords" content="java,学习" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<link href="../frontDesign/css/bootstrap.css" rel='stylesheet'
	type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="../frontDesign/css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--webfont-->
<link href='http://fonts.useso.com/css?family=Quicksand:300,400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="../frontDesign/js/jquery-1.11.1.min.js"></script>
<script src="../frontDesign/js/menu_jquery.js"></script>
<!-- end -->

</head>
<body>
	<% if(session.getAttribute("user")!=null){%>
	<div class="header">
		<div class="container">
			<div class="logo">
				<h1>
					<a href="index.html">Java Hub</a>
				</h1>
			</div>
			<div class="top_right">
				<ul>
					<li><a href="../user/info.do">个人信息</a></li>|
					<li><a href="../user/logout.do">退出登录</a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<% }else {%>
	<div class="header">	
      <div class="container"> 
  	     <div class="logo">
			<h1><a href="index.html">Java Hub</a></h1>
		 </div>
		 <div class="top_right">
		   <ul>
			<li><a href="registerUI.do">注册</a></li>|
			<li class="login" >
				 <div id="loginContainer">
				 <a href="#" id="loginButton"><span>登录</span></a>
					  <div id="loginBox">                
						  <form id="loginForm" action="../user/login.do" method="post">
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
	<% }%>
</body>
</html>
