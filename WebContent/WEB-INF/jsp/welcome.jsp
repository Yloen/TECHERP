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
    <link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css"/>
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css"/>
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css"/>
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin"/>
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css"/>
    <!--[if IE 6]>
    <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>我的桌面</title>
</head>
<body>
<div class="page-container" id="main">
    <p class="f-20 text-success">{{title}} <span class="f-14">v1.0 </span>后台管理！</p>
    <p>当前教师：{{teacher}} </p>
    <table class="table table-border table-bordered table-bg">
        <thead>
        <tr>
            <th colspan="8" scope="col">信息统计</th>
        </tr>
        </thead>
        <tr class="text-c">
            <th></th>
            <th>星期一</th>
            <th>星期二</th>
            <th>星期三</th>
            <th>星期四</th>
            <th>星期五</th>
            <th>星期六</th>
            <th>星期天</th>
        </tr>
        <tr class="text-c">
            <td rowspan="4">上午</td>
            <td rowspan="2">1</td>
            <td rowspan="2">2</td>
            <td rowspan="2">3</td>
            <td rowspan="2">4</td>
            <td rowspan="2">5</td>
            <td rowspan="2">6</td>
            <td rowspan="2">7</td>
        </tr>
        <tr></tr>
        <tr class="text-c">
            <td rowspan="2">11</td>
            <td rowspan="2">22</td>
            <td rowspan="2">33</td>
            <td rowspan="2">44</td>
            <td rowspan="2">55</td>
            <td rowspan="2">66</td>
            <td rowspan="2">77</td>
        </tr>
        <tr></tr>

        <tr class="text-c">
            <td rowspan="4">下午</td>
            <td rowspan="2">32</td>
            <td rowspan="2">45</td>
            <td rowspan="2">455</td>
            <td rowspan="2">1</td>
            <td rowspan="2">245</td>
            <td rowspan="2">78</td>
            <td rowspan="2">767</td>
        </tr>
        <tr></tr>
        <tr class="text-c">
            <td rowspan="2">3</td>
            <td rowspan="2">32</td>
            <td rowspan="2">45</td>
            <td rowspan="2">455</td>
            <td rowspan="2">1</td>
            <td rowspan="2">245</td>
            <td rowspan="2">78</td>
        </tr>
        <tr></tr>
        <tr class="text-c">
            <td rowspan="6">晚上</td>
            <td rowspan="2">32</td>
            <td rowspan="2">45</td>
            <td rowspan="2">455</td>
            <td rowspan="2">1</td>
            <td rowspan="2">245</td>
            <td rowspan="2">78</td>
            <td rowspan="2">767</td>
        </tr>
        <tr></tr>
        <tr class="text-c">
            <td rowspan="2">3</td>
            <td rowspan="2">32</td>
            <td rowspan="2">45</td>
            <td rowspan="2">455</td>
            <td rowspan="2">1</td>
            <td rowspan="2">245</td>
            <td rowspan="2">78</td>
        </tr>
        <tr></tr>
        <tr class="text-c">
            <td rowspan="2">3</td>
            <td rowspan="2">32</td>
            <td rowspan="2">45</td>
            <td rowspan="2">455</td>
            <td rowspan="2">1</td>
            <td rowspan="2">245</td>
            <td rowspan="2">78</td>
        </tr>
    </table>


    <table class="table table-border table-bordered table-bg mt-20">
        <thead>
        <tr>
            <th colspan="2" scope="col">系统公告</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，就当是一场梦，</td>
        </tr>
        </tbody>
    </table>
</div>
<footer class="footer mt-20">
    <div class="container">
        <p>
            本后台系统由 王&nbsp;&nbsp;&nbsp;&nbsp;彪 | 杨海燕 提供前端技术支持<br>
            本后台系统由 杨锦明 | 阳璐诗 提供后端技术支持
        </p>
    </div>
</footer>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="lib/vue/v2.6.11/vue.js"></script>
<script>
    let welcome = new Vue({
        el: "#main",
        data: {
            title: "欢迎使用TEACHERP",
            teacher: 'onedayday',
            name: "sdfds",
            college:['学院1','学院2','学院3','学院4','学院5'],
        }
    })
</script>
</body>
</html>