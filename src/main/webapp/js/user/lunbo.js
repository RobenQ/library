window.onload = function() {
	var imgs = new Array();
	var container = document.getElementById("pic-container");
	var ul = document.getElementById("ul");
	var picture = ul.getElementsByTagName("li");
	var list = document.getElementById("list").getElementsByTagName("li");
	var btn = document.getElementById("btn");
	var left = document.getElementById("left");
	var right = document.getElementById("right");

	for(var i = 0; i < picture.length; i++) {
		imgs.push(picture[i]);
	}
	index = 0;
	timer = null;
	// 定义并调用自动播放函数
	timer = setInterval(autoPlay, 3000);
	container.onmouseover = function() {
		clearInterval(timer);
		btn.style.display = "inline";
	}

	// 鼠标离开整个容器时继续播放至下一张
	container.onmouseout = function() {
		timer = setInterval(autoPlay, 3000);
		btn.style.display = "none";
	}

	function getByClass1(cls) {
		var res = []; //存放匹配结果的数组
		var e = document.getElementsByTagName("ol");
		var ele = document.getElementsByTagName("li");
		for(var i = 0; i < ele.length; i++) {
			if(ele[i].className == cls) {
				res.push(ele[i]);
			}
		}
		return res;
	}
	left.onclick = function() {
		logo_num = document.getElementById("on").innerText;
		if(logo_num == 1) {
			index = picture.length - 1;
			changePic(index);
		} else {
			index = logo_num*1 - 2;
			changePic(index);
		}
	}

	right.onclick = function() {
		logo_num = document.getElementById("on").innerText;
		if(logo_num == picture.length) {
			index = 0;
			changePic(index);
		} else {
			index = logo_num*1;
			changePic(index);
		}
	}
	// 遍历所有数字导航实现划过切换至对应的图片
	for(var i = 0; i < list.length; i++) {
		list[i].onmouseover = function() {
			clearInterval(timer);
			index = this.innerText - 1;
			changePic(index);
		};
	};

	function autoPlay() {
		if(++index >= picture.length) index = 0;
		changePic(index);
	}

	// 定义图片切换函数
	function changePic(curIndex) {
		for(var i = 0; i < picture.length; ++i) {
			picture[i].style.display = "none";
			list[i].setAttribute("id", " ");
		}

		picture[curIndex].style.display = "block";
		list[curIndex].setAttribute("id", "on");
	}

};