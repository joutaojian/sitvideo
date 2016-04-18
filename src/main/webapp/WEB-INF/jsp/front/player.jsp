<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<title>播放</title>

<!-- 播放器 -->
<link rel="stylesheet" type="text/css" href="frontDesign/CuPlayer/common.css">
<link rel="stylesheet" type="text/css" href="frontDesign/CuPlayer/style.css">
<script type="text/javascript"  src="frontDesign/CuPlayer/images/jquery-1.4.3.min.js"></script>
<!-- 播放器 -->

<div style="margin-top:30px" align="center" >
  
  <!--myplayer/begin-->
  <!--酷播迷你 CuPlayerMiniV4.0 代码开始-->
  <script type="text/javascript" src="${pageContext.request.contextPath}/frontDesign/CuPlayer/images/swfobject.js"></script>
  <div id="CuPlayer" > 
  <strong>提示：您的Flash Player版本过低${movUrl}</a></strong> 
  </div>
  
<script type=text/javascript>
//酷播迷你V4：官方连播代码示例20140611//${pageContext.request.contextPath}/frontDesign/CuPlayer/test.mp4
var CuPlayerList ="${pageContext.request.contextPath}/${movUrl}";
var sp =CuPlayerList.split("|");
var num = sp.length;
var video_index = 0;
function getNext(pars)
{	
  if(video_index < num-1)
	{ 
		video_index++;
		so.addVariable("CuPlayerFile",sp[video_index]);
		so.addVariable("CuPlayerAutoPlay","yes"); //是否自动播放
		so.write("CuPlayer");	
	}
	else
	{
	video_index = 0;
	so.addVariable("CuPlayerFile",sp[video_index]);
	so.addVariable("CuPlayerAutoPlay","yes"); //是否自动播放
	so.write("CuPlayer");	
	}
	$(".list dl dt a").css("background","#ffffff").css("color","#333");
	$(".list dl dt a").eq(video_index).css("background","#efefef").css("color","red");
	LeftScr(video_index);
}
function changeStream(CuPlayerFile){
$(".list dl dt a").css("background","#ffffff").css("color","#333");
$(".list dl dt a:hover").css("background","#efefef").css("color","red");
LeftScr(CuPlayerFile);
video_index = CuPlayerFile;
so.addVariable("CuPlayerFile",sp[CuPlayerFile]);
so.addVariable("CuPlayerAutoPlay","yes"); //是否自动播放
so.write("CuPlayer");	
return false;
}
CuPlayerFile =sp[video_index];
$(".list dl dt a").css("background","#ffffff").css("color","#333");
$(".list dl dt a").eq(video_index).css("background","#efefef").css("color","red");
var so = new SWFObject("${pageContext.request.contextPath}/frontDesign/CuPlayer/CuPlayerMiniV4.swf","ply","800","480","9","#000000","center");
so.addParam("allowfullscreen","true");
so.addParam("allowscriptaccess","always");
so.addParam("wmode","opaque");
so.addParam("quality","high");
so.addParam("salign","lt");
so.addVariable("CuPlayerFile",CuPlayerFile);
so.addVariable("CuPlayerSetFile","${pageContext.request.contextPath}/frontDesign/CuPlayer/CuPlayerSetFile.xml"); //* 必须存在/播放器配置文件地址
so.addVariable("CuPlayerImage","${pageContext.request.contextPath}/frontDesign/CuPlayer/images/start.jpg");//* 必须存在/视频略缩图,本图片文件必须正确
so.addVariable("CuPlayerWidth","800"); //视频宽度
so.addVariable("CuPlayerHeight","480"); //视频高度
so.addVariable("CuPlayerAutoPlay","yes"); //是否自动播放
so.addVariable("CuPlayerLogo","${pageContext.request.contextPath}/frontDesign/CuPlayer/images/logo.png"); //Logo文件地址
so.addVariable("CuPlayerPosition","bottom-right"); //Logo显示的位置
so.write("CuPlayer");	

function LeftScr(m){
	var scrtop;
	if(m>1){
	scrtop=55*(m-1);
	}else{
		scrtop=0;
		}
	$(".list").animate({
		scrollTop:scrtop
		},130);
	}

</script>

<!--酷播迷你 CuPlayerMiniV4.0 代码结束-->
<!--myplayer/end-->
</div>

</body>
</html>
