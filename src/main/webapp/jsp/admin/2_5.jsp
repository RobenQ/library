<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_1a.css" rel="stylesheet" />
		<script src="/library/js/admin/2_5.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="list">
			<table class="table" id="tab">
				<thead>
					<tr class="tr">
						<td style="width: 25%;" class="source">类型唯一标识编号</td>
						<td style="width: 25%;">类型名称</td>
						<td style="width: 25%;">可借阅图书数量（本）</td>
						<td style="width: 25%;">操作</td>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${userTypes }" var="userType" varStatus="status">
					<tr class="relative">
						<td class="option">${userType.uuid }</td>
						<td class="option">${userType.typeName }</td>
						<td class="option">${userType.num }</td>
						<td>
							<button id="btn2" class="btn" uuid="${userType.typeName }" onclick="xg(this)">修改</button>
							<button id="btn3" class="btn" uuid="${userType.uuid }" onclick="sc(this)">删除</button>
							<button id="btn3" class="btn" onclick="tj()">添加</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>
