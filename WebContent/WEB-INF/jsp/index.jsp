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
<link rel="stylesheet" type="text/css"
	href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/skin/green/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
    <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js"></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
<title>TEACHERP</title>
</head>
<body>
	<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl">
			<a class="logo navbar-logo f-l mr-10 hidden-xs"
				href="${pageContext.request.contextPath}/index.do">TEACHERP</a> <a
				aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs"
				href="javascript:;">&#xe667;</a>
			<nav class="nav navbar-nav">
			<ul class="cl">
				<li class="dropDown dropDown_hover"><a href="javascript:;"
					class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i
						class="Hui-iconfont">&#xe6d5;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;"
							onclick="article_add('添加公告','${pageContext.request.contextPath}/article_add.do')"><i
								class="Hui-iconfont">&#xe616;</i> 公告</a></li>
						<li><a href="javascript:;"
							onclick="picture_add('添加学院','picture-add.html')"><i
								class="Hui-iconfont">&#xe613;</i> 学院</a></li>
						<li><a href="javascript:;"
							onclick="member_add('添加用户','member-add.html','','510')"><i
								class="Hui-iconfont">&#xe60d;</i> 用户</a></li>
					</ul>
				<li class="navbar-levelone current"><a href="javascript:;">平台</a></li>
				<li class="navbar-levelone"><a href="javascript:;">学院管理</a></li>
				<li class="navbar-levelone"><a href="javascript:;">招生管理</a></li>
				<li class="navbar-levelone"><a href="javascript:;">就业管理</a></li>
				</li>
			</ul>
			</nav>
			<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
			<ul class="cl">
				<li>超级管理员</li>
				<li class="dropDown dropDown_hover"><a href="#"
					class="dropDown_A">admin <i class="Hui-iconfont">&#xe6d5;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>
						<li><a href="#">切换账户</a></li>
						<li><a href="#">退出</a></li>
					</ul></li>
				<li id="Hui-msg"><a href="#" title="消息"> <span
						class="badge badge-danger">1</span> <i class="Hui-iconfont"
						style="font-size: 18px">&#xe68a;</i>
				</a></li>
				<li id="Hui-skin" class="dropDown right dropDown_hover"><a
					href="javascript:;" class="dropDown_A" title="换肤"> <i
						class="Hui-iconfont" style="font-size: 18px">&#xe62a;</i>
				</a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
						<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
						<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
						<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
						<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
						<li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
					</ul></li>
			</ul>
			</nav>
		</div>
	</div>
	</header>
	<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">
		<dl id="menu-article">
			<dt>
				<i class="Hui-iconfont">&#xe616;</i> 公告管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a
						data-href="${pageContext.request.contextPath}/article_list.do"
						data-title="公告管理" href="javascript:void(0)">公告管理</a></li>
				</ul>
			</dd>
		</dl>

		<dl id="menu-member">
			<dt>
				<i class="Hui-iconfont">&#xe60d;</i> 用户管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li>
					<a
						data-href="${pageContext.request.contextPath}/Admin/List.do"
						data-title="管理员列表" href="javascript:;">管理员列表</a></li>
						<li><a
						data-href="${pageContext.request.contextPath}/User/List.do"
						data-title="用户列表" href="javascript:;">用户列表</a></li>
						
						<li><a
						data-href="${pageContext.request.contextPath}/Department/List.do"
						data-title="部门列表" href="javascript:;">部门列表</a></li>
						<li><a
						data-href="${pageContext.request.contextPath}/PersonallInfo/List.do"
						data-title="个人信息列表" href="javascript:;">个人信息列表</a></li>
				</ul>
			</dd>
		</dl>
		
		
		
		<dl id="menu-system">
			<dt>
				<i class="Hui-iconfont">&#xe62e;</i> 系统管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="${pageContext.request.contextPath}/Content/List.do" data-title="类容管理"
						href="javascript:void(0)">类容管理</a></li>
				</ul>
			</dd>
		</dl>
		
		
		<dl id="menu-Authority">
			<dt>
				<i class="Hui-iconfont">&#xe62e;</i> 权限管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
				<li><a data-href="${pageContext.request.contextPath}/Role/List.do" data-title="角色管理"
						href="javascript:void(0)">角色管理</a></li>
				
					<li><a data-href="${pageContext.request.contextPath}/Menu/List.do" data-title="菜单管理"
						href="javascript:void(0)">菜单管理</a></li>
				</ul>
			</dd>
		</dl>
		
		<dl id="menu-recovery">
			<dt>
				<i class="Hui-iconfont">&#xe62e;</i>回收站<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="${pageContext.request.contextPath}/Content/Content_RecoveryList" data-title="类容回收站"
						href="javascript:void(0)">类容回收站</a></li>
				</ul>
			</dd>
		</dl>
	</div>

	<div class="menu_dropdown bk_2" style="display: none">
		<dl id="menu-aaaaa">
			<dt>
				<i class="Hui-iconfont">&#xe616;</i> 学院管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a
						data-href="${pageContext.request.contextPath}/college_list.do"
						data-title="学院列表" href="javascript:void(0)">学院列表</a></li>
					<li><a
						data-href="${pageContext.request.contextPath}/college_list.do"
						data-title="学院分类" href="javascript:void(0)">学院分类</a></li>
				</ul>
			</dd>
		</dl>
	</div>

	<div class="menu_dropdown bk_2" style="display: none">
		<dl id="menu-bbbbb">
			<dt>
				<i class="Hui-iconfont">&#xe616;</i> 招生管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="admissions-announcement.html"
						data-title="招生公告" href="javascript:void(0)">招生公告</a></li>
					<li><a data-href="admissions-talent.html" data-title="人才培养方案"
						href="javascript:void(0)">人才培养方案</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-bbbbb">
			<dt>
				<i class="Hui-iconfont">&#xe616;</i> 普通高考<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="admissions-general-policy.html"
						data-title="招生政策" href="javascript:void(0)">招生政策</a></li>
					<li><a data-href="admissions-general-plan.html"
						data-title="招生计划" href="javascript:void(0)">招生计划</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-bbbbb">
			<dt>
				<i class="Hui-iconfont">&#xe616;</i> 单独招生<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="admissions-single-policy.html"
						data-title="招生政策" href="javascript:void(0)">招生政策</a></li>
					<li><a data-href="admissions-single-plan.html"
						data-title="招生计划" href="javascript:void(0)">招生计划</a></li>
				</ul>
			</dd>
		</dl>
	</div>

	<div class="menu_dropdown bk_2" style="display: none">
		<dl id="menu-ccccc">
			<dt>
				<i class="Hui-iconfont">&#xe616;</i> 就业管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="employment-announcement.html"
						data-title="就业公告" href="javascript:void(0)">就业公告</a></li>
					<li><a data-href="employment-guide.html" data-title="就业指导"
						href="javascript:void(0)">就业指导</a></li>

				</ul>
			</dd>
		</dl>
	</div>

	</aside>
	<div class="dislpayArrow hidden-xs">
		<a class="pngfix" href="javascript:void(0);"
			onClick="displaynavbar(this)"></a>
	</div>
	<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active"><span title="我的桌面"
					data-href="${pageContext.request.contextPath}/welcome.do">我的桌面</span>
					<em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group">
			<a id="js-tabNav-prev" class="btn radius btn-default size-S"
				href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a
				id="js-tabNav-next" class="btn radius btn-default size-S"
				href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a>
		</div>
	</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display: none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0"
				src="${pageContext.request.contextPath}/welcome.do"></iframe>
		</div>
	</div>
	</section>

	<div class="contextMenu" id="Huiadminmenu">
		<ul>
			<li id="closethis">关闭当前</li>
			<li id="closeall">关闭全部</li>
		</ul>
	</div>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
	<script type="text/javascript">
    $(function () {
        /*$("#min_title_list li").contextMenu('Huiadminmenu', {
            bindings: {
                'closethis': function(t) {
                    console.log(t);
                    if(t.find("i")){
                        t.find("i").trigger("click");
                    }
                },
                'closeall': function(t) {
                    alert('Trigger was '+t.id+'\nAction was Email');
                },
            }
        });*/


        $("body").Huitab({
            tabBar: ".navbar-wrapper .navbar-levelone",
            tabCon: ".Hui-aside .menu_dropdown",
            className: "current",
            index: 0,
        });
    });

    /*个人信息*/
    function myselfinfo() {
        layer.open({
            type: 1,
            area: ['300px', '200px'],
            fix: false, //不固定
            maxmin: true,
            shade: 0.4,
            title: '查看信息',
            content: '<div>管理员信息</div>'
        });
    }

    /*资讯-添加*/
    function article_add(title, url) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*图片-添加*/
    function picture_add(title, url) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*产品-添加*/
    function product_add(title, url) {
        var index = layer.open({
            type: 2,
            title: title,
            content: url
        });
        layer.full(index);
    }

    /*用户-添加*/
    function member_add(title, url, w, h) {
        layer_show(title, url, w, h);
    }


</script>

	<!--此乃百度统计代码，请自行删除-->
	<script>
    var _hmt = _hmt || [];
    (function () {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
	<!--/此乃百度统计代码，请自行删除-->
</body>
</html>