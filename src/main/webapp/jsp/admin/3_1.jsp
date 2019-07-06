<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_1a.css" rel="stylesheet" />
		<script src="/library/js/admin/3_1.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="list">
			<table class="table" id="tab">
				<thead>
					<tr class="tr">
						<td style="width: 15%;" class="source">预约人姓名</td>
						<td>预约时间</td>
						<td>书籍名称</td>
						<td style="width: 15%;">读者类型</td>
						<td style="width: 17%;">书籍类型</td>
						<td style="width: 20%;">操作</td>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${appointments }" var="appointment" varStatus="status">
					<tr class="relative">
						<td class="option">${appointment.userId.name }</td>
						<td class="option">${appointment.appointmentTime }</td>
						<td class="option">${appointment.bookUuid.bookName }</td>
						<td class="option">${appointment.userId.readType }</td>
						<td class="option">${appointment.bookUuid.bookType }</td>
						<td>
							<button id="btn1" class="btn" uuid="${appointment.uuid }" onclick="ty(this)">同意</button>
							<button id="btn2" class="btn" uuid="${appointment.uuid }" onclick="bh(this)">驳回</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>
