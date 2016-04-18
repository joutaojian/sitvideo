<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>个人信息</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="../backDesign/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <link rel="stylesheet" href="../backDesign/dist/css/AdminLTE.min.css">
    <link rel="stylesheet" href="../backDesign/dist/css/skins/_all-skins.min.css">
  </head>

  <body class="hold-transition skin-blue sidebar-mini">
  	
  	<jsp:include page="/WEB-INF/jsp/front/head.jsp"></jsp:include>
  
    <div class="wrapper">
      
      <div style="background:#555555">
        <!-- Main content -->
        <section class="content">
          <div class="row" >
            <div class="col-md-3">
              <!-- Profile Image -->
              <div class="box box-primary">
                <div class="box-body box-profile">
                  <img class="profile-user-img img-responsive img-circle" src="../backDesign/dist/img/user4-128x128.jpg" alt="User profile picture">
                  <h3 class="profile-username text-center">周韬健</h3>

                  <ul class="list-group list-group-unbordered">
                    <li class="list-group-item">
                      <b>粉丝</b> <a class="pull-right">1,322</a>
                    </li>
                    <li class="list-group-item">
                      <b>关注</b> <a class="pull-right">543</a>
                    </li>
                    <li class="list-group-item">
                      <b>Java等级</b> <a class="pull-right">Level-1</a>
                    </li>
                  </ul>

                  <a href="#" class="btn btn-primary btn-block"><b>关注</b></a>
                </div><!-- /.box-body -->
              </div><!-- /.box -->

              <!-- About Me Box -->
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">关于我</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                <strong><i class="fa fa-pencil margin-r-5"></i> 技能</strong>
                  <p>
                    <span class="label label-danger">UI Design</span>
                    <span class="label label-success">Coding</span>
                    <span class="label label-info">Javascript</span>
                    <span class="label label-warning">PHP</span>
                  </p>
                  <hr>
                  <strong><i class="fa fa-book margin-r-5"></i>  教育</strong>
                  <p class="text-muted">广东工业大学</p>
                  <hr>
				  <strong><i class="fa fa-file-text-o margin-r-5"></i> 简介</strong>
                  <p class="text-muted">热爱学习，热爱运动</p>
                </div><!-- /.box-body -->
              </div><!-- /.box -->
            </div><!-- /.col -->
            
             <!--  Box -->
            <div class="col-md-9">
              <div class="nav-tabs-custom">
                <ul class="nav nav-tabs">
                  <li class="active"><a href="#timeline" data-toggle="tab">我的视频</a></li>
                  <li><a href="#upload" data-toggle="tab">上传视频</a></li>
                  <li><a href="#settings" data-toggle="tab">设置</a></li>
                </ul>
                <div class="tab-content">
                  <div class="active tab-pane" id="timeline">
                    <!-- The timeline -->
                    <ul class="timeline timeline-inverse">
                      <!-- timeline time label -->
                      <li class="time-label">
                        <span class="bg-green">
                         	 时 间 线
                        </span>
                      </li>
                      <!-- /.timeline-label -->
                      <!-- start -->
                      <c:forEach items="${movList}" var="movList">
                      <li>
                        <i class="fa fa-envelope bg-blue"></i>
                        <div class="timeline-item">
                          <span class="time"><i class="fa fa-clock-o"></i> <fmt:formatDate value="${movList.time}" pattern="yyyy-MM-dd"/></span>
                          <h3 class="timeline-header"><a href="#">${movList.name}</a></h3>
                          <div class="timeline-body" style="word-break:break-all"> <!-- 让其在边界内自动换行 -->
                          	${movList.descp}...
                          </div>
                          <div class="timeline-footer">
                            <a class="btn btn-primary btn-xs" href="../mov/show/${movList.id}.do">查看</a>
                            <a class="btn btn-danger btn-xs" href="../mov/delete.do?id=${movList.id}">删除</a>
                          </div>
                        </div>
                      </li>
                      </c:forEach>
                      <!-- stop -->
                      
                      <!-- timeline item
                       <i class="fa fa-user bg-aqua"></i>
                       <i class="fa fa-camera bg-purple"></i>
                       -->
                      <li>
                        <i class="fa fa-clock-o bg-gray"></i>
                      </li>
                    </ul>
                  </div><!-- /.tab-pane -->


				<div class="tab-pane" id="upload">
                    <form class="form-horizontal" action="../mov/upload.do" enctype="multipart/form-data" method="post">
                      <div class="form-group">
                        <label for="inputName" class="col-sm-2 control-label">课程名称</label>
                        <div class="col-sm-10">
                          <input name="name" placeholder="课程名字（字数限制为12字）" class="form-control"/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputEmail" class="col-sm-2 control-label">课程等级</label>
                        <div class="col-sm-10">
                          <input class="form-control" name="levelId" placeholder="等级">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputExperience" class="col-sm-2 control-label">课程简介</label>
                        <div class="col-sm-10">
                          <textarea class="form-control" name="descp" placeholder="课程简介（字数限制为50字）"></textarea>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputSkills" class="col-sm-2 control-label">封面图片</label>
                        <div class="col-sm-10">
                          <input type="file" name="img" >
                        </div>
                      </div>
                     <div class="form-group">
                        <label for="inputSkills" class="col-sm-2 control-label">课程资料</label>
                        <div class="col-sm-10">
                          <input type="file" name="res" >
                        </div>
                      </div>
                     <div class="form-group">
                        <label for="inputSkills" class="col-sm-2 control-label">课程视频</label>
                        <div class="col-sm-10">
                         <input type="file" name="mov" >
                        </div>
                      </div>
                      <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                          <button type="submit" class="btn btn-danger">提交</button>
                        </div>
                      </div>
                    </form>
                  </div><!-- /.tab-pane -->



                  <div class="tab-pane" id="settings">
                    <form class="form-horizontal">
                      <div class="form-group">
                        <label for="inputName" class="col-sm-2 control-label">个人名称</label>
                        <div class="col-sm-10">
                          <input type="email" class="form-control" id="inputName" placeholder="名称">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputEmail" class="col-sm-2 control-label">个人等级</label>
                        <div class="col-sm-10">
                          <input type="email" class="form-control" id="inputEmail" placeholder="等级">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputExperience" class="col-sm-2 control-label">个人简介</label>
                        <div class="col-sm-10">
                          <textarea class="form-control" id="inputExperience" placeholder="简介"></textarea>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="inputSkills" class="col-sm-2 control-label">个人技能</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" id="inputSkills" placeholder="技能">
                        </div>
                      </div>
                      <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                          <button type="submit" class="btn btn-danger">提交</button>
                        </div>
                      </div>
                    </form>
                  </div><!-- /.tab-pane -->
                  
                </div><!-- /.tab-content -->
              </div><!-- /.nav-tabs-custom -->
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
      
      <jsp:include page="/WEB-INF/jsp/front/foot.jsp"></jsp:include>

    <!-- jQuery 2.1.4 -->
    <script src="../backDesign/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- Bootstrap 3.3.5 -->
    <script src="../backDesign/bootstrap/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="../backDesign/plugins/fastclick/fastclick.min.js"></script>
    <!-- AdminLTE App -->
    <script src="../backDesign/dist/js/app.min.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="../backDesign/dist/js/demo.js"></script>
  </body>
</html>
