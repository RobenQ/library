function search(){
	var sel = document.getElementById("sel");
	var tiaojian = sel[sel.selectedIndex].value;
	var name = document.getElementById("name").value;
	var ifa = document.getElementById("ifa");
	ifa.src = "/library/user/to2aa?tiaojian="+tiaojian+"&name="+name;
}