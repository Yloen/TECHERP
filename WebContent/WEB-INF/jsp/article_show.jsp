<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="renderer" content="webkit|ie-comp|ie-stand">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport"
        content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
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
  <title>公告详情</title>
</head>
<body>
<div class="page-container" id="article">
  <p class="f-20 text-success" style="text-align: center">{{title}}</p>
  <p style="text-align: center" >公告的作者：{{author}} 发布时间：{{releaseTime}}</p>
  <p style="text-indent: 2em">
    这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容，这是公告的内容。</p>
  <p style="text-indent: 2em">
    右上角可以关闭此窗口，右上角可以关闭此窗口，右上角可以关闭此窗口，右上角可以关闭此窗口，右上角可以关闭此窗口，右上角可以关闭此窗口，右上角可以关闭此窗口，右上角可以关闭此窗口，右上角可以关闭此窗口，</p>

</div>

<footer class="footer mt-20">
  <div class="container">
    <p>Copyright &copy;2020-2020 TEACHERP v１.０ All Rights Reserved.</p>
  </div>
</footer>

<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.min.js"></script>
<script src="lib/vue/v2.6.11/vue.js"></script>
<script>
  let app = new Vue({
    el: '#article',
    data: {
      title:'这是公告的标题',
      author: 'onedayday',
      releaseTime: '2020-07-25 11:00:00'
    }
  })
</script>
</body>
</html>