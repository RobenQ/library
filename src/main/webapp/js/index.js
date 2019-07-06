function login(){
	var account = document.getElementById("employeeNum").value;
	var pwd = document.getElementById("password").value;
	if (account == "") {
		alert("你还没有输入账号！");
		addForm.name.focus();
		return;
	}else if(addForm.password.value == "") {
			alert("请填写密码！");
			addForm.password.focus();
			return;
	}else {
		if(window.XMLHttpRequest){
			ajax = new XMLHttpRequest();
		} else {
			ajax = new ActiveXObject("Microsoft.XMLHTTP");
		}
		ajax.onreadystatechange=function(){
			if(ajax.readyState==4&&ajax.status==200){
				var result = ajax.responseText;
				if(result=='user'){
					window.location = "/library/user/toIndex";
				}else if(result=='admin'){
					window.location = "/library/admin/toIndex";
				}else if(result=='error'){
					alert("账号或密码错误！")
				}
			}
		}
		ajax.open("POST","/library/login");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("account="+account+"&pwd="+pwd);
	}
}