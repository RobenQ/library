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
			借阅者姓名:<input readonly="readonly" type="text" class="first" class="att" name="name" id="name" value="${bollow.userId.name }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			借阅者类型:<input type="text" readonly="readonly" class="att" name="author" id="author" value="${bollow.userId.readType }"/><br />
			借阅者性别:<input type="text" readonly="readonly" class="att" name="republish" id="republish" value="${bollow.userId.sex }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			图书名称:<input type="text" readonly="readonly" class="att" name="translator" id="translator" value="${bollow.bookUuid.bookName }"/><br />
			图书类型:<input readonly="readonly" type="text" class="att" name="isbn" id="isbn" value="${bollow.bookUuid.bookType }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			借阅时间:<input type="date" readonly="readonly" class="att" name="booktype" id="booktype" value="${bollow.outTime }"/><br/>
			应还时间:<input type="date" readonly="readonly" class="att" name="intime" id="intime" value="${bollow.shouldTime }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			实还时间:<input type="date" readonly="readonly" class="att" name="price" id="price" value="${bollow.factTime }"/><br />
			图书价格:<input type="text" readonly="readonly" class="att" name="bookcase" id="bookcase" value="${bollow.bookUuid.price }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			存放书架:<input type="text" readonly="readonly" class="att" name="num" id="num" value="${bollow.bookUuid.bookCase }"/><br />
			图书页数:<input type="text" readonly="readonly" class="att" name="page" id="page" value="${bollow.bookUuid.page }"/><br />
		</div>
	</body>
</html>