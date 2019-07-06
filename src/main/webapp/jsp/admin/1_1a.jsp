<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_1a.css" rel="stylesheet" />
		<script src="/library/js/admin/1_1a.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="list">
			<table class="table" id="tab">
				<thead>
					<tr class="tr">
						<td style="width: 15%;" class="source">书名</td>
						<td>类型</td>
						<td>所处书架</td>
						<td style="width: 15%;">作者</td>
						<td style="width: 17%;">出版社</td>
						<td style="width: 20%;">操作</td>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${books }" var="book" varStatus="status">
					<tr class="relative">
						<td class="option">${book.bookName }</td>
						<td class="option">${book.bookType }</td>
						<td class="option">${book.bookCase }</td>
						<td class="option">${book.author }</td>
						<td class="option">${book.publish }</td>
						<td>
							<button id="btn1" class="btn" uuid="${book.uuid }" onclick="xq(this)">详情</button>
							<button id="btn2" class="btn" uuid="${book.uuid }" onclick="xg(this)">修改</button>
							<button id="btn3" class="btn" uuid="${book.uuid }" onclick="sc(this)">删除</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>
