<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html id="teacherlist">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,department-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
  <script type="text/javascript" src="lib/html5shiv.js"></script>
  <script type="text/javascript" src="lib/respond.min.js"></script>
  <![endif]-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css"
	id="skin" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
  <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js"></script>
  <script>DD_belatedPNG.fix('*');</script>
  <![endif]-->
<title>部门列表</title>
</head>
<body>
	<nav class="breadcrumb"> <i class="Hui-iconfont">&#xe67f;</i> 首页
	<span class="c-gray en">&gt;</span> 部门管理 <span class="c-gray en">&gt;</span>
	用户列表 <a class="btn btn-success radius r"
		style="line-height: 1.6em; margin-top: 3px"
		href="javascript:location.replace(location.href);" title="刷新"> <i
		class="Hui-iconfont">&#xe68f;</i>
	</a> </nav>

	<div class="page-container">
		<div class="text-c">
			日期范围： <input type="text"
				onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })"
				id="datemin" class="input-text Wdate" style="width: 120px;">
			- <input type="text"
				onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })"
				id="datemax" class="input-text Wdate" style="width: 120px;">

			<form id="search_name">
				<input type="text" class="input-text" style="width: 250px"
					placeholder="输入用户名称" id="DepartmentName" name="DepartmentName"> <input
					type="button" id="search" value="搜索"
					class="btn btn-success radius"><i class="Hui-iconfont">&#xe665;</i>
			</form>
		</div>
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"><a href="javascript:;"
				onclick="delect_batch()" class="btn btn-danger radius"> <i
					class="Hui-iconfont">&#xe6e2;</i> 批量删除
			</a> <a href="javascript:;"
				onclick="member_add('添加用户','${pageContext.request.contextPath}/Department/Department_add','','510')"
				class="btn btn-primary radius"> <i class="Hui-iconfont">&#xe600;</i>
					添加部门
			</a> </span> <span class="r">共有部门：<strong>88</strong> 个
			</span>
		</div>
		<div class="mt-20">
			<table id="datalist"
				class="table table-border table-bordered table-hover table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="25">选择</th>
						<th width="50">ID</th>
						<th width="80">部门名</th>
						<th width="90">负责人</th>
						<th width="">部门简介</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${sessionScope.departmentlist}" var="department">
						<tr class="text-c">
							<td><input type="checkbox" value="${department.getDepartmentId()}"
								name="ckbok"></td>
							<td>${department.getDepartmentId()}</td>
							<td><u style="cursor: pointer" class="text-primary"
								onclick="member_show('${department.getDepartmentName()}','${pageContext.request.contextPath}/Department/Department_show?DepartmentId=${department.getDepartmentId()}','10001','360','400')">${department.getDepartmentName()}</u></td>
							<td>${department.getLeader()}</td>
							<td>${department.getContent()}</td>
							<td class="td-manage"> <a
								title="编辑" href="javascript:;"
								onclick="member_edit('编辑','${pageContext.request.contextPath}/Department/Department_edit?DepartmentId=${department.getDepartmentId()}','4','','510')"
								class="ml-5" style="text-decoration: none"> <i
									class="Hui-iconfont">&#xe6df;</i>
							</a> 
							 <a title="删除" href="javascript:;"
								onclick="member_del(this,'${department.getDepartmentId()}')" class="ml-5"
								style="text-decoration: none"> <i class="Hui-iconfont">&#xe6e2;</i>
							</a></td>
						</tr>
					</c:forEach>

				</tbody>
				
			</table>
		</div>
	</div>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript">
  $(function () {
    $('.table-sort').dataTable({
      "aaSorting": [[1, "desc"]],//默认第几个排序
      "bStateSave": true,//状态保存
      "aoColumnDefs": [
        //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
        {"orderable": false, "aTargets": [0, 8, 9]}// 制定列不参与排序
      ]
    });

  });

  /*部门-添加*/
  function member_add(title, url, w, h) {
    layer_show(title, url, w, h);
  }

  /*部门-查看*/
  function member_show(title, url, id, w, h) {
    layer_show(title, url, w, h);
  }

  /*用户-编辑*/
  function member_edit(title, url, id, w, h) {
    layer_show(title, url, w, h);
  }

  /*用户-删除*/
  function member_del(obj, id) {
    layer.confirm('确认要删除吗？', function (index) {
      $.ajax({
        type: 'POST',
        url: '${pageContext.request.contextPath}/Department/Department_Delete?DepartmentId='+id,
        dataType: 'json',
        success: function (data) {
          $(obj).parents("tr").remove();
          layer.msg('已删除!', {icon: 1, time: 1000});
        },
        error: function (data) {
        	layer.msg('无法删除!', {icon: 1, time: 1000});
        },
      });
    });
  }
  
  
  
  /*用户-删除多条*/
 function delect_batch(){ 
	 var arry = new Array();
   //循环所有选中的值
   $('input[name="ckbok"]:checked').each(function(index, element) {
       //追加到数组中
       arry.push($(this).val());
   });
   
   if(arry==0){
	   alert("请选择数据！");
	   return;
   }
   //将数组元素连接起来转化为字符串
   var ids = arry.join(',');
   //输出到控制台
   console.log("选中值："+ ids);
 
     if (confirm("是否 删除?")){
       $.post ("${pageContext.request.contextPath}/Department/Department_DeleteBatch", {"ids":ids},
       function (data){
      if (data>0) {
         alert("删除成功");
          }else {
            alert("删除失败");
          }
      window.location.reload();
            },"json");

} 
  }
  /*部门-查询*/
 $("#search").click(function() {
	  $.ajax({
          async : false,
          cache : false,
          type : 'POST',
          data : $("#search_name").serialize(),
          url : "${pageContext.request.contextPath}/Department/findlikeDepartment",//请求的action路径  
          error : function() {//请求失败处理函数  
              alert('失败');
          },
          success : function(data) { //请求成功后处理函数。    
        	  $("#datalist").html(data);
          	}
              
          });
 });
</script>
</body>
</html>