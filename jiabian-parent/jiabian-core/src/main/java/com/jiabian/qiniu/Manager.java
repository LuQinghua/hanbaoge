package com.jiabian.qiniu;



import com.jiabian.util.ConfigUtil;
import com.jiabian.util.Constants;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

public class Manager {
    private static final String BUCKTE_NAME = "jbsh/img/";
    //图片外链域名
   
    private static Auth auth;
    
    static{
    	auth = Auth.create(ConfigUtil.getConfig(Constants.QN_ACCESS_KEY), ConfigUtil.getConfig(Constants.QN_SECRET_KEY));
    }
    
	public static String getUpToken(){
		return auth.uploadToken(BUCKTE_NAME);
	}
	
	//创建上传对象  
    public static UploadManager getManager(){
    	return new UploadManager(); 
    }
    
    public static String download(String filePath){
        //调用privateDownloadUrl方法生成下载链接,第二个参数可以设置Token的过期时间
        return auth.privateDownloadUrl(filePath,3600);
    }

    
}
