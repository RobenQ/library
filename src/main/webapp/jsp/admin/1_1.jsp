<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="/library/css/admin/1_1.css"/>
		<script src="/library/js/admin/1_1.js" type="text/javascript"></script>
	</head>
	<body>
		<div id="head">
			<span id="option" class="context">
				查询条件：
			</span>
			<select id="sel" class="context">
				<option value ="1">全部</option>
				<option value ="2">图书类型</option>
				<option value ="3">书名</option>
				<option value ="4">作者</option>
				<option value ="5">ISBN</option>
				<option value ="6">出版社</option>
			</select>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" id="name" class="context" />
			&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" id="btn" value="查询" class="context" onclick="search()"/>
		</div>
		<iframe id="ifa" src="/library/admin/to1_1a" width="100%" height="497px"></iframe>
	</body>
</html>