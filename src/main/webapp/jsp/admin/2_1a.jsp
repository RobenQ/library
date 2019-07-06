<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_1a.css" rel="stylesheet" />
		<script src="/library/js/admin/2_1a.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="list">
			<table class="table" id="tab">
				<thead>
					<tr class="tr">
						<td style="width: 15%;" class="source">姓名</td>
						<td>性别</td>
						<td>读者类型</td>
						<td style="width: 15%;">电话</td>
						<td style="width: 17%;">借阅数量</td>
						<td style="width: 20%;">操作</td>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${users }" var="user" varStatus="status">
					<tr class="relative">
						<td class="option">${user.name }</td>
						<td class="option">${user.sex }</td>
						<td class="option">${user.readType }</td>
						<td class="option">${user.tel }</td>
						<td class="option">${user.bollowed }</td>
						<td>
							<button id="btn1" class="btn" uuid="${user.id }" onclick="xq(this)">详情</button>
							<button id="btn2" class="btn" uuid="${user.id }" onclick="xg(this)">修改</button>
							<button id="btn3" class="btn" uuid="${user.id }" onclick="sc(this)">删除</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>
