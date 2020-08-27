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
<link rel="Bookmark" href="/favicon.ico">
<link rel="Shortcut Icon" href="/favicon.ico" />
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
<!--/meta 作为公共模版分离出去-->

<title>添加部门 - H-ui.admin v3.1</title>
<meta name="keywords"
	content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description"
	content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
	<article class="page-container">
	<form method="post" class="form form-horizontal" id="form-member-add">

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>部门ID：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder=""
					id="DepartmentId" name="DepartmentId">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>部门名：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder=""
					id="DepartmentName" name="DepartmentName">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>负责人：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder=""
					id="Leader" name="Leader">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">上级部门：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<span class="select-box"> <select class="select" size="1"
					id="Fid" name="Fid">
						<option value="" selected>请选择部门</option>
						<!-- 通过循环获得 -->
						<option value="0">无</option>
				</select>
				</span>
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">部门简介：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<span class="select-box">
						<input type="text" class="input-text" value="" placeholder=""
					id="Content" name="Content">
			
				</span>
			</div>
		</div>
		

		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit"
					value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</form>
	</article>

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
		src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<script type="text/javascript">
  $(function () {
	
	  
	  
	  
    $('.skin-minimal input').iCheck({
      checkboxClass: 'icheckbox-blue',
      radioClass: 'iradio-blue',
      increaseArea: '20%'
    });

    $("#form-member-add").validate({
      rules: {
    	  DepartmentName: {
          required: true,
          minlength: 2,
          maxlength: 16
        },
        Leader: {
          required: true,
        },
        Content: {
          required: true,
        },
        DepartmentId: {
            required: true,
            minlength: 4,
            maxlength: 8
          },
        Fid: {
          required: true,
            },

      },
      onkeyup: false,
      focusCleanup: true,
      success: "valid",
      submitHandler: function (form) {
          ajaxSubmit();
       var index = parent.layer.getFrameIndex(window.name);
        //parent.$('.btn-refresh').click();
        parent.layer.close(index);
       
      }
    });
    
    function ajaxSubmit() {
        $.ajax({
            async : false,
            cache : false,
            type : 'POST',
            data : $("#form-member-add").serialize(),
            url : "${pageContext.request.contextPath}/Department/Department_insert",//请求的action路径  
            error : function() {//请求失败处理函数  
                alert('失败');
            },
            success : function(data) { //请求成功后处理函数。    
            	if(data!=null){
            		alert("成功");
           
            	}
            	var index = parent.layer.getFrameIndex(window.name);
                //parent.$('.btn-refresh').click();
                parent.layer.close(index);
                
                
            }
        });
    }
    
  });
</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>