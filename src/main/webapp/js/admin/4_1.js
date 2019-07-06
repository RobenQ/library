function xg(){
	var name = document.getElementById("name").value;
	var author = document.getElementById("author").value;
	var translator = document.getElementById("translator").value;
	var price = document.getElementById("price").value;
	var page = document.getElementById("page").value;
	if(name==""||author==""||translator==""||price==""||page==""){
		alert("请填写完整信息！");
	}else{
		if(window.XMLHttpRequest){
			ajax = new XMLHttpRequest();
		} else {
			ajax = new ActiveXObject("Microsoft.XMLHTTP");
		}
		ajax.onreadystatechange=function(){
			if(ajax.readyState==4&&ajax.status==200){
				var result = ajax.responseText;
				if(result=='ok'){
					alert("修改成功！");
					window.location = "/library/admin/to4_1";
				}else if(result=='login'){
					alert("你还没有登录！");
				}else if(result=='error'){
					alert("修改失败！")
				}
			}
		}
		ajax.open("POST","/library/admin/4_1xg");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("name="+name+"&author="+author+"&translator="+translator+"&price="+price+"&page="+page);
	}	
}

function xg2(){
	var name = document.getElementById("name").value;
	var author = document.getElementById("author").value;
	var translator = document.getElementById("translator").value;
	if(name==""||author==""||translator==""){
		alert("请填写完整信息！");
	}else if(author===translator){
		if(window.XMLHttpRequest){
			ajax = new XMLHttpRequest();
		} else {
			ajax = new ActiveXObject("Microsoft.XMLHTTP");
		}
		ajax.onreadystatechange=function(){
			if(ajax.readyState==4&&ajax.status==200){
				var result = ajax.responseText;
				if(result=='ok'){
					alert("修改成功！");
					document.getElementById("name").value="";
					document.getElementById("author").value="";
					document.getElementById("translator").value="";
				}
				else if(result=='pwdwrong'){
					alert("原密码输入错误！");
				}else if(result=='login'){
					alert("你还没有登录！");
				}else if(result=='error'){
					alert("修改失败！")
				}
			}
		}
		ajax.open("POST","/library/admin/4_2xg");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("name="+name+"&author="+author);
	}else{
		alert("两次输入的新密码不一致！");
	}
}