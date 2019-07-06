function sc(btn){
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
				alert("删除成功！");
				window.location = "/library/admin/to2_2a";
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='error'){
				alert("删除失败！")
			}
		}
	}
	ajax.open("POST","/library/admin/2_2sc");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid);
}