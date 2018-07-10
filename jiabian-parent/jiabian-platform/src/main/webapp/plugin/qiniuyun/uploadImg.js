/*global Qiniu */
/*global plupload */
/*global FileProgress */
/*global hljs */


//$(function() {
function uploadImg(btnId,picPathId){
    var uploader = Qiniu.uploader({
        runtimes: 'html5,flash,html4',
        browse_button: btnId,
//        container: 'container',
//        drop_element: 'container',
        max_file_size: '1000mb',
        dragdrop: true,
        chunk_size: '4mb',
//        multi_selection: !(mOxie.Env.OS.toLowerCase()==="ios"),
        max_retries: 3,  
//      uptoken: $('#uptoken').val(),
//      uptoken_url:$('#uptoken_url').val(),
        uptoken_url:'common/getQNToken',
//      domain: $('#domain').val(),
        domain:'jbsh/img/',
        get_new_uptoken: true,
        unique_names: true,
        auto_start: true,
        log_level: 0,
        init: {
            'FilesAdded': function(up, files) {
                plupload.each(files, function(file) {
                	// 文件添加进队列后，处理相关的事情
                });
            },
            'BeforeUpload': function(up, file) {
            	// 每个文件上传前，处理相关的事情
            	console.info(file);
            },
            'UploadProgress': function(up, file) {
            	// 每个文件上传时，处理相关的事情
            },
            'UploadComplete': function() {
        		//队列文件处理完毕后，处理相关的事情
            },
            'FileUploaded': function(up, file, info) {
            	// 每个文件上传成功后，处理相关的事情
                // 其中info是文件上传成功后，服务端返回的json
            	var json=JSON.parse(info);
//            	$('#picPath').val($('#outside').val()+json.key);
//            	console.info($('#picPath').val());
            	console.info(picPathId);
            	$("#"+picPathId+"").val($('#outside').val()+json.key);
            	console.info($("#"+picPathId+"").val());
            },
            'Error': function(up, err, errTip) {
            	//上传出错时，处理相关的事情
//            	console.info("error:"+err);
            }
        }
    });
//});

}
