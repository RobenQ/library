<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>图书管理系统后台管理</title>
		<link rel="stylesheet" href="/library/css/admin/adminFooter.css" />
		<link rel="stylesheet" href="/library/css/admin/adminHeader.css" />
		<script src="/library/js/admin/index.js"></script>
	</head>
	<body>
		<header>
			<div class="logo">
				<a href="toIndex">
					<img src="/library/img/admin/head-logo.png" alt="图书后台管理系统" title="图书后台管理系统" />
				</a>
			</div>
			<div class="title">
				<h2 style="font-size: 40px;margin-left: 10%;">图书后台管理系统</h2>
			</div>
			<div class="user">
				<h5>欢迎管理员【${admin.name }】登录!</h5>
			</div>
		</header>
		<div class="main">
			<div class="mainLeft">
				<div class="main-menu">
				    <ul>
				        <li class="nav-list">
				            <h3 style="background: #FF6201;">图书管理
				                <i></i>
				            </h3>
				            <div class="hide">
				            <h5 onclick="load1_1()">查询</h5>
				            <h5 onclick="load1_2()">添加</h5>
				            <h5 onclick="load1_3()">图书类型管理</h5>
				            </div>
				        </li>
				        <li class="nav-list" >
				            <h3 style="background: #F54809;">用户管理
				                <i></i>
				            </h3>
				            <div class="hide">
				            <h5 onclick="load2_1()">用户信息查询</h5>
				            <h5 onclick="load2_2()">管理员查询</h5>
				            <h5 onclick="load2_3()">添加用户</h5>
				            <h5 onclick="load2_4()">添加管理员</h5>
				            <h5 onclick="load2_5()">用户类型管理</h5>
				            </div>
				        </li>
						<li class="nav-list">
						    <h3 style="background: #FF6201;">借还管理
						        <i></i>
						    </h3>
						    <div class="hide">
						    <h5 onclick="load3_1()">预约审批</h5>
						    <h5 onclick="load3_2()">借书信息查询</h5>
						    <h5 onclick="load3_3()">还书信息</h5>
						    <h5 onclick="load3_4()">未还书籍</h5>
						    </div>
						</li>
						<li class="nav-list">
						    <h3 style="background: #F54809;">个人中心
						        <i></i>
						    </h3>
						    <div class="hide">
						    <h5 onclick="load4_1()">个人信息修改</h5>
						    <h5 onclick="load4_2()">修改密码</h5>
						    </div>
						</li>
						<li class="nav-list">
						    <h3 style="background: #FF6201;">系统设置
						        <i></i>
						    </h3>
						    <div class="hide">
						    <h5 onclick="load5_1()">图书馆信息修改</h5>
						    </div>
						</li>
				    </ul>
				</div>
			</div>
			<div class="mainRight" id="main">
				<iframe class="child" id="child" src="/library/admin/to1_1">			
				</iframe>
			</div>
		</div>
		<footer>
			<div class="foot">
				<p>知识改变命运，细节决定成败!</p>
				<p>我参透自己的风格，这世间没有一条绝对准则。&nbsp;&nbsp;——&nbsp;&nbsp;<a href="https://github.com/RobenQ">哎Coding</a></p>
				<p>赣ICP备19003320号&nbsp;&nbsp;&nbsp;&nbsp;</p>
			</div>
		</footer>
		<script>
		    var oList=document.querySelectorAll('.nav-list h3'),
		    oHide=document.querySelectorAll('.hide'),
		    oIcon=document.querySelectorAll('.nav-list i');//获取css中的元素
		    lastIdnex=0;//上一次点击下标
		    for(var i=0;i<oList.length;i++)
		    {
		        oList[i].index=i;//自定义属性保存下标
		        oList[i].isClick=false;//没有被点击
		        oList[i].onclick=function() {//点击事件->执行函数
		            //清除上一次下标
					
		            oHide[lastIdnex].style.height='0';//改变hide高度
		            oList[lastIdnex].className= '';//改变颜色
		            oIcon[lastIdnex].className= '';//修改角度
		            if(this.isClick){//被点了
		                this.isClick=false;//开关变化
		            }
		            else
		            {
						if (this.index==0) {
							 oHide[this.index].style.height='116px';//改变hide高度
						} else if(this.index==1){
							oHide[this.index].style.height='192px';//改变hide高度
						} else if(this.index==2){
							oHide[this.index].style.height='155px';//改变hide高度
						} else if(this.index==3){
							oHide[this.index].style.height='77px';//改变hide高度
						} else if(this.index==4){
							oHide[this.index].style.height='77px';//改变hide高度
						}
		                //设置当前下标
		               
		                oList[this.index].className= 'on';//改变颜色
		                oIcon[this.index].className= 'on';//修改角度
		
		                oList[lastIdnex].isClick=false;//清除上一次开关
		                oList[this.index].isClick=true;//开关变化
		                lastIdnex=this.index;//保存当前下标
		                
		            }
		        }
		    }
		</script>
	</body>
</html>