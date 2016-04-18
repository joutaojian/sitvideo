<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>搜索结果</title>
<jsp:include page="/WEB-INF/jsp/front/head.jsp"></jsp:include>
<script src="../frontDesign/js/easyResponsiveTabs.js" type="text/javascript"></script>
    <script type="text/javascript">
	    $(document).ready(function () {
	        $('#horizontalTab').easyResponsiveTabs({
	            type: 'default', //Types: default, vertical, accordion           
	            width: 'auto', //auto or any width like 600px
	            fit: true   // 100% fit in a container
	        });
	    });
    </script>	
</head>

<body>
	<div class="stock_box">
		<!--<div class="col-md-10 sap_tabs">	-->
		<div>
			<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
				<ul class="resp-tabs-list">
					<li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>Level
							- 1</span></li>
					<li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>Level
							- 2</span></li>
					<li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>Level
							- 3</span></li>
					<li class="resp-tab-item" aria-controls="tab_item-3" role="tab"><span>Level
							- 4</span></li>
					<div class="clearfix"></div>
				</ul>
				<div class="resp-tabs-container" align=center>
					<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
						<ul class="tab_img">
						<c:forEach items="${movList}" var="movList">
							<li><a href="../mov/show/${movList.id}.do"> <img src="${pageContext.request.contextPath}/${movList.imgUrl}" class="img-responsive" alt="" />
									<div class="tab_desc">
										<p>${movList.name}</p>
										<h4>${movList.user.name}</h4>
									</div>
							</a></li>
						</c:forEach>
							<div class="clearfix"></div>
						</ul>
					</div>
					
					<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
						<ul class="tab_img">
							<c:forEach items="${movList}" var="movList">
							<li><a href="../mov/show/${movList.id}.do"> <img src="${pageContext.request.contextPath}/${movList.imgUrl}" class="img-responsive" alt="" />
									<div class="tab_desc">
										<p>${movList.name}</p>
										<h4>${movList.user.name}</h4>
									</div>
							</a></li>
						</c:forEach>
							<div class="clearfix"></div>
						</ul>
					</div>
					
					<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
						<ul class="tab_img">
							<c:forEach items="${movList}" var="movList">
							<li><a href="../mov/show/${movList.id}.do"> <img src="${pageContext.request.contextPath}/${movList.imgUrl}" class="img-responsive" alt="" />
									<div class="tab_desc">
										<p>${movList.name}</p>
										<h4>${movList.user.name}</h4>
									</div>
							</a></li>
						</c:forEach>
							<div class="clearfix"></div>
						</ul>
					</div>
					
					<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-3">
						<ul class="tab_img">
							<c:forEach items="${movList}" var="movList">
							<li><a href="../mov/show/${movList.id}.do"> <img src="${pageContext.request.contextPath}/${movList.imgUrl}" class="img-responsive" alt="" />
									<div class="tab_desc">
										<p>${movList.name}</p>
										<h4>${movList.user.name}</h4>
									</div>
							</a></li>
						</c:forEach>
							<div class="clearfix"></div>
						</ul>
					</div>
					
				</div>
			</div>
			<div align="center">
				<ul class="pagination">
					<li><a href="../frontDesign/#" aria-label="Previous"> <span
							aria-hidden="true">上一页</span>
					</a></li>
					<li><a href="../frontDesign/#">1</a></li>
					<li><a href="../frontDesign/#">2</a></li>
					<li><a href="../frontDesign/#">3</a></li>
					<li><a href="../frontDesign/#">4</a></li>
					<li><a href="../frontDesign/#">5</a></li>
					<li><a href="../frontDesign/#" aria-label="Next"> <span
							aria-hidden="true">下一页</span>
					</a></li>
				</ul>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
	
	<!-- foot -->
	<jsp:include page="/WEB-INF/jsp/front/foot.jsp"></jsp:include>
</body>
</html>
