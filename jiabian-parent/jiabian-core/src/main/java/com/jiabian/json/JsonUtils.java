package com.jiabian.json;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/**
 * Json处理工具类 自定义响应结构
 * JsonUtils
 * 创建人:何雪平 
 * 时间：2017年1月17日-下午3:47:58 
 * @version 1.0.0
 *
 */
public class JsonUtils {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 将对象转换成json字符串
     * com.jiabian.util 
     * 方法名：objectToJson
     * 创建人：何雪平 
     * 时间：2017年1月17日-下午3:47:35 
     * @param data
     * @return String
     * @exception 
     * @since  1.0.0
     */
    public static String objectToJson(Object data) {
    	try {
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	return null;
    }
    
    /**
     * 将json结果集转化为对象
     * com.jiabian.util 
     * 方法名：jsonToPojo
     * 创建人：何雪平 
     * 时间：2017年1月17日-下午3:47:20 
     * @param jsonData
     * @param beanType
     * @return T
     * @exception 
     * @since  1.0.0
     */
    public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
        try {
            T t = MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
    
    /**
     * 将json数据转换成pojo对象list
     * com.jiabian.util 
     * 方法名：jsonToList
     * 创建人：何雪平 
     * 时间：2017年1月17日-下午3:47:02 
     * @param jsonData
     * @param beanType
     * @return List<T>
     * @exception 
     * @since  1.0.0
     */
    public static <T>List<T> jsonToList(String jsonData, Class<T> beanType) {
    	JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
    	try {
    		List<T> list = MAPPER.readValue(jsonData, javaType);
    		return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return null;
    }
    
    /**
     * 判读两个json是否相等
     * com.jiabian.json 
     * 方法名：jsonEqual
     * 创建人：何雪平 
     * 时间：2017年3月21日-上午11:59:01 
     * @param str1
     * @param str2
     * @return
     * @throws JsonProcessingException
     * @throws IOException Boolean
     * @exception 
     * @since  1.0.0
     */
    public static Boolean  jsonEqual(String str1, String str2){
		  ObjectMapper mapper = new ObjectMapper();  
	      JsonNode doc = null;
		try {
			doc = mapper.readTree(str1);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	      ObjectMapper mapper1 = new ObjectMapper();  
	      JsonNode doc1 = null;
		try {
			doc1 = mapper1.readTree(str2);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		return doc.equals(doc1);
    }

   public static void main(String[] args) {
	   String str1="{\"??\":\"??\",\"??\":\"2xxl\"}";
	   String str2="{\"??\":\"2xxl\",\"??\":\"??\"}";
	   
	     JsonElement e3 = new JsonPrimitive(str1);  
	    JsonElement e4 = new JsonPrimitive(str2);  
	    System.out.println(e3.equals(e4));  
	//System.out.println(jsonEqual(str1, str2));
}
    
}
