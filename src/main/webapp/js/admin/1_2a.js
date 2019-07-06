function add1(){
	var name = document.getElementById("name").value;
	var author = document.getElementById("author").value;
	var republish = document.getElementById("republish").value;
	var translator = document.getElementById("translator").value;
	var isbn = document.getElementById("isbn").value;
	var sel = document.getElementById("bookType");
	var booktype = sel[sel.selectedIndex].value;
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
					alert("书库中已存在相同ISBN的图书\n请检查ISBN是否输入有误\n或者选择“现有图书入库”进行添加。");
				}else if(result=='login'){
					alert("你还没有登录！");
				}else if(result=='error'){
					alert("添加失败！")
				}
			}
		}
		ajax.open("POST","/library/admin/add1");
		ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		ajax.send("name="+name+"&author="+author+"&republish="+republish+"&translator="+translator+"&isbn="+isbn+
				"&booktype="+booktype+"&intime="+intime+"&price="+price+"&bookcase="+bookcase+"&num="+num+"&page="+page);
	}	
}

function add2(){
	var isbn = document.getElementById("isbn").value;
	var num = document.getElementById("num").value;
	var intime = document.getElementById("intime").value;
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
				var num = document.getElementById("num").innerHTML="";
			}else if(result=='login'){
				alert("你还没有登录！");
			}else if(result=='notfound'){
				alert("书库中不存在与该ISBN相同的图书\n请检查ISBN是否输入有误\n或者选择“新增图书入库”进行添加。");
			}else if(result=='error'){
				alert("添加失败！")
			}
		}
	}
	ajax.open("POST","/library/admin/add2");
	ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	ajax.send("intime="+intime+"&isbn="+isbn+"&num="+num);
}