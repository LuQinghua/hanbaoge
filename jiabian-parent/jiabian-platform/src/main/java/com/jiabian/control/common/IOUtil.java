package com.jiabian.control.common;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.jiabian.qiniu.Manager;
@Controller
public class IOUtil {
	@RequestMapping("/downloadFile")
	public static ResponseEntity<byte[]> downloadFile(@RequestParam("filePath") String filePath){
	    String path=Manager.download(filePath);  
	    System.out.println("path>>>"+path);
        File file=new File(path);  
        HttpHeaders headers = new HttpHeaders();    
        String fileName;
		try {
			fileName = new String(file.getName().getBytes("utf-8"),"iso-8859-1");//处理中文乱码
			System.out.println(fileName);
			 headers.setContentDispositionFormData("attachment", fileName);   
		        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);   
		        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
		                                          headers, HttpStatus.CREATED);    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value="uploadFile",method=RequestMethod.POST)
	public ModelAndView uploadFile(HttpServletRequest request) {
		 MultipartHttpServletRequest mreq = (MultipartHttpServletRequest)request;
		    MultipartFile file = mreq.getFile("file");
		    String fileName = file.getOriginalFilename();
		    
		    String filePath="";
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");        
		    FileOutputStream fos;
			try {
				filePath=request.getSession().getServletContext().getRealPath("upload")+File.separator+sdf.format(new Date())+fileName.substring(fileName.lastIndexOf("."));
				fos = new FileOutputStream(filePath);
				fos.write(file.getBytes());
			    fos.flush();
			    fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Map<String, Object> map=new HashMap<String, Object>();
			map.put("fileName", fileName);
			map.put("filePath", filePath);
		    return new ModelAndView("download",map);
	}
	
	@RequestMapping("/eventest")
	public String test(){
		return "test/test2";
	}
}
