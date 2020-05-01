/**
 * 
 */

function getcontactlist(){
	console.log($("#buttonid").val());
	console.log("came here in ajax");
	
	$.ajax({
		 type : "GET",
	      url : "getcontacts",
	      success : function(result){
	    	  console.log(result.status);
	    	  
	    	  
	      },
	      error : function(e){
	    	  console.log("error"+e.responseText);
	      }
	     
	});
	/*$("#resultdisplay").html("came to ajax");*/
	}