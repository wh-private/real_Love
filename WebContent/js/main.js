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
    


   //初始化今日明星
   $.ajax({
	   url:"selectStar",
       type:"post",
       data:{},
       dataType:"json",
       success:function(data){
    	   
          $("#div_body_star_box").append(
         "<div class='div_greet'><img src='+data[i].img+' /><br />
							<button class="btu_greet">打招呼</button>
						</div>

						<div class="div_greet">
							<img src="img/84D71AF7416B95AFF7C84EDE305E3B53(1).jpg" /><br />
							<button class="btu_greet">打招呼</button>
						</div>

						<div class="div_greet">
							<img src="img/9C73F6ECE3C96F527D6D5B3731B33B98.jpg" /><br />
							<button class="btu_greet">打招呼</button>
						</div>

						<div class="div_greet">
							<img src="img/C7333F03BBF2C1C3F33BD68A5CC9C39F.jpg" /><br />
							<button class="btu_greet">打招呼</button>
						</div>
					</div>"  
          
          
          
          );
     
       
       
       
       }  	   
	   
   })











})