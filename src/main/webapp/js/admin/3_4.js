function hs(btn){
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
				alert("还书成功！");
				window.location = "/library/admin/to3_4";
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='error'){
				alert("系统错误！还书失败。")
			}
		}
	}
	ajax.open("POST","/library/admin/hs");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("uuid="+uuid);
}

function xq3_3(btn){
	var uuid = btn.getAttribute("uuid");
	window.location = "/library/admin/3_3xq?uuid="+uuid;
}
function search(){
	var sel = document.getElementById("sel");
	var tiaojian = sel[sel.selectedIndex].value;
	var name = document.getElementById("name").value;
	var ifa = document.getElementById("ifa");
	ifa.src = "/library/admin/3_2aa?tiaojian="+tiaojian+"&name="+name;
}