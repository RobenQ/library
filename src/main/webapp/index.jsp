<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>登录-图书管理系统</title>
	<script src="/library/js/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
	<script src="/library/js/index.js"></script>
	<link rel="stylesheet" href="/library/css/login.css" type="text/css">
</head>
<body id="body">
	<div class="Card">
		<div class="card_top">
			<div class="icon_banner">
			<p>图书借阅（管理）系统</p>
			<p>用户登录</p>
		</div>
		</div>
		<div class="card_bottom">
			<div class="login_content">
				<div class="login_form_area">
					<form id="myform"
						action="/library/login"
						method="post"
						name="addForm" class="login_form">
						<div class="login-account">
							<div class="id_select">
								<select id="select" onchange="gradeChange()">
									<option value="student">账号：</option>
								</select> <span class="select_icon"
									style="display: inline-flex; align-items: center;">&#8203;
									<svg class="Zi Zi--Select Select-arrow" fill="currentColor"
										viewBox="0 0 24 24" width="24" height="24">
                                        <path
											d="M12 16.183l2.716-2.966a.757.757 0 0 1 1.064.001.738.738 0 0 1 0 1.052l-3.247 3.512a.758.758 0 0 1-1.064 0L8.22 14.27a.738.738 0 0 1 0-1.052.758.758 0 0 1 1.063 0L12 16.183zm0-9.365L9.284 9.782a.758.758 0 0 1-1.064 0 .738.738 0 0 1 0-1.052l3.248-3.512a.758.758 0 0 1 1.065 0L15.78 8.73a.738.738 0 0 1 0 1.052.757.757 0 0 1-1.063.001L12 6.818z"
											fill-rule="evenodd">
                                        </path>
                                    </svg>
								</span>
							</div>
							<span class="login-accountSeperator"></span>
							<div class="account_input">
								<input name="ID" id="employeeNum"
									placeholder="请使用正确的账号登录" />
							</div>
						</div>
						<div class="password_content">
							<div class="password_input">
								<div class="password_content_input">
									<input name="password" placeholder="在此输入密码" type="password"
										id="password">
								</div>
							</div>
							<!-- <div class="otherMethorToLogin">
								<a href="">忘记密码</a>
							</div> -->
						</div>
						<button type="button" class="submit" onclick="login()">登录</button>
						<input type="hidden" name="_csrf" value="0.8981100079647797" />
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>