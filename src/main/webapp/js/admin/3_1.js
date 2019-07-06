function ty(btn){
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
				alert("已同意预约人的图书借阅预约！");
				window.location = "/library/admin/to3_1";
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='error'){
				alert("系统错误！")
			}
		}
	}
	ajax.open("POST","/library/admin/ty");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid);	
}

function bh(btn){
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
				alert("已经驳回该图书借阅预约！");
				window.location = "/library/admin/to3_1";
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='error'){
				alert("系统错误！")
			}
		}
	}
	ajax.open("POST","/library/admin/bh");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid);	
}