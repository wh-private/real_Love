$(document).ready(function(){
	
	$("#login_btn").click(function(){
		$.ajax({
			url:'loginController',
			type:'post',
			data:$("#login").serialize(),
			dataType:'json',
			success:function(data){
				if(data.result == "1"){
					location.href="main.html";//@@@@@@@@@@@@@@@@@@@@
				}else{
					alert("用户名或密码错误");
				}
			}
		})
	});

});