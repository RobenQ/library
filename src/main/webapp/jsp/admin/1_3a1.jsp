<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_2a1.css" rel="stylesheet" />
		<script src="/library/js/admin/1_3.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="list">
			类型名称:<input type="text" class="first" class="att" name="name" id="name" value="${bookType.typeName }"/><br />
			可借阅天数:<input type="text" class="att" name="author" id="author" value="${bookType.days }"/><br />
			<button id="btn" uuid="${bookType.uuid }" onclick="xg2(this)">确认修改</button>
		</div>
	</body>
</html>