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
  <link rel="Bookmark" href="/favicon.ico">
  <link rel="Shortcut Icon" href="/favicon.ico" />
  <!--[if lt IE 9]>
  <script type="text/javascript" src="lib/html5shiv.js"></script>
  <script type="text/javascript" src="lib/respond.min.js"></script>
  <![endif]-->
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.8/iconfont.css" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
  <!--[if IE 6]>
  <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js"></script>
  <script>DD_belatedPNG.fix('*');</script>
  <![endif]-->
  <!--/meta 作为公共模版分离出去-->

  <title>发布公告</title>
</head>

<body>
  <article class="page-container">
    <form class="form form-horizontal" id="form-article-add">
      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>公告标题：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <input type="text" class="input-text" value="" placeholder="请输入公告标题" id="articleTitle" name="articletitle">
        </div>
      </div>

      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>公告分类：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <span class="select-box">
            <select name="articleType" class="select">
              <option value="0">全部分类</option>
              <option value="1">分类一</option>
              <option value="11">分类二</option>
              <option value="12">分类三</option>
            </select>
          </span>
        </div>
      </div>

      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-2">文章作者：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <input type="text" class="input-text" value="" placeholder="" id="author" name="author">
        </div>
      </div>

      <div class="row cl">
        <label class="form-label col-xs-4 col-sm-2">公告内容：</label>
        <div class="formControls col-xs-8 col-sm-9">
          <textarea name="abstract" cols="" rows="" class="textarea" placeholder="说点什么..." datatype="*10-100"
            dragonfly="true" nullmsg="备注不能为空！" onKeyUp="$.Huitextarealength(this,200)"></textarea>
          <p class="textarea-numberbar">
            <em class="textarea-length">0</em>/200
          </p>
        </div>
      </div>

      <div class="row cl">
        <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
          <button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i
              class="Hui-iconfont">&#xe632;</i>
            保存并提交审核
          </button>
          <button onClick="article_save();" class="btn btn-secondary radius" type="button"><i
              class="Hui-iconfont">&#xe632;</i>
            保存草稿
          </button>
          <button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;
          </button>
        </div>
      </div>

    </form>
  </article>

  <!--_footer 作为公共模版分离出去-->
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.4/layer.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script>
  <!--/_footer /作为公共模版分离出去-->

  <!--请在下方写此页面业务相关的脚本-->
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/messages_zh.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/webuploader/0.1.5/webuploader.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/ueditor/1.4.3/ueditor.config.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/ueditor/1.4.3/ueditor.all.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
  <script type="text/javascript">
    $(function () {
      $('.skin-minimal input').iCheck({
        checkboxClass: 'icheckbox-blue',
        radioClass: 'iradio-blue',
        increaseArea: '20%'
      });

      //表单验证
      $("#form-article-add").validate({
        rules: {
          articleTitle: {
            required: true,
          },
          articleType: {
            required: true,
          },
          abstract: {
            required: true,
          },
          author: {
            required: true,
          },
          commentdatemin: {
            required: true,
          },
          commentdatemax: {
            required: true,
          },
        },
        onkeyup: false,
        focusCleanup: true,
        success: "valid",
        submitHandler: function (form) {
          //$(form).ajaxSubmit();
          var index = parent.layer.getFrameIndex(window.name);
          //parent.$('.btn-refresh').click();
          parent.layer.close(index);
        }
      });
    });
  </script>
  <!--/请在上方写此页面业务相关的脚本-->
</body>

</html>