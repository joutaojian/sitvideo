<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>注册</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Photo-Hub Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
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
</head>
<body>
	<div class="header">	
      <div class="container"> 
  	     <div class="logo">
			<h1><a href="${pageContext.request.contextPath}/user/guest.do">Java Hub</a></h1>
		 </div>
		 
		 <div class="top_right">
		   <ul>

		   </ul>
	     </div>
	     
	     
		 <div class="clearfix"></div>
		</div>
	</div>
	<div class="register">
		<div class="container">
		<div class="register-but">
		   <form action="register.do" method="post"> 
				 <div class="register-top-grid">
					<h1>用户信息</h1>
					 <div>
						<span>名称<label><font color="#FF0000">&nbsp;*</font></label>(由4~12位英文组成 ，不支持中文和符号)</span>
						<input type="text" name="name"/> 
					 </div>
					 <div>
						<span>手机<label><font color="#FF0000">&nbsp;*</font></label></span>
						<input type="text" name="phone"> 
					 </div>
					 <div>
						 <span>邮箱<label><font color="#FF0000">&nbsp;*</font></label></span>
						 <input type="text" name="email"> 
					 </div>
					 <div>
						 <span>Java等级<label><font color="#FF0000">&nbsp;*</font></label></span>
						 <input type="text" name="level"> 
					 </div>
					 <div class="clearfix"> </div>
					   <a class="news-letter" href="#"></a>
					 </div>
				     <div class="register-bottom-grid">
						    <h4>验证密码</h4>
							 <div>
								<span>密码<label><font color="#FF0000">&nbsp;*</font></label></span>
								<input type="text" name="password">
							 </div>
							 <div>
								<span>确认密码<label><font color="#FF0000">&nbsp;*</font></label></span>
								<input type="text" name="password_c">
							 </div>
							 <div class="clearfix"> </div>
					 </div>
			
						<div class="clearfix"> </div>
					   <input type="submit" value="注册">
					   <a align="right"><font color="red" >${error} &nbsp;</font></a>
					   <div class="clearfix"> </div>
					</form>
				</div>
		   </div>
	</div>
	
	<jsp:include page="/WEB-INF/jsp/front/foot.jsp"></jsp:include>
</body>
</html>		