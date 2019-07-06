<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_2a1.css" rel="stylesheet" />
	</head>
	<body>
		<div class="list">
			姓名:<input readonly="readonly" type="text" class="first" class="att" name="name" id="name" value="${user.name }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			性别:<input type="text" readonly="readonly" class="att" name="author" id="author" value="${user.sex }"/><br />
			读者类型:<input type="text" readonly="readonly" class="att" name="republish" id="republish" value="${user.readType }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			电话:<input type="text" readonly="readonly" class="att" name="translator" id="translator" value="${user.tel }"/><br />
			借书证编号:&nbsp;&nbsp;<input readonly="readonly" type="text" class="att" name="isbn" id="isbn" value="${user.barcode }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			证件类型:<input type="text" readonly="readonly" class="att" name="booktype" id="booktype" value="${user.paperType }"/><br/>
			办理时间:<input type="date" readonly="readonly" class="att" name="intime" id="intime" value="${user.inTime }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			证件号码:<input type="text" readonly="readonly" class="att" name="price" id="price" value="${user.paperNo }"/><br />
			操作员:<input type="text" readonly="readonly" class="att" name="bookcase" id="bookcase" value="${user.operator }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			借阅数量:<input type="text" readonly="readonly" class="att" name="num" id="num" value="${user.num }"/><br />
			账号:<input type="text" readonly="readonly" class="att" name="page" id="page" value="${user.account }"/><br />
		</div>
	</body>
</html>