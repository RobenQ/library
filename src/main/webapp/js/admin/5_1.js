function xg(){
	var name = document.getElementById("name").value;
	var author = document.getElementById("adress").value;
	var translator = document.getElementById("tel").value;
	var price = document.getElementById("intime").value;
	var page = document.getElementById("context").value;
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
					window.location = "/library/admin/to5_1";
				}else if(result=='login'){
					alert("你还没有登录！");
				}else if(result=='error'){
					alert("修改失败！")
				}
			}
		}
		ajax.open("POST","/library/admin/5_1xg");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("name="+name+"&author="+author+"&translator="+translator+"&price="+price+"&page="+page);
	}	
}