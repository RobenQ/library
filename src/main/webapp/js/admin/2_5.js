function xg(btn){
	var name = btn.getAttribute("uuid");
	window.location = "/library/admin/2_5xg?name="+name;
}
function tj(){
	window.location = "/library/admin/2_5tj";
}
function tj2(){
	var name = document.getElementById("name").value;
	var author = document.getElementById("author").value;
	if(name==""||author==""){
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
					window.location = "/library/admin/to2_5";
				}else if(result=='login'){
					alert("你还没有登录！");
				}else if(result=='error'){
					alert("修改失败！")
				}else if(result=='found'){
					alert("该类型已存在！")
				}
			}
		}
		ajax.open("POST","/library/admin/2_5tj2");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("&name="+name+"&author="+author);
}	
}

function xg2(btn){
	var uuid = btn.getAttribute("uuid");
	var name = document.getElementById("name").value;
	var author = document.getElementById("author").value;
	if(name==""||author==""){
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
					window.location = "/library/admin/2_5xg?name="+name;
				}else if(result=='login'){
					alert("你还没有登录！");
				}else if(result=='error'){
					alert("修改失败！")
				}else if(result=='found'){
					alert("该类型已存在！")
				}
			}
		}
		ajax.open("POST","/library/admin/2_5xg2");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("uuid="+uuid+"&name="+name+"&author="+author);
	}	
}

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
				window.location = "/library/admin/to2_5";
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='error'){
				alert("删除失败！")
			}
		}
	}
	ajax.open("POST","/library/admin/2_5sc");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid);
}