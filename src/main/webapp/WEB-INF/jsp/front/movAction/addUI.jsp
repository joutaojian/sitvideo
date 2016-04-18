<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<style type="text/css">
input{ vertical-align:middle; margin:0; padding:0}
.file-box{ position:relative;width:50%}
.txt{ height:22px; border:1px solid #cdcdcd; width:180px;}
.btn{ background-color:#FFF; border:1px solid #CDCDCD;height:24px; width:70px}
.file{ position:absolute; top:0; right:80px; height:24px; filter:alpha(opacity:0);opacity: 0;width:260px }
</style>
</head>
<body>

<div class="file-box">
<form action="../mov/upload.do" enctype="multipart/form-data" method="post">
<table align="center" width="100%">
  <tr>
    <td>名称：</td>
    <td><input name="name" placeholder="课程名字（字数限制为12字）"/></input><span></span></td>
  </tr>
  <tr>
    <td>简介：</td>
    <td><textarea name="descp" placeholder="课程简介（字数限制为50字）" required=""></textarea><span></span></td>
  </tr>
  <tr>
    <td>等级：</td>
    <td><textarea name="levelId" placeholder="等级" required="选择等级"></textarea><span></span></td>
  </tr>
  <tr>
    <td>封面图片：</td>
    <td><input type="file" name="img" ><span></span></td>
  </tr>
  <tr>
    <td>课程资料：</td>
    <td><input type="file" name="res" ><span></span></td>
  </tr>
  <tr>
    <td>课程视频：</td>
    <td><input type="file" name="mov" ><span></span></td>
  </tr>
  <tr>
    <td></td>
    <td><input type="submit" class="btn" value="上传" /></td>
  </tr>
</table>
</form>
</div>

</body>
</html>