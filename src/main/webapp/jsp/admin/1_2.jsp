<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="/library/css/admin/1_2.css"/>
		<script src="/library/js/admin/1_2.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		<div id="head">
			<input type="button" class="btn" id="btn1" value="新增图书入库" onclick="btn1()"/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" class="btn" id="btn2" value="现有图书入库" onclick="btn2()"/>
		</div>
		<iframe id="ifa" src="/library/admin/to1_2a1" width="100%" height="497px"></iframe>
	</body>
</html>
