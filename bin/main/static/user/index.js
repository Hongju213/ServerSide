$(document).ready(function() {
	$("#btnJoin").click(function(){
		location.href='join';
	});
	
	$('#btnLogin').click(function() {
	      var id = $('#id').val();
	      var pw = $('#pw').val();

	      var form = {id : id, 
	    		      password : pw};
	      
	      $.ajax({
	          type : "POST",
	          url : "/login.do",
	          data : form,
	          dataType : 'json',
	          success : function(data) {
	        	  if(data.res == 'success') {
	        		  location.href='/main'
	        	  } else if(data.res == 'fail') {
	        		  alert("아이디나 비밀번호가 일치하지 않습니다.");
	        		  location.href='/'
	        	  }
	          },
	          error : function(request, status, error) {
	        	  alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
	          }
	      });
	});
});
