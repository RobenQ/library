<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/user/3_3.css" rel="stylesheet" />
		<script src="/library/js/user/3_3.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		<div class="list">
			<p style="margin-left: 50px;font-size: 30px;">预约中图书：</p><hr />
			<table class="table" id="tab">
				<thead>
					<tr class="tr">
						<td style="width: 20%;" class="source">书名</td>
						<td style="width: 20%;">类型</td>
						<td style="width: 20%;">预约时间</td>
						<td style="width: 10%;">可借阅时间(天)</td>
						<td style="width: 20%;">预约编号</td>
						<td style="width: 10%;">操作</td>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${appointments }" var="appointment" varStatus="status">
					<tr class="relative">
						<td class="option">${appointment.bookUuid.bookName }</td>
						<td class="option">${appointment.bookUuid.bookType }</td>
						<td class="option">${appointment.appointmentTime }</td>
						<td class="option">${bookTypes[status.count-1].days }</td>
						<td class="option">${appointment.uuid }</td>
						<td>
							<button id="btn1" class="btn" uuid="${appointment.uuid }" onclick="qxyy(this)">取消预约</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="list">
			<p style="margin-left: 50px;font-size: 30px;">未归还图书：</p><hr />
			<table class="table" id="tab">
				<thead>
					<tr class="tr">
						<td style="width: 20%;" class="source">书名</td>
						<td style="width: 20%;">类型</td>
						<td style="width: 20%;">借阅时间</td>
						<td style="width: 10%;">应归还时间</td>
						<td style="width: 20%;">借阅编号</td>
						<td style="width: 10%;">操作</td>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${bollows }" var="bollow" varStatus="status">
					<tr class="relative">
						<td class="option">${bollow.bookUuid.bookName }</td>
						<td class="option">${bollow.bookUuid.bookType }</td>
						<td class="option">${bollow.outTime }</td>
						<td class="option">${bollow.shouldTime }</td>
						<td class="option">${bollow.uuid }</td>
						<td>
							<button id="btn1" class="btn" uuid="${bollow.bookUuid.uuid }" onclick="xj(this)">续借</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="list">
			<p style="margin-left: 50px;font-size: 30px;">已归还图书：</p><hr />
			<table class="table" id="tab">
				<thead>
					<tr class="tr">
						<td style="width: 20%;" class="source">书名</td>
						<td style="width: 20%;">类型</td>
						<td style="width: 20%;">借阅时间</td>
						<td style="width: 20%;">应归还时间</td>
						<td style="width: 20%;">实际归还时间</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${bollows2 }" var="bollow2" varStatus="status">
					<tr class="relative">
						<td class="option">${bollow2.bookUuid.bookName }</td>
						<td class="option">${bollow2.bookUuid.bookType }</td>
						<td class="option">${bollow2.outTime }</td>
						<td class="option">${bollow2.shouldTime }</td>
						<td class="option">${bollow2.factTime }</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>