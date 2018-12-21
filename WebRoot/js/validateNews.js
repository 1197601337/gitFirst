$(document).ready(function () {
		$(".error").each(function(){
			showError($(this));
		});
  		$(".input").focus(function() {
  			var labelId = $(this).attr("id") + "Error";
  			//alert(labelId);
  			$("#" + labelId).text("");
  			showError($("#" + labelId));
  		});
  		$(".input").blur(function() {
  			var id = $(this).attr("id");
  			if (id == "title") {
  				ValidateTitle();
  				showError($("#" + id + "Error"));
  			}
  			if (id == "content") {
  				ValidateContent();
  				showError($("#" + id + "Error"));
  			}
  			
  			if (id == "resource") {
  				ValidateSource();
  				showError($("#" + id + "Error"));
  			}
  		});
  		
  		$("#newsForm").submit(function(){
  			var bool = true;
  			if (!ValidateTitle()) {
  				bool = false;
  			}
  			if (!ValidateContent()) {
  				bool = false;
  			}
  			
  			if (!ValidateSource()) {
  				bool = false;
  			}
  			return bool;
  		});
  		
  	});

//鏍￠獙杈撳叆鏂伴椈鏍囬鏄惁涓虹┖
  	function ValidateTitle() {
  		var id = "title";
  		var value = $("#" + id).val();
  		if(!value) {
  			$("#" + id +"Error").text("杈撳叆鏂伴椈鏍囬涓嶈兘涓虹┖锛");
  			showError($("#" + id +"Error"));
  			return false;
  		}
  		return true;
  	}

  //鏍￠獙杈撳叆鏂伴椈鍐呭鏄惁涓虹┖
  	function ValidateContent() {
  		var id = "content";
  		var value = $("#" + id).val();
  		if(!value) {
  			$("#" + id +"Error").text("杈撳叆鏂伴椈鍐呭涓嶈兘涓虹┖锛");
  			showError($("#" + id +"Error"));
  			return false;
  		}
  		return true;
  	}
  //鏍￠獙杈撳叆鏂伴椈鏉ユ簮鏄惁涓虹┖
  	function ValidateSource() {
  		var id = "resource";
  		var value = $("#" + id).val();
  		if(!value) {
  			$("#" + id +"Error").text("杈撳叆鏂伴椈鏉ユ簮涓嶈兘涓虹┖锛");
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