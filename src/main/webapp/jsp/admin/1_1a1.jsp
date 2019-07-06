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
			书名:<input readonly="readonly" type="text" class="first" class="att" name="name" id="name" value="${book.bookName }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			作者:<input type="text" readonly="readonly" class="att" name="author" id="author" value="${book.author }"/><br />
			出版社:<input type="text" readonly="readonly" class="att" name="republish" id="republish" value="${book.publish }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			译者:<input type="text" readonly="readonly" class="att" name="translator" id="translator" value="${book.translator }"/><br />
			ISBN:&nbsp;&nbsp;<input readonly="readonly" type="text" class="att" name="isbn" id="isbn" value="${book.isbn }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			类型:<input type="text" readonly="readonly" class="att" name="booktype" id="booktype" value="${book.bookType }"/><br/>
			入库时间:<input type="date" readonly="readonly" class="att" name="intime" id="intime" value="${book.inTime }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			价格:<input type="text" readonly="readonly" class="att" name="price" id="price" value="${book.price }"/><br />
			存放书架:<input type="text" readonly="readonly" class="att" name="bookcase" id="bookcase" value="${book.bookCase }"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			数量:<input type="text" readonly="readonly" class="att" name="num" id="num" value="${book.num }"/><br />
			页数:<input type="text" readonly="readonly" class="att" name="page" id="page" value="${book.page }"/><br />
		</div>
	</body>
</html>