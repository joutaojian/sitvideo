<%@ page language="java" import="java.util.*,java.util.regex.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>视频</title>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/front/head.jsp"></jsp:include>
	<jsp:include page="/WEB-INF/jsp/front/player.jsp"></jsp:include>
	
	<div align="center">
	  <a href="../dowMov?filename=${dowMov}"><input type="submit" value="下载视频"></a>
		<a href="../dowMov?filename=${dowRes}"><input type="submit" value="下载资料"></a>
	</div>
	<div align="center">
	  <h3>课程简介：</h3>
	  <h3>${descp}</h3>
	</div>
	<jsp:include page="/WEB-INF/jsp/front/foot.jsp"></jsp:include>
</body>
</html>
