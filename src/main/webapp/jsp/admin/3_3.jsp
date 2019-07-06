<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/3_4.css" rel="stylesheet" />
		<script src="/library/js/admin/3_4.js" type="text/javascript" charset="utf-8"></script>
	</head>
	<body>
		<div class="list">
			<table class="table" id="tab">
				<thead>
					<tr class="tr">
						<td style="width: 15%;" class="source">借阅者姓名</td>
						<td style="width: 15%;">书名</td>
						<td style="width: 15%;">借阅时间</td>
						<td style="width: 20%;">应还时间</td>
						<td style="width: 20%;">实际归还时间</td>
						<td style="width: 15%;">操作</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${bollows }" var="bollow" varStatus="status">
					<tr class="relative">
						<td class="option">${bollow.userId.name }</td>
						<td class="option">${bollow.bookUuid.bookName }</td>
						<td class="option">${bollow.outTime }</td>
						<td class="option">${bollow.shouldTime }</td>
						<td class="option">${bollow.factTime }</td>
						<td>
							<button id="btn1" class="btn" uuid="${bollow.uuid }" onclick="xq3_3(this)">详情</button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>