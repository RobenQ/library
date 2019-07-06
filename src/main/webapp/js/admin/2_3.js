function add(){
	var name = document.getElementById("name").value;
	var author = document.getElementById("author").value;
	var sel = document.getElementById("republish");
	var republish = sel[sel.selectedIndex].value;
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
					alert("添加成功！");
					document.getElementById("name").value="";
					document.getElementById("author").value="";
					document.getElementById("republish").value="";
					document.getElementById("translator").value="";
					document.getElementById("isbn").value="";
					document.getElementById("booktype").value="";
					document.getElementById("price").value="";
					document.getElementById("bookcase").value="";
					document.getElementById("num").value="";
					document.getElementById("page").value="";
				}else if(result=='found'){
					alert("该证件号码已经办理借书证！");
				}else if(result=='login'){
					alert("你还没有登录！");
				}else if(result=='error'){
					alert("添加失败！")
				}
			}
		}
		ajax.open("POST","/library/admin/2_3add");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("name="+name+"&author="+author+"&republish="+republish+"&translator="+translator+"&isbn="+isbn+
				"&booktype="+booktype+"&intime="+intime+"&price="+price+"&bookcase="+bookcase+"&num="+num+"&page="+page);
	}	
}

function add2(){
	var name = document.getElementById("name").value;
	var author = document.getElementById("author").value;
	var translator = document.getElementById("translator").value;
	var price = document.getElementById("price").value;
	var bookcase = document.getElementById("bookcase").value;
	var page = document.getElementById("page").value;
	if(name==""||author==""||translator==""||price==""||bookcase==""||page==""){
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
					alert("添加成功！");
					document.getElementById("name").value="";
					document.getElementById("author").value="";
					document.getElementById("translator").value="";
					document.getElementById("price").value="";
					document.getElementById("bookcase").value="";
					document.getElementById("page").value="";
				}else if(result=='found'){
					alert("该身份证号码已经成为了管理员！");
				}else if(result=='login'){
					alert("你还没有登录！");
				}else if(result=='error'){
					alert("添加失败！")
				}
			}
		}
		ajax.open("POST","/library/admin/2_4add");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("name="+name+"&author="+author+"&translator="+translator+"&price="+price+"&bookcase="+bookcase+"&page="+page);
	}	
}