<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>管理后台</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="../backDesign/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <link rel="stylesheet" href="../backDesign/dist/css/AdminLTE.min.css">
    <link rel="stylesheet" href="../backDesign/dist/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="../backDesign/plugins/iCheck/flat/blue.css">
    <link rel="stylesheet" href="../backDesign/plugins/morris/morris.css">
    <link rel="stylesheet" href="../backDesign/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="../backDesign/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="../backDesign/plugins/daterangepicker/daterangepicker-bs3.css">
    <link rel="stylesheet" href="../backDesign/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
  </head>
  <body class="hold-transition skin-blue sidebar-mini">
    <div class="wrapper">
      <header class="main-header">
        <!-- Logo -->
        <a href="../backDesign/index2.html" class="logo">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini"><b>后</b>台</span>
          <!-- logo for regular state and mobile devices -->
          <span class="logo-lg"><b>管理</b>后台</span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <a href="../admin/logout.do" style="color:white;float:right;margin:10px 5px 0 0">注销</a>
        </nav>
      </header>
      <!-- Left side column. contains the logo and sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <ul class="sidebar-menu">
            <li class="active treeview">
              <a href="#">
                <i class="fa fa-dashboard"></i> <span>用户管理</span> <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li class="active"><a href="../admin/userManager.do"><i class="fa fa-circle-o text-aqua"></i> 会员</a></li>
                <li><a href="../admin/adminManager.do"><i class="fa fa-circle-o text-aqua"></i> 管理员</a></li>
              </ul>
            </li>
            <li class="treeview">
              <a href="#">
                <i class="fa fa-files-o"></i>
                <span>视频管理</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="../admin/movManager.do"><i class="fa fa-circle-o text-aqua"></i> 视频操作</a></li>
              </ul>
            </li>
            <li>
              <a href="#">
                <i class="fa fa-dashboard"></i> <span>推荐管理</span> <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li class="active"><a href="../admin/shouyeManager.do"><i class="fa fa-circle-o text-aqua"></i> 首页推荐</a></li>
                <li><a href="../admin/shouyeManager.do"><i class="fa fa-circle-o text-aqua"></i> 个性化推荐</a></li>
              </ul>
            </li>
            <li class="treeview">
              <a href="#">
                <i class="fa fa-pie-chart"></i>
                <span>数据报表</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="../backDesign/pages/charts/chartjs.html"><i class="fa fa-circle-o text-aqua"></i> 会员</a></li>
                <li><a href="../backDesign/pages/charts/morris.html"><i class="fa fa-circle-o text-aqua"></i> 视频</a></li>
                <li><a href="../backDesign/pages/charts/flot.html"><i class="fa fa-circle-o text-aqua"></i> 推荐</a></li>
              </ul>
            </li>
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>

 <div class="content-wrapper">
        <section class="content">
		<jsp:include page="/WEB-INF/jsp/back/userTable.jsp"></jsp:include>
        </section>
 </div>


      <footer class="main-footer">
        <div class="pull-right hidden-xs">
          <b>Version</b> 1.0.0
        </div>
        <strong>Copyright &copy; 2016-2016 <a href="http://almsaeedstudio.com">Java Hub</a>.</strong> All rights reserved.
      </footer>


    <!-- jQuery 2.1.4 -->
    <script src="../backDesign/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- jQuery UI 1.11.4 -->
    <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <script>
      $.widget.bridge('uibutton', $.ui.button);
    </script>
    <!-- Bootstrap 3.3.5 -->
    <script src="../backDesign/bootstrap/js/bootstrap.min.js"></script>
    <!-- Morris.js charts -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    <script src="../backDesign/plugins/morris/morris.min.js"></script>
    <!-- Sparkline -->
    <script src="../backDesign/plugins/sparkline/jquery.sparkline.min.js"></script>
    <!-- jvectormap -->
    <script src="../backDesign/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="../backDesign/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <!-- jQuery Knob Chart -->
    <script src="../backDesign/plugins/knob/jquery.knob.js"></script>
    <!-- daterangepicker -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
    <script src="../backDesign/plugins/daterangepicker/daterangepicker.js"></script>
    <!-- datepicker -->
    <script src="../backDesign/plugins/datepicker/bootstrap-datepicker.js"></script>
    <!-- Bootstrap WYSIHTML5 -->
    <script src="../backDesign/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <!-- Slimscroll -->
    <script src="../backDesign/plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <!-- FastClick -->
    <script src="../backDesign/plugins/fastclick/fastclick.min.js"></script>
    <!-- AdminLTE App -->
    <script src="../backDesign/dist/js/app.min.js"></script>
    <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
    <script src="../backDesign/dist/js/pages/dashboard.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="../backDesign/dist/js/demo.js"></script>
  </body>
</html>
