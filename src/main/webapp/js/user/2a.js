function xq(btn){
	var uuid = btn.getAttribute("uuid");
//	var ifa = document.getElementById("ifa");
	window.location = "/library/user/xq?uuid="+uuid;
}

function yuyue(btn){
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
				alert("预约成功！");
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='error'){
				alert("预约失败！")
			}else if(result=='notenough'){
				alert("此书已经全部借出！")
			}else if(result=='bollowenough'){
				alert("你的借阅数量已达到数量限制！")
			}
		}
	}
	ajax.open("POST","/library/user/yuyue");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid);
}