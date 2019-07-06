function xq(btn){
	var uuid = btn.getAttribute("uuid");
//	var ifa = document.getElementById("ifa");
	window.location = "/library/admin/2_1xq?uuid="+uuid;
}

function xg(btn){
	var uuid = btn.getAttribute("uuid");
	window.location = "/library/admin/2_1xg?uuid="+uuid;
}

function xg2(btn){
	var uuid = btn.getAttribute("uuid");
	var name = document.getElementById("name").value;
	var author = document.getElementById("author").value;
	var republish = document.getElementById("republish").value;
	var translator = document.getElementById("translator").value;
	var isbn = document.getElementById("isbn").value;
	var booktype = document.getElementById("booktype").value;
	var intime = document.getElementById("intime").value;
	var price = document.getElementById("price").value;
	var bookcase = document.getElementById("bookcase").value;
	var num = document.getElementById("num").value;
	var page = document.getElementById("page").value;
	if(name==""||author==""||republish==""||translator==""||isbn==""||booktype==""||intime==""||price==""||bookcase==""||num==""||page==""){
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
					window.location = "/library/admin/2_1xg?uuid="+uuid;
				}else if(result=='login'){
					alert("你还没有登录！");
				}else if(result=='error'){
					alert("修改失败！")
				}
			}
		}
		ajax.open("POST","/library/admin/2_1xg2");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("uuid="+uuid+"&name="+name+"&author="+author+"&republish="+republish+"&translator="+translator+"&isbn="+isbn+
				"&booktype="+booktype+"&intime="+intime+"&price="+price+"&bookcase="+bookcase+"&num="+num+"&page="+page);
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
				window.location = "/library/admin/to2_1a";
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='error'){
				alert("删除失败！")
			}
		}
	}
	ajax.open("POST","/library/admin/2_1sc");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid);
}