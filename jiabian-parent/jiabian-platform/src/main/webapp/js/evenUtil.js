	function uploadImg(){
		var txt=  "<form name=\"uploadForm\" action=\"../qiNiuYun/uploadImg\" method=\"post\" enctype=\"multipart/form-data\">";
		txt+="<table><tr><td><input type=\"file\" name=\"myfile\"/></td></tr></form>";
		var option = {
			title: "上传文件",
			btn: parseInt("0011",2),
			onOk: function(){
				if (uploadForm.myfile.value==null||uploadForm.myfile.value=="") {
					alert("请先上传文件");
				}else{
					uploadForm.submit();
				}
			}
		}
		window.wxc.xcConfirm(txt, "haha", option);
	}
			//将表格数据转换成json数据
	$('#dableSubmit').click(function(){
		var jsonText="{";
		for(var i=0;i<$('#mytable .jsonData').length;i++){
			jsonText+="\""+$("#mytable tr:eq("+i+") td:eq(0) input").val()+"\""+":"+"\""+$("#mytable tr:eq("+i+") td:eq(1) input").val()+"\"";
			if (i!=$('#mytable .jsonData').length-1) {
				jsonText+=",";
			}
		}
		jsonText+="}";
		$('#tableData').val(jsonText);
		alert($('#tableData').val());
	});
	


	$(function(){
		
		$('#selectAll').on('ifChecked', function(event){
		    $('.i-checks').iCheck('check');
		});
		$('#selectAll').on('ifUnchecked', function(event){
		    $('.i-checks').iCheck('uncheck');
		});
	})

	//selected回显
	function selected(obj, selectedValue){ 
	    if (selectedValue == "")
	        return;
	    for (var tmp = 0; tmp < obj.length; tmp++) {     
	        var value = obj.options[tmp].value;
	        if (value == "")
	            value = obj.options[tmp].text;
	        if (value == selectedValue) {
	            obj.options[tmp].selected = true;
	            return;
	        }
	    }
	}
	
	//获取复选框勾选的Id
	function getCheckIds() {
	    var ids = "";
	    var obj = form1.id;
	    if (form1.id.length == null) {
	        if (form1.id.checked) {
	            ids = form1.id.value;
	        }
	    }
	    else {
	        for (var tmp = 0; tmp < obj.length; tmp++) {
	            if (obj[tmp].checked) {
	                ids += obj[tmp].value + ",";
	            }
	        }
	        ids = ids.substring(0, ids.length - 1);
	    }
	    form1.checkIds.value = ids;
	}
		
	//获取cookie(解决中文乱码 	java中使用	 URLEncoder.encode(<cookieName>, "UTF-8"))编码 
	function getCookieValue(cookieName)  
	{  
	    var cookieValue = document.cookie;  
	    var cookieStartAt = cookieValue.indexOf(""+cookieName+"=");  
	    if(cookieStartAt==-1)  
	    {  
	        cookieStartAt = cookieValue.indexOf(cookieName+"=");  
	    }  
	    if(cookieStartAt==-1)  
	    {  
	        cookieValue = null;  
	    }  
	    else  
	    {  
	        cookieStartAt = cookieValue.indexOf("=",cookieStartAt)+1;  
	        cookieEndAt = cookieValue.indexOf(";",cookieStartAt);  
	        if(cookieEndAt==-1)  
	        {  
	            cookieEndAt = cookieValue.length;  
	        }  
	        cookieValue = cookieValue.substring(cookieStartAt,cookieEndAt);
	    }  
	    return decodeURIComponent(cookieValue);  //使用 decodeURIComponent 解码
	}  
	

	 
	
