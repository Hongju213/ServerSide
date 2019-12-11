/* js test 2019-11-01 */

$(function() {

	// jQueryTest click 했을 때 
	$(".jQueryTestbtn").click(function(){
		var str = $(this).text();
		alert("/main/webapp/commons/js/jQuery Test Success!!");
	});
});

$(function() {

	// newbtn click 했을 때 
	$(".newbtn").click(function(){
		location.href="new";
	});
});

$(function() {
	
	// ajaxTest click 했을 때
	$(".ajaxTestbtn").click(function(){
		
	    $.ajax({
	        type : "GET",
	        url : "ajaxTest",
	        dataType : "text",
	        success : function(data){
	        	alert("ajax Test Success!!" + data) ;
	            $("#dataArea").html(data) ;
	        },
	        error : function(){
	            alert('통신실패!!');
	        }
	    });
	});
});