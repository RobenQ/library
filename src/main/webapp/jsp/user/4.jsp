<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link href="/library/css/user/4.css" rel="stylesheet" />
	</head>
	<body>
		<div class="list">
			图书馆名称:&nbsp;&nbsp;<input type="text" readonly="readonly" class="att" name="name" id="name" value="${libraryMsg.name }"/><br />
			地址:<input type="text" readonly="readonly" class="att" name="adress" id="adress" value="${libraryMsg.adress }"/><br />
			联系电话:<input type="text" readonly="readonly" class="att" name="tel" id="tel" value="${libraryMsg.tel }"/><br />
			建馆时间:<input type="date" readonly="readonly" class="att" name="intime" id="intime" value="${libraryMsg.buildTime }"/><br />
			简介:<textarea id="context" readonly="readonly" name="context">${libraryMsg.msg }</textarea>
		</div>
	</body>
</html>
