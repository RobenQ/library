<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="/library/css/admin/1_1.css"/>
		<script src="/library/js/admin/3_4.js" type="text/javascript"></script>
	</head>
	<body>
		<div id="head">
			<span id="option" class="context">
				查询条件：
			</span>
			<select id="sel" class="context">
				<option value ="1">全部</option>
				<option value ="2">借阅者姓名</option>
				<option value ="3">书名</option>
				<option value ="4">作者</option>
				<option value ="5">未归还图书</option>
				<option value ="6">已归还图书</option>
			</select>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="text" id="name" class="context" />
			&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="button" id="btn" value="查询" class="context" onclick="search()"/>
		</div>
		<iframe id="ifa" src="/library/admin/3_2a" width="100%" height="497px"></iframe>
	</body>
</html>