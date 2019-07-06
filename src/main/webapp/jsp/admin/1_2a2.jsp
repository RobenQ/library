<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="/library/css/admin/1_2a1.css"/>
		<script src="/library/js/admin/1_2a.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		<div class="list">
			ISBN:&nbsp;&nbsp;<input type="text" class="att" name="isbn" id="isbn" /><br />
			增加数量:<input type="text" class="att" name="num" id="num" /><br />
			入库时间:<input type="date" class="att" name="intime" id="intime" /><br />
			<button id="btn" onclick="add2()">添加</button>
		</div>
	</body>
</html>
