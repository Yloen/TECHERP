<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
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
				<span class="f-18">${personallInfo.getName()}</span> <span
					class="pl-10 f-12">性别：${personallInfo.getSex()}</span>
			</dt>
			<dd class="pt-10 f-12" style="margin-left: 0">${personallInfo.getContent()}</dd>
		</dl>
	</div>
	<div class="pd-20">
		<table class="table">
			<tbody>
				<th class="text-r">I&nbsp;&nbsp;D：</th>
				<td>${personallInfo.getPersonalId()}</td>
				</tr>
				<th class="text-r">姓名：</th>
				<td>${personallInfo.getName()}</td>
				</tr>
			
				<tr>
					<th class="text-r">注册时间：</th>
					<td>2020.07.24</td>
				</tr>
			
				<a title="上传图片" href="javascript:;"
					onclick="member_edit('图片','${pageContext.request.contextPath}/PersonalId/Person_Img?PersonalId=${person.getPersonalId()}','4','','510')"
					class="ml-5" style="text-decoration: none"> <i
					class="Hui-iconfont">&#xe6df;</i>图片
				</a>
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



  /*用户-编辑*/
  function member_edit(title, url, id, w, h) {
    layer_show(title, url, w, h);
  }


  
</script>
	<!--请在下方写此页面业务相关的脚本-->
</body>
</html>