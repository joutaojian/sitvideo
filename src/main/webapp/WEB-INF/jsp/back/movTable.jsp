<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<div class="box">
   <div class="box-header">
     <h3 class="box-title">管理员账号管理</h3>
   </div><!-- /.box-header -->
   <div class="box-body">
     <div id="example2_wrapper" class="dataTables_wrapper form-inline dt-bootstrap"><div class="row"><div class="col-sm-6"></div><div class="col-sm-6"></div></div><div class="row"><div class="col-sm-12"><table id="example2" class="table table-bordered table-hover dataTable" role="grid" aria-describedby="example2_info">
       <thead>
         <tr role="row"><th class="sorting_asc" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Rendering engine: activate to sort column descending" aria-sort="ascending">ID</th><th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Browser: activate to sort column ascending">名称</th><th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Platform(s): activate to sort column ascending">简介</th><th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="Engine version: activate to sort column ascending">创建时间</th><th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">等级</th><th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">用户</th><th class="sorting" tabindex="0" aria-controls="example2" rowspan="1" colspan="1" aria-label="CSS grade: activate to sort column ascending">操作</th></tr>
       </thead>
       <c:forEach items="${movList}" var="movList">
       <tbody>
	       <tr role="row" class="odd">
	           <td class="sorting_1">${movList.id}</td>
	           <td class="">${movList.name}</td>
	           <td>${movList.descp}</td>
	           <td><fmt:formatDate value="${movList.time}" pattern="yyyy-MM-dd"/></td>
	           <td>${movList.levelId}</td>
	           <td>${movList.user.name}</td>
	           <td><a href="../mov/show/${movList.id}.do">查看</a> | <a href="../mov/deleteBack.do?id=${movList.id}">删除</a></td>
	       </tr>
       </tbody>
       </c:forEach>
     </table>
     </div>
     </div>
     <div class="row">
     <div class="col-sm-5">
     <div class="dataTables_info" id="example2_info" role="status" aria-live="polite">Showing 51 to 57 of 57 entries</div>
     </div>
     <div class="col-sm-7">
     <div class="dataTables_paginate paging_simple_numbers" id="example2_paginate">
     <ul class="pagination">
     <li class="paginate_button previous" id="example2_previous">
     <a href="#" aria-controls="example2" data-dt-idx="0" tabindex="0">Previous</a>
     </li>
     <li class="paginate_button active">
     <a href="#" aria-controls="example2" data-dt-idx="1" tabindex="0">1</a>
     </li>
     <li class="paginate_button ">
     <a href="#" aria-controls="example2" data-dt-idx="2" tabindex="0">2</a>
     </li>
     <li class="paginate_button ">
     <a href="#" aria-controls="example2" data-dt-idx="3" tabindex="0">3</a>
     </li>
     <li class="paginate_button ">
     <a href="#" aria-controls="example2" data-dt-idx="4" tabindex="0">4</a>
     </li>
     <li class="paginate_button ">
     <a href="#" aria-controls="example2" data-dt-idx="5" tabindex="0">5</a>
     </li>
     <li class="paginate_button">
     <a href="#" aria-controls="example2" data-dt-idx="6" tabindex="0">6</a>
     </li>
     <li class="paginate_button next disabled" id="example2_next">
     <a href="#" aria-controls="example2" data-dt-idx="7" tabindex="0">Next</a>
     </li>
     </ul>
     </div></div></div></div>
   </div><!-- /.box-body -->
 </div>
</body>
</html>
