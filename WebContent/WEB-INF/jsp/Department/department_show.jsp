<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
<title>用户查看</title>
</head>
<body>
	<div class="cl pd-20" style="background-color: #5bacb6">
		<img class="avatar size-XL l"
			src="static/h-ui/images/ucnter/avatar-default.jpg">
		<dl style="margin-left: 80px; color: #fff">
			<dt>
				<span class="f-18">${department.getDepartmentName()}</span> <span
					class="pl-10 f-12">负责人：${department.getLeader()}</span>
			</dt>
			<dd class="pt-10 f-12" style="margin-left: 0">上级部门：${department.getFid()}</dd>
		</dl>
	</div>
	<div class="pd-20">
		<table class="table">
			<tbody>
				<tr>
				<th class="text-r">部门简介：</th>
				<td>${department.getContent()}</td>
				</tr>
			</tbody>
		</table>
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
</body>
</html>