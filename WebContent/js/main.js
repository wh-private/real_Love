$(document).ready(function() {
	
	$("#div_hide").click(function() {

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
         "<button data-id='"+data[i].uid+"' class='btu_greet'>" +
         "打招呼</button>" +
         "</div>"

          );
  
       }  	   
       }
   })


  //一键钟情   知识点:分页查询,ajax,框架,sql
 $.ajax({
	   url:"selectVs",
	   type:"post",
	   data:{},
	   dataType:"json",
	   success:function(data){
		
		  // console.log(data);
		   $("#body_head_keyimg").append(
				   "<div id='img1'><img src='img/"+data[i].imgurl+"' /><p>喜欢</p></div>"+"<div id='divVS'>VS</div>" +
				   		"<div id='img2'>+<img src='img/"+data[i].imgurl+"' /><p>喜欢</p></div> "
		   )
	   }
	
   })
   
   
   //猜你喜欢  以喜欢     知识点:ajax,多表连接,框架,sql
   $.ajax({
	   url:"selectGuessLike",
	   type:"post",
	   data:{},
	   dataType:"json",
	   success:function(data){
		console.log(data);
	    
	/*	$("#guesslove").append(
			 "<div id='chooselove'>
							<p id='guessyoulike' class='body_head_love'>猜你喜欢</p>
							<p id='loveing' class='body_head_love'>已喜欢</p>
							<p class='body_head_love'>换一组</p>
						</div>
						<hr />
						<br />
						<div id='div_guesslove'>
							<div class='guessbox'>
								<div class='guessimg'>
									<img src="img/u=1774242776,227980485&fm=26&gp=0.jpg" /> <span>
										<p>姓名&nbsp;年龄&nbsp;学历</p>
										<p>
											<button class="btu_greet">喜欢</button>
										</p>
									</span>
								</div>
							</div>
							<div class="guessbox">
								<div class="guessimg">
									<img src="img/C7333F03BBF2C1C3F33BD68A5CC9C39F.jpg" /> <span>
										<p>姓名&nbsp;年龄&nbsp;学历</p>
										<p>
											<button class="btu_greet">喜欢</button>
										</p>
									</span>
								</div>
							</div>
							<div class="guessbox">
								<div class="guessimg">
									<img src="img/下载 (3).jpg" /> <span>
										<p>姓名&nbsp;年龄&nbsp;学历</p>
										<p>
											<button class="btu_greet">喜欢</button>
										</p>
									</span>
								</div>
							</div>
							<div class="guessbox">
								<div class="guessimg">
									<img src="img/u=4123403008,3466334212&fm=26&gp=0.jpg" /> <span>
										<p>姓名&nbsp;年龄&nbsp;学历</p>
										<p>
											<button class="btu_greet">喜欢</button>
										</p>
									</span>
								</div>
							</div>

							<div class="guessbox">
								<div class="guessimg">
									<img src="img/u=4020082027,3373640670&fm=26&gp=0.jpg" /> <span>
										<p>姓名&nbsp;年龄&nbsp;学历</p>
										<p>
											<button class="btu_greet">喜欢</button>
										</p>
									</span>
								</div>
							</div>

							<div class="guessbox">
								<div class="guessimg">
									<img src="img/u=233752554,730368439&fm=26&gp=0.jpg" /> <span>
										<p>姓名&nbsp;年龄&nbsp;学历</p>
										<p>
											<button class="btu_greet">喜欢</button>
										</p>
									</span>
								</div>
							</div>

						</div>"	
		
		
		)*/
	   
	   
	   
	   }
	   
	   
   })
   
   







})