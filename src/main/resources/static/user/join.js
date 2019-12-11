$(document).ready(function() {
	$('#btnJoin').click(function() {
	      var id = $('#id').val();
	      var pw = $('#pw').val();
	      var name = $('#name').val();
	      var gender = $('#gender').val();
	      var role	= null;
	      var birth = $('#day').val();
	  		if(id ==""){
	  			alert("아이디를 입력하세요");
	  			document.form.title.focus();
	  			return;
	  		}
	  		if(pw ==""){
	  			alert("패스워드를 입력하세요");
	  			document.form.title.focus();
	  			return;
	  		}
	  		if(name ==""){
	  			alert("이름을 입력하세요");
	  			document.form.title.focus();
	  			return;
	  		}

	      var form = {id : id, 
	    		      password : pw,
	    		      name : name,
	    		      role : role,
	    		      gender : gender,
	    		      birth : birth};
	      
	      $.ajax({
	          type : "POST",
	          url : "/join.do",
	          data : form,
	          success : function(data) {
	        	  alert("회원가입이 완료되었습니다.");
	        	  location.href='/'
	          },
	          error : function(request, status, error) {
	              alert("code:" + request.status + "\n" + "error:" + error);
	          }
	            });
		});
});

