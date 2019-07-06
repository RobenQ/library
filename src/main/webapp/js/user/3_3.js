function qxyy(btn){
	var uuid = btn.getAttribute("uuid");
	if(window.XMLHttpRequest){
		ajax = new XMLHttpRequest();
	} else {
		ajax = new ActiveXObject("Microsoft.XMLHTTP");
	}
	ajax.onreadystatechange=function(){
		if(ajax.readyState==4&&ajax.status==200){
			var result = ajax.responseText;
			if(result=='ok'){
				alert("取消预约成功！");
				window.location = "/library/user/to3_3";
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='error'){
				alert("系统错误！取消预约失败。")
			}
		}
	}
	ajax.open("POST","/library/user/qxyy");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid);
}

function xj(btn){
	var uuid = btn.getAttribute("uuid");
	if(window.XMLHttpRequest){
		ajax = new XMLHttpRequest();
	} else {
		ajax = new ActiveXObject("Microsoft.XMLHTTP");
	}
	ajax.onreadystatechange=function(){
		if(ajax.readyState==4&&ajax.status==200){
			var result = ajax.responseText;
			if(result=='ok'){
				alert("续借成功！");
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='error'){
				alert("续借失败！")
			}else if(result=='notenough'){
				alert("此书已经不能再续借！")
			}else if(result=='bollowenough'){
				alert("你的借阅数量已达到数量限制！")
			}
		}
	}
	ajax.open("POST","/library/user/yuyue");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid);
}