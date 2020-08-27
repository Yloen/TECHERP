<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,admin-scalable=no" />
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
<title>管理员列表</title>
</head>
<body>
	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 用户系统 <span class="c-gray en">&gt;</span>
		管理员管理 <span class="c-gray en">&gt;</span> 管理员管理 <a
			class="btn btn-success radius r"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"> <i
			class="Hui-iconfont">&#xe68f;</i>
		</a>
	</nav>

	<div class="page-container">


		<div class="text-c">

			<form id="search_name">
				<input type="text" class="input-text" style="width: 250px"
					placeholder="输入管理员名称" id="AdminName" name="AdminName"> <input
					type="button" id="search" value="搜索" class="btn btn-success radius">
				<i class="Hui-iconfont">&#xe665;</i>
			</form>
		</div>

		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"> <a href="javascript:;"
				onclick="delect_batch()" class="btn btn-danger radius"> <i
					class="Hui-iconfont">&#xe6e2;</i> 批量删除
			</a> <a href="javascript:;"
				onclick="member_add('添加管理员','${pageContext.request.contextPath}/Admin/Admin_add','','510')"
				class="btn btn-primary radius"> <i class="Hui-iconfont">&#xe600;</i>
					添加管理员
			</a>
			</span> <span class="r">共有管理员：<strong>000</strong> 名
			</span>
		</div>

		<div class="mt-20">
			<table id="datalist"
				class="table table-border table-bordered table-hover table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" name="" value=""></th>
						<th width="80">管理员编号</th>
						<th width="80">管理员名</th>
						<th width="80">密码</th>
						<th width="80">管理员分类</th>
						<th width="70">管理员状态</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${sessionScope.adminlist}" var="admin">
						<tr class="text-c">
							<td><input type="checkbox" value="${admin.getAdminId()}"
								name="ckbok"></td>
							<td>${admin.getAdminId()}</td>
							<td><u style="cursor: pointer" class="text-primary"
								onclick="member_show('${admin.getAdminName()}','${pageContext.request.contextPath}/Admin/Admin_show?AdminId=${admin.getAdminId()}','10001','360','400')">${admin.getAdminName()}</u></td>
							<td>${admin.getAdminPwd()}</td>
							<td class="text-l">${admin.getCategoryName()}</td>
							<td class="td-status"><span
								class="label label-success radius">${admin.getStatus()}</span></td>
							<td class="td-manage"><a style="text-decoration: none"
								onClick="member_stop(this,'10001')" href="javascript:;"
								title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a
								title="编辑" href="javascript:;"
								onclick="member_edit('编辑','${pageContext.request.contextPath}/Admin/Admin_edit?AdminId=${admin.getAdminId()}','4','','510')"
								class="ml-5" style="text-decoration: none"> <i
									class="Hui-iconfont">&#xe6df;</i>
							</a> <a style="text-decoration: none" class="ml-5"
								onClick="change_password('修改密码','${pageContext.request.contextPath}/Admin/Admin_NewPassword?AdminId=${admin.getAdminId()}','10001','600','270')"
								href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i>
							</a> <a title="删除" href="javascript:;"
								onclick="member_del(this,'${admin.getAdminId()}')" class="ml-5"
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
		$(function() {
			$('.table-sort').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
				"bStateSave" : true,//状态保存
				"aoColumnDefs" : [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{
					"orderable" : false,
					"aTargets" : [ 0, 6 ]
				} // 制定列不参与排序
				]
			});

		});

		/*用户-添加*/
		function member_add(title, url, w, h) {
			layer_show(title, url, w, h);
		}

		/*用户-查看*/
		function member_show(title, url, id, w, h) {
			layer_show(title, url, w, h);
		}

		

		/*用户-编辑*/
		function member_edit(title, url, id, w, h) {
			layer_show(title, url, w, h);
		}

		/*密码-修改*/
		function change_password(title, url, id, w, h) {
			layer_show(title, url, w, h);
		}

		/*用户-删除*/
		function member_del(obj, id) {
			layer
					.confirm(
							'确认要删除吗？',
							function(index) {
								$
										.ajax({
											type : 'POST',
											url : '${pageContext.request.contextPath}/Admin/Admin_Delete?AdminId='
													+ id,
											dataType : 'json',
											success : function(data) {
												$(obj).parents("tr").remove();
												layer.msg('已删除!', {
													icon : 1,
													time : 1000
												});
											},
											error : function(data) {
												layer.msg('无法删除!', {
													icon : 1,
													time : 1000
												});
											},
										});
							});
		}

		/*用户-删除多条*/
		function delect_batch() {
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
			console.log("选中值：" + ids);

			if (confirm("是否 删除?")) {
				$.post("${pageContext.request.contextPath}/Admin/Admin_DeleteBatch",
						{
							"ids" : ids
						}, function(data) {
							if (data > 0) {
								alert("删除成功");
							} else {
								alert("删除失败");
							}
							window.location.reload();
						}, "json");

			}
		}
		/*用户-查询*/
		$("#search").click(function() {
			$.ajax({
				async : false,
				cache : false,
				type : 'POST',
				data : $("#search_name").serialize(),
				url : "${pageContext.request.contextPath}/Admin/findlikeAdmin",//请求的action路径  
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