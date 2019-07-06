<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_2a1.css" rel="stylesheet" />
		<script src="/library/js/admin/4_1.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="list">
			原密码:<input type="password" class="first" class="att" name="name" id="name"/><br />
			新密码:<input type="password" class="att" name="author" id="author"/><br />
			确认新密码:<input type="password" class="att" name="translator" id="translator"/><br />
			<button id="btn" onclick="xg2()">确认修改</button>
		</div>
	</body>
</html>