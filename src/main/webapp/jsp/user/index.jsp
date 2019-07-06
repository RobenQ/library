<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>图书馆借阅系统</title>
		<link rel="stylesheet" href="/library/css/user/main.css" />
		<link rel="stylesheet"href="/library/css/user/footer.css" />
		<link rel="stylesheet"href="/library/css/user/header.css" />
		<link rel="stylesheet"href="/library/css/user/lunbo.css" />
	</head>

	<body>
		<div class="wrapper">
		<header>
			<div class="logo">
				<a href="toIndex">
					<img src="/library/img/admin/head-logo.png" alt="图书馆借阅系统" title="图书馆借阅系统" />
				</a>
			</div>
			<div class="title">
				<h2 style="font-size: 40px;">图书馆借阅系统</h2>
			</div>
			<div class="nav">
				<ul class="nav-ul">
					<li class="left navli">
						<h3><a href="/library/user/toIndex" class="nav-a">首页</a></h3>
					</li>
					<li class="left navli" onmouseover="show('ul1')" onmouseout="disappear('ul1')">
						<h3><a onclick="load2()" class="nav-a">图书借阅</a></h3>
					</li>
					<li class="left navli" onmouseover="show('ul4')" onmouseout="disappear('ul4')">
						<h3><a href="#" class="nav-a">个人中心</a></h3>
						<ul class="no" id="ul4">
							<li>
								<a onclick="load3_1()">个人信息</a>
							</li>
							<li>
								<a onclick="load3_2()">修改密码</a>
							</li>
							<li>
								<a onclick="load3_3()">借阅记录</a>
							</li>
						</ul>
					</li>
					<li class="left navli" onmouseover="show('ul5')" onmouseout="disappear('ul5')">
						<h3><a onclick="load4()" class="nav-a">关于图书馆</a></h3>
						<ul class="no" id="ul5">
						</ul>
					</li>
				</ul>
			</div>
		</header>
		<iframe id="ifa" src="/library/user/to1">
			
		</iframe>
		<footer>
			<div class="foot">
			<p>赣ICP备19003320号&nbsp;&nbsp;&nbsp;&nbsp;</p>
				<p>我参透自己的风格，这世间没有一条绝对准则。&nbsp;&nbsp;——&nbsp;&nbsp;<a href="https://github.com/RobenQ">哎Coding</a></p>
			</div>
		</footer>
		</div>
	</body>
	<script src="/library/js/user/main.js"></script>
	<script src="/library/js/user/index.js"></script>
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
</html>