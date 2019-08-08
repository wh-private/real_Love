 var msgTips = new Array();
var errTips = new Array();

msgTips['ok'] = '<div class="ok">正确</div>';
msgTips['error'] = '<div class="error">错误</div>';
msgTips['account'] = '请填写您的注册邮箱或手机号';
msgTips['regMobile'] = '请填写您的注册手机号';
msgTips['regEmail'] = '请填写您的注册邮箱';
msgTips['password'] = '请填写您的注册密码';
msgTips['nikename'] = '请填写昵称';
msgTips['mobile'] = '请输入您的手机号';
msgTips['mybirth'] = '请选择您的生日';
msgTips['mycity'] = '请输入您所在地区';
errTips['regEmail'] = '请填写正确邮箱';
errTips['password'] = '请输入6-16位英文或数字';
errTips['qrpassword'] = '请填写您的确认密码';
errTips['nikename'] = '最多可输入12个汉字、字母或数字';
errTips['mobile'] = '请输入正确的手机号';
errTips['mybirth'] = '请选择您的生日';
errTips['mycity'] = '请输入您所在地区';

var email = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/;
// 邮件
var loginEmail = "^[_a-zA-Z0-9\\-]+(\\.[_a-zA-Z0-9\\-]*)*@[A-Za-z0-9\\-_]+(((\\._-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+)+$";
//登录邮件验证规则
 
var password = /^[a-zA-Z0-9]{6,16}$/;

var nikename = /^[\u4E00-\u9FA5a-zA-Z0-9_]{1,12}$/;

$(document).ready(function() {

	var boolean = false;

	//邮箱
	$("#email").focus(function() {
		$("#account_msg").html(msgTips['regEmail']);
		$("#account_msg").css({display:"block",color:"#999999"});
	});
	$("#email").blur(function() {
		
		//获取邮箱input值
		var yx = $("#email").val();
		
		if(email.test(yx)){
			$("#account_msg").css("display","none");
			boolean = true;
		}else{
			$("#account_msg").html("请填写正确邮箱");
			$("#account_msg").css("color", "red");
		}
		
	});
	//密码
	$("#password").focus(function() {
		$("#password_msg").html(errTips['password']);
		$("#password_msg").css({display:"block",color:"#999999"});
	});
	$("#password").blur(function() {
		var mm = $("#password").val();
		
		if(password.test(mm)){
			$("#password_msg").css("display","none");
			boolean = true;
		}else{
			$("#password_msg").html("密码格式错误");
			$("#password_msg").css("color", "red");
		}
	});
	//确认密码
	$("#qrpassword").focus(function() {
		$("#qrpassword_msg").html(msgTips['regEmail']);
		$("#qrpassword_msg").css({display:"block",color:"#999999"});
	});
	$("#qrpassword").blur(function() {
		if($("#password").val() == $("#qrpassword").val()){
			$("#qrpassword_msg").css("display","none");
			boolean = true;
		}else{
			$("#qrpassword_msg").html("两次密码不一致");
			$("#qrpassword_msg").css("color", "red");
		}
	});
	//昵称
	$("#nikename").focus(function() {
		$("#nikename_msg").html(errTips['nikename']);
		$("#nikename_msg").css({display:"block",color:"#999999"});
	});
	$("#nikename").blur(function() {
		
		var nc = $("#nikename").val();
		
		if(nikename.test(nc)){
			$("#nikename_msg").css("display","none");
			boolean = true;
		}else{
			$("#nikename_msg").html("昵称格式错误");
			$("#nikename_msg").css("color", "red");
		}
	});
	
	
	
	
$("#date").selectDate()
	
	$("#days").focusout(function() {
		var year = $("#year option:selected").val()
		var month = $("#month option:selected").val()
		var day = $("#days option:selected").val()
		console.log(year +"-"+ month +"-"+ day)
		$("#birthday").val(year +"-"+ month +"-"+ day);
	})


	
	$("#country").focusout(function() {
		var province = $("#province option:selected").val()
		var city = $("#city option:selected").val()
		var country = $("#country option:selected").val()
		console.log(province +"-"+ city +"-"+ country)
		$("#region").val(province +"-"+ city +"-"+ country);
	})
	
	
	
	
	
	
	//注册按钮
	$("#register_btn").click(function(){
		if(boolean == false){
			alert("失败");
			return;
		}else{
			$.ajax({
				url:'saveuserController',
				type:'post',
				data:$("#singup").serialize(),
				dataType:'json',
				success:function(data){
					alert(data.result);
				}
			})
		}
		
		
	});
	



});
