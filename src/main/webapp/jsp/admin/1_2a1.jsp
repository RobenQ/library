<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_2a1.css" rel="stylesheet" />
		<script src="/library/js/admin/1_2a.js" type="application/javascript"></script>
	</head>
	<body>
		<div class="list">
			书名:<input type="text" class="first" class="att" name="name" id="name" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			作者:<input type="text" class="att" name="author" id="author" /><br />
			出版社:<input type="text" class="att" name="republish" id="republish" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			译者:<input type="text" class="att" name="translator" id="translator" /><br />
			ISBN:&nbsp;&nbsp;<input type="text" class="att" name="isbn" id="isbn" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			类型:<select name="bookType" class="sel" id="bookType">
				<c:forEach items="${bookTypes }" var="Type" varStatus="status">
					<option value="${Type.typeName }">${Type.typeName }</option>
				</c:forEach>
			</select><br />
			入库时间:<input type="date" class="att" name="intime" id="intime" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			价格:<input type="text" class="att" name="price" id="price" /><br />
			存放书架:<input type="text" class="att" name="bookcase" id="bookcase" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			数量:<input type="text" class="att" name="num" id="num" /><br />
			页数:<input type="text" class="att" name="page" id="page" /><br />
			<button id="btn" onclick="add1()">确认入库</button>
		</div>
	</body>
</html>