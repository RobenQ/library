<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link href="/library/css/admin/1_2a1.css" rel="stylesheet" />
		<script src="/library/js/admin/2_3.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="list">
			姓名:<input type="text" class="first" class="att" name="name" id="name"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			性别:<!-- <input type="text" class="att" name="author" id="author"/><br /> -->
			<input type="radio" class="att" name="author" id="author" value="男" checked="checked"/>&nbsp;&nbsp;&nbsp;男
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="radio" class="att" name="author" id="author" value="女" />&nbsp;&nbsp;&nbsp;女<br />
			读者类型:<select name="republish" class="sel" id="republish">
				<c:forEach items="${userTypes }" var="userType" varStatus="status">
					<option value="${userType.typeName }">${userType.typeName }</option>
				</c:forEach>
			</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			电话:<input type="text" class="att" name="translator" id="translator"/><br />
			借书证编号:&nbsp;&nbsp;<input type="text" class="att" name="isbn" id="isbn"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			证件类型:<input type="text" class="att" name="booktype" id="booktype"/><br/>
			办理时间:<input type="date" class="att" name="intime" id="intime"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			证件号码:<input type="text" class="att" name="price" id="price"/><br />
			登录密码:<input type="password" class="att" name="bookcase" id="bookcase"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			可借阅数量:<input type="text" class="att" name="num" id="num"/><br />
			账号:<input type="text" class="att" name="page" id="page"/><br />
			<button id="btn" onclick="add()">确认添加</button>
		</div>
	</body>
</html>