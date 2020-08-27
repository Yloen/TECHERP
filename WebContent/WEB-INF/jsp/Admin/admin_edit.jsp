<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@page import="com.tech.ssm.domain.Admin" %>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="renderer" content="webkit|ie-comp|ie-stand">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport"
        content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="Bookmark" href="/favicon.ico">
  <link rel="Shortcut Icon" href="/favicon.ico"/>
  <!--[if lt IE 9]>
  <script type="text/javascript" src="lib/html5shiv.js"></script>
  <script type="text/javascript" src="lib/respond.min.js"></script>
  <![endif]-->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin"/>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css"/>
  <!--[if IE 6]>
  <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js"></script>
  <script>DD_belatedPNG.fix('*');</script>
  <![endif]-->
  <!--/meta 作为公共模版分离出去-->

  <title>编辑管理员</title>
</head>
<body>
<article class="page-container">
  <form action="" method="post" class="form form-horizontal" id="form-member-add">
    <div class="row cl">
      <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>管理员名：</label>
      <div class="formControls col-xs-8 col-sm-9">
        <input type="text" class="input-text"  id="Aadminname" name="AdminName"
        value="${admin.getAdminName()}">
      </div>
    </div>
   <!--  <div class="row cl">
      <label class="form-label col-xs-4 col-sm-3">头像：</label>
      <div class="formControls col-xs-8 col-sm-9"> <span class="btn-upload form-group">
				<input class="input-text upload-url" type="text" name="uploadfile" id="uploadfile" readonly nullmsg="请添加附件！"
               style="width:200px">
				<a href="javascript:void();" class="btn btn-primary radius upload-btn"><i class="Hui-iconfont">&#xe642;</i> 浏览文件</a>
				<input type="file" multiple name="file-2" class="input-file">
				</span></div>
    </div> -->
    <div class="row cl">
      <label class="form-label col-xs-4 col-sm-3">管理员分类：</label>
      <div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
				<select class="select" size="1" name="city" >
					<option value="" selected>${admin.getCategoryName()}</option>
					<option value="1">分类一</option>
					<option value="2">分类二</option>
					<option value="3">分类三</option>
				</select>
				</span>
      </div>
    </div>
    <div class="row cl">
      <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
        <input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
      </div>
    </div>
  </form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
  $(function () {
    $('.skin-minimal input').iCheck({
      checkboxClass: 'icheckbox-blue',
      radioClass: 'iradio-blue',
      increaseArea: '20%'
    });

    $("#form-member-add").validate({
      rules: {
        username: {
          required: true,
          minlength: 2,
          maxlength: 16
        },
        sex: {
          required: true,
        },
        mobile: {
          required: true,
          isMobile: true,
        },
        email: {
          required: true,
          email: true,
        },
        uploadfile: {
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
            url : "${pageContext.request.contextPath}/Admin/Admin_update?AdminId=${admin.getAdminId()}",//请求的action路径  
            error : function() {//请求失败处理函数  
                alert('失败');
            },
            success : function(data) { //请求成功后处理函数。    
            	if(data==1){
            		alert("修改成功");
           
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