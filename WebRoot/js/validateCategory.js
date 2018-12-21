$(document).ready(function () {
	$(".error").each(function(){
		showError($(this));
	});
	
  		$(".input").focus(function() {
  			var labelId = $(this).attr("id") + "Error";
  			$("#" + labelId).text("");
  			showError($("#" + labelId));
  		});
  		$(".input").blur(function() {
  			var id = $(this).attr("id");
  			ValidateCategoryName();
  			showError($("#" + id + "Error"));
  		});
  		
  		$("#cateForm").submit(function(){
  			var bool = true;
  			if (!ValidateCategoryName()) {
  				bool = false;
  			}
  			return bool;
  		});
  		
  	});
  	function ValidateCategoryName() {
  		var id = "categoryName";
  		var value = $("#" + id).val();
  		if(!value) {
  			$("#" + id +"Error").text("²»ÄÜÎª¿Õ");
  			showError($("#" + id +"Error"));
  			return false;
  		}
  		return true;
  	}

  	function showError(ele) {
  		var text = ele.text();
  		if (!text) {
  			ele.css("display","none");
  			
  		}else {
  			ele.css("display","");
  		}	
  	}