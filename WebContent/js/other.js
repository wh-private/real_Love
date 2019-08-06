$(document).ready(function(){
	
	//解析uid，留着备用
	var str = location.href.substr(location.href.indexOf('?')+1);
	var arr = str.split('&');
	var uid;
	var myid;
	for(var i=0;i<arr.length;i++){
		if(arr[i].indexOf('uid')>-1){
			uid = arr[i].substr(arr[i].indexOf('=')+1);
		}
		if(arr[i].indexOf('myid')>-1){
			myid = arr[i].substr(arr[i].indexOf('=')+1);
		}
	}
	//显示更多信息的一个小按钮
	$("#more").click(function(){
		$("#moreinfo").css("display","block");
		$("#more").remove();
	})
	
	function getDate(){
		Date.prototype.format = function(fmt) { 
	        var o = { 
	          "M+" : this.getMonth()+1,                 //月份 
	          "d+" : this.getDate(),                    //日 
	          "h+" : this.getHours(),                   //小时 
	          "m+" : this.getMinutes(),                 //分 
	          "s+" : this.getSeconds(),                 //秒 
	          "q+" : Math.floor((this.getMonth()+3)/3), //季度 
	          "S"  : this.getMilliseconds()             //毫秒 
	        }; 
	        if(/(y+)/.test(fmt)) {
	          fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
	          }
	        for(var k in o) {
	          if(new RegExp("("+ k +")").test(fmt)){
	           fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
	            }
	          }
	        return fmt; 
	      }
		//alert(new Date().format("yyyy"));
	}
	
	
	var birthyear;
	var bodyheight;
	//基本信息的初始化(一)---[user 表]
		$.ajax({
			type:'post',
			url:'selectUserById/'+uid,
			data:{},
			dataType:'json',
			success:function(data) {
				var pagetitle = data.region+"征婚用户"+data.username+"的个人主页";
				$("#pagetitle").html(pagetitle);//页眉
				$("#Hi").html("Hi , "+data.username);//导航栏
				$("#othername").html(data.username+"&nbsp;&nbsp;&nbsp;");
				/*$("#imgone").empty();
				$("#imgtwo").empty()*/;
				//塞封面
				//alert("<li><a target='_blank' href='#'><img title=\"\" src='img/"+data.imgurl+"' /></a></li>");
				/*$("#imgone").append("<li><a target='_blank' href='#'><img title=\"\" src='img/"+data.imgurl+"' /></a></li>");
				$("#imgtwo").append("<a target='_blank' href='#'><img src='img/"+data.imgurl+"' /></a>");*/
				birthyear = parseInt(data.birthday.substr(0,4));
				getDate();
				$("#alineinfo").html((new Date().format("yyyy")-birthyear)+"岁 / "+data.height+"cm / "+data.education+" / "+data.region);
				$(".sal").html(data.sal+" ￥");
				$(".marriage").html(data.marriage);
				$("#birthday").html(data.birthday);
				$("#height").html(data.height+"cm");
				bodyheight = data.height;
				//计算属性
				var arr = new Array("鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪");
				var kkk ;
				if(arr[birthyear%12-4]>0){
					kkk = arr[birthyear%12-4];
				}else{
					kkk = arr[birthyear%12-4+12]
				}
				$(".animal").html(kkk);
				//计算星座
				var datearr = data.birthday.split("-");
				var str2 = datearr[1]+datearr[2];
				var MandD = parseInt(str2);
				var constellation;
				if(MandD<=0419 && MandD>=0321){
					constellation = "白羊座";
				}else if(MandD>=0420&&MandD<=0520){
					constellation = "金牛座";
				}else if(MandD>=0521&&MandD<=0621){
					constellation = "双子座";
				}else if(MandD>=0622&&MandD<=0722){
					constellation = "巨蟹座";
				}else if(MandD>=0723&&MandD<=0822){
					constellation = "狮子座";
				}else if(MandD>=0823&&MandD<=0922){
					constellation = "处女座";
				}else if(MandD>=0923&&MandD<=1023){
					constellation = "天秤座";
				}else if(MandD>=1024&&MandD<=1122){
					constellation = "天蝎座";
				}else if(MandD>=1123&&MandD<=1221){
					constellation = "射手座";
				}else if(MandD>=0120&&MandD<=0218){
					constellation = "水瓶座";
				}else if(MandD>=0219&&MandD<=0320){
					constellation = "双鱼座";
				}else{
					constellation = "摩羯座";
				}
				$(".constellation").html(constellation);   
				//找相似的人
				$.ajax({
					type:'post',
					url:'selectSimilar/'+birthyear+"/"+bodyheight+"/"+uid,
					data:{},
					dataType:'json',
					success:function(data) {
					     console.log(data);
					     $("#similar").html("");
						for(var i=0;i<data.length;i++){
							var theYear = data[i].birthday.substr(0,4);
							getDate();
							var hisage = parseInt(new Date().format("yyyy"))-parseInt(theYear);
							$("#similar").append("<div class='thatman' data-id='"+data[i].uid+"' ><img class='similarimg' src='img/"+data[i].imgurl+"' /><br /><span class='similaruser'>"+data[i].username+"</span>&nbsp;&nbsp;&nbsp;&nbsp;<span class='similaruser'>ID: </span><span>"+ data[i].uid+"</span><p>"+hisage+"岁&nbsp;&nbsp;&nbsp;&nbsp;"+data[i].marriage+"&nbsp;&nbsp;"+data[i].region+"</p></div>");
							//单击相似用户，跳转至对应用户的个人界面
							$(".thatman").on("click",function(){
								location.href="other.html?uid="+$(this).attr("data-id")+"&myid="+myid;
							})
						}
					}
				});
			}
		});
		
	//基本信息的初始化(二)---[image 表]	
		$.ajax({
			type:'post',
			url:'selectImageById/'+uid,
			data:{},
			dataType:'json',
			success:function(data) {
				
			    for(var j =0;j<data.length;j++){
			    	/*$("#imgone").append("<li><a target='_blank' href='#'><img title=\"\" src='img/"+data.imgurl+"' /></a></li>");
					$("#imgtwo").append("<a target='_blank' href='#'><img src='img/"+data.imgurl+"' /></a>");*/
			    }
			}
		});
	//基本信息的初始化(三)---[details 表]
	$.ajax({
		type:'post',
		url:'selectDetailsById/'+uid,
		data:{},
		dataType:'json',
		success:function(data) {
			$(".housing").html(data.housing);
			$("#hometown").html(data.selcity);
			$("#buycar").html(data.car);
			$("#job").html(data.job);
			if(data.self==""||data.self==null){
				$("#selfdiv").remove();
			}else{
				$("#self").html(data.self);
			}
			$("#nation").html(data.nation);
			$("#language").html(data.language);
			$("#selcity").html(data.selcity);
			$("#faith").html(data.faith);
			$("#child").html(data.child);
			$("#weight").html(data.weight+"kg");
			$("#smoke").html(data.smoke);
			$("#phone").html(data.phone);
			$("#mobile").html(data.mobile);
			$("#vx").html(data.vx);
			$("#qq").html(data.qq);
			$("#sexual").html(data.sexual);
			$("#blood").html(data.blood);
			$("#major").html(data.major);
			$("#drink").html(data.drink);
			$("#school").html(data.school);
			$("#jobstatus").html(data.jobstatus);
			$("#custom").html(data.custom);
			$("#nature").html(data.nature);
		}
	});
	
	//基本信息的初始化(四)---[intention 表]
	$.ajax({
		type:'post',
		url:'selectIntentionById/'+uid,
		data:{},
		dataType:'json',
		success:function(data) {
			$("#theage").html(data.lage+"~"+data.hage+" 岁");
			$("#thelocation").html(data.location); 
			$("#themarriage").html(data.marriage);
			$("#theheight").html(data.lheight+"~"+data.hheight+" cm");
			$("#theeducation").html(data.education);
			$("#thehouse").html(data.house);
			$("#thesal").html(data.sal);
			$("#thechildren").html(data.children);
		}
	});
	
	//点击关注按钮，在关注表中添加对应的数据
	$("#focus").click(function(){
		$.ajax({
			type:'post',
			url:'addFocus/'+myid+"/"+uid,
			data:{},
			dataType:'json',
			success:function(data) {
				alert(data.result);
			}
		});
	})
	//点赞增加热度
	$("#hot").click(function(){
		if($("#hot").html() != "取消点赞"){
			$.ajax({
				type:'post',
				url:'addHot/'+myid+"/"+uid,
				data:{},
				dataType:'json',
				success:function(data) {
					alert(data.result);
				}
			});
			$("#hot").html("取消点赞");
		}else{
			$.ajax({
				type:'post',
				url:'cancelHot/'+myid+"/"+uid,
				data:{},
				dataType:'json',
				success:function(data) {
					alert(data.result);
				}
			});
			$("#hot").html("赞一个");
		}
		
	})
	
	
	
})
	
	
	
	
	

