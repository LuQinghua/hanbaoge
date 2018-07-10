/*global Qiniu */
/*global plupload */
/*global FileProgress */
/*global hljs */


$(function() {
	var key;
    var uploader = Qiniu.uploader({
        runtimes: 'html5,flash,html4',
        browse_button: 'pickfiles',
        container: 'container',
        drop_element: 'container',
        max_file_size: '1000mb',
        dragdrop: true,
        chunk_size: '4mb',
        multi_selection: !(mOxie.Env.OS.toLowerCase()==="ios"),
        max_retries: 3,  
//        uptoken: $('#uptoken').val(),
        uptoken_url:$('#uptoken_url').val(),
        domain: $('#domain').val(),
        get_new_uptoken: true,
        unique_names: true,
//         save_key: false,
        // x_vars: {
        //     'id': '1234',
        //     'time': function(up, file) {
        //         var time = (new Date()).getTime();
        //         // do something with 'time'
        //         return time;
        //     },
        // },
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
            	obj.val("http://oe01jrh3d.bkt.clouddn.com/"+json.key);
            	console.info($('#picPath').val());
            },
            'Error': function(up, err, errTip) {
            	//上传出错时，处理相关的事情
//            	console.info("error:"+err);
            }
                // ,
                // 'Key': function(up, file) {// 若想在前端对每个文件的key进行个性化处理，可以配置该函数，该配置必须要在unique_names: false，save_key: false时才生效
                //     var key = "";
                //     // do something with key
                //     return key
                // }
        }
    });
    	
      //用于上传暂停
//    $('#up_load2').on('click', function(){
//        uploader2.start();
//    });
//    $('#stop_load2').on('click', function(){
//        uploader2.stop();
//    });
    
//    var imgLink = Qiniu.imageView2({
//	        mode: 3,  // 缩略模式，共6种[0-5]
//	        w: 100,   // 具体含义由缩略模式决定
//	        h: 100,   // 具体含义由缩略模式决定
//	        q: 100,   // 新图的图像质量，取值范围：1-100
//	        format: 'png'  // 新图的输出格式，取值范围：jpg，gif，png，webp等
//	 }, key);
    
 // key为每个文件上传成功后，服务端返回的json字段，即资源的最终名字，下同
 // key可在每个文件FileUploaded事件被触发时获得
// var imgLink = Qiniu.watermark({
//          mode: 1,  // 图片水印
//          image: 'http://77flds.com2.z0.glb.qiniucdn.com/images/logo-2.png', // 图片水印的Url，mode = 1时，必需
//          dissolve: 50,          // 透明度，取值范围1-100，非必需，下同
//          gravity: 'SouthWest',  // 水印位置，为以下参数[NorthWest、North、NorthEast、West、Center、East、SouthWest、South、SouthEast]之一
//          dx: 100,  // 横轴边距，单位：像素(px)
//          dy: 100   // 纵轴边距，单位：像素(px)
//      }, key);      // key为非必需参数，下同
 // imgLink可以赋值给html img元素的src属性，下同
 // 若未指定key，可以通过以下方式获得完整的imgLink，下同
 // imgLink  =  '<domain>/<key>?' +  imgLink
 // <domain> 为七牛空间（bucket)对应的域名，选择某个空间后，可通过 空间设置->基本设置->域名设置 查看获取


});
