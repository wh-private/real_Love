$(document).ready(function() {
	   //这步获取自己id   
	   var initiativeid=1;
	   var myid = 3;
	/*   var str = location.href.substr(location.href.indexOf('?')+1);
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
		}*/
	$("#div_hide").click(function() {
        //隐藏--显示切换
		$("#ul_hide").toggle();

	})

	/*中间轮播图*/
	var count = 1;

	function changePic() {
		var pic = document.getElementById("pic");
		if(count == 1) {
			pic.src = "img/1.jpg";
			count++;
		} else if(count == 2) {
			pic.src = "img/2.jpg";
			count++;
		} else if(count == 3) {
			pic.src = "img/3.jpg";
			count++;
		} else if(count == 4) {
			pic.src = "img/4.jpg";
			count++;
		} else if(count == 5) {
			pic.src = "img/5.jpg";
			count++;
		} 
		else {
			pic.src = "img/6.jpg";
			count = 1;
		}
	}

	setInterval(changePic, 2000);

	

	

 /*已经喜欢--猜你喜欢*/
    $("#loveing").click(function(){
    	
    	$("#div_guesslove").hide();
    	$("#xuhint").show();
    })
     $("#guessyoulike").click(function(){
    	
    	$("#xuhint").hide();
    	$("#div_guesslove").show();
    })
    

   
   //初始化今日明星          知识点:ajax,多表连接,框架,sql   出错的地方:图片地址没写全   
  $.ajax({
	   url:"selectStar",
       type:"post",
       data:{},
       dataType:"json",
       success:function(data){
    	    //console.log(data);
    	   for(var i=0;i<data.length;i++){
          $("#div_body_star_box").append(
         "<div class='div_greet'>" +
         "<img src='img/"+data[i].user.imgurl+"' />" +
         "<br />" +
         "<button  data-id='"+data[i].uid+"' class='btu_greet'>" +
         "打招呼</button>" +
         "</div>"

          );
  
       }  	   
       }
   })


   
   //打招呼   最开始把util之间转成sql时间,用map封装,后来发现用now()好,改为now
     $(document).on("click",".btu_greet",function(){
	    $.ajax({
		   url:"saveGreetings",
		   type:"post",
		   data:{"Greetings":$(this).attr("data-id"),initiativeid},
		   dataType:"json",
		   success:function(data){
			 // console.log(data);
			   alert(data.Greetingsinitial);
		   
		   }
		  
	   })
	      
   })
   
  //一键钟情   知识点:分页查询,ajax,框架,sql
 $.ajax({
	   url:"selectVs",
	   type:"post",
	   data:{},
	   dataType:"json",
	   success:function(data){
		
		//console.log(data);
		   for(var i=0;i<data.length;i++){
		   $("#body_head_keyimg").append(
				   "<div id='img1'><img src='img/"+data[i].imgurl+"'/><p class='Likeone' data-Likefirst='"+data[i].uid+"'>喜欢</p></div>"+
				   "<div id='divVS'>VS</div>"+
				   "<div id='img2'>+<img src='img/"+data[i].imgurl+"' />"+
				   "<p class='Liketwo' data-Likecond='"+data[i].uid+"'>喜欢</p></div> "
		   )
	   }
		  
	   }
   })
   
   //点击喜欢在喜欢表里添加数据   知识点: 伪类,自定义属性 ,on方法  带两个参数map封装     错误:insert 对的列不一样 
   $(document).on("click",".Likeone",function(){
	    $.ajax({
		   url:"insertLike",
		   type:"post",
		   data:{"clickfirst":$(this).attr("data-Likefirst"),initiativeid},
		   dataType:"json",
		   success:function(data){
			   //console.log(data);
			   alert(data.results);
		   
		   }
		  
	   })
	      
   })
   
   //点击第二个人
   $(document).on("click",".Liketwo",function(){
	    $.ajax({
		   url:"insertLike2",
		   type:"post",
		   data:{"Liketwo":$(this).attr("data-Likecond"),initiativeid},
		   dataType:"json",
		   success:function(data){
			   //console.log(data);
			   alert(data.results);
		   
		   }
		  
	   })
	      
   })
   //猜你喜欢  以喜欢     知识点:ajax,多表连接,框架,sql
   $.ajax({
	   url:"selectGuessLike",
	   type:"post",
	   data:{},
	   dataType:"json",
	   success:function(data){
		//console.log(data);
	    
		for(var i=0;i<data.length;i++){
	$("#div_guesslove").append(
			 "<div class='guessbox'>" +
			 "<div class='guessimg'>" +
			 "<img src='img/"+data[i].user.imgurl+"'/> " +
			 		"<span>" +
			 		"<p>'"+data[i].user.username+"'&nbsp;'"+data[i].job+"'</p>" +
			 		"<p>" +
			 		"<button class='btu_greet' data-guess='"+data[i].uid+"'>喜欢</button>" +
			 				"</p>" +
			 				"</span>" +
			 				"</div>" +
			 				"</div>" 	)

	   }
	   }
	   
   })
         var guessLike;
       //猜你喜欢 喜欢表加人
      $(document).on("click",".btu_greet",function(){
	    $.ajax({
		   url:"insertGuessLike",
		   type:"post",
		   data:{"guessLike":$(this).attr("data-guess"),initiativeid},
		   dataType:"json",
		   success:function(data){
			  // console.log(data);
			   alert(data.resultss);
		   
		   }
		  
	   })
	      
   })
       //以喜欢的     目前是隐藏状态   知识点:ajax,多表连接,框架,sql
 alert(66);
$.ajax({
    	   url:"selectAlreadyLike/"+uid,
    	   type:"post", 
    	   dataType:"json",
    	   success:function(data){
    		   
    	    console.log(data);
    	/*       		   for(var i=0;i<data.length;i++){
    	   $("#div_loveing_hide").append("<div class='loveing_img11'>" +
    	   		"<div class='love_img_ing11'>" +
    	   				"<img src='img/"+data[i].user.imgurl+"' />" +
   						"</div>" +
   						"<div class='div_btn_love'>" +
						"<button class='btnlovefocid' data-focid='"+data[i].user.uid+"' >关注</button>" +
						"&nbsp;" +
						"<button class='btnlove' data-Unfriended='"+data[i].user.uid+"'>取消关注</button>" +
						"</div>" +
						"</div>")
    		   
    	       		  }*/
    		   
    		 
    	   } 
    	   
       })
         
       var userids=3;
       //关注表 加人
      $(document).on("click",".btnlovefocid",function(){
	     // alert("进入")
    	  $.ajax({
		   url:"saveAttention",
		   type:"post",
		   data:{"focidLike":$(this).attr("data-focid"),userids},
		   dataType:"json",
		   success:function(data){
			  // console.log(data);
			   alert(data.Attention);
		   
		   }
		  
	   })
	      
   })
    //取消关注
   $(document).on("click",".btnlove",function(){
	     // alert("进入")
  	  $.ajax({
		   url:"delectAttention",
		   type:"post",
		   data:{"UnfriendedLike":$(this).attr("data-Unfriended"),userids},
		   dataType:"json",
		   success:function(data){
			  // console.log(data);
			   alert(data.Attentioncancel);
		   
		   }
		  
	   })
	      
 })



})