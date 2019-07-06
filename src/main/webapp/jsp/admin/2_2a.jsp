<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_1a.css" rel="stylesheet" />
		<script src="/library/js/admin/2_2a.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="list">
			<table class="table" id="tab">
				<thead>
					<tr class="tr">
						<td style="width: 15%;" class="source">姓名</td>
						<td style="width: 15%;">性别</td>
						<td style="width: 20%;">身份证号码</td>
						<td style="width: 20%;">电话</td>
						<td style="width: 15%;">账号</td>
						<td style="width: 15%;">操作</td>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${admins }" var="admin" varStatus="status">
					<tr class="relative">
						<td class="option">${admin.name }</td>
						<td class="option">${admin.sex }</td>
						<td class="option">${admin.idNo }</td>
						<td class="option">${admin.tel }</td>
						<td class="option">${admin.account }</td>
						<td>
							<button id="btn3" class="btn" uuid="${admin.uuid }" onclick="sc(this)">删除</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>
