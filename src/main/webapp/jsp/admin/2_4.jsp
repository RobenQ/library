<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_2a1.css" rel="stylesheet" />
		<script src="/library/js/admin/2_3.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="list">
			姓名:<input type="text" class="first" class="att" name="name" id="name"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			性别:<input type="text" class="att" name="author" id="author"/><br />
			电话:<input type="text" class="att" name="translator" id="translator"/><br />
			证件号码:<input type="text" class="att" name="price" id="price"/><br />
			登录密码:<input type="password" class="att" name="bookcase" id="bookcase"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			账号:<input type="text" class="att" name="page" id="page"/><br />
			<button id="btn" onclick="add2()">确认添加</button>
		</div>
	</body>
</html>