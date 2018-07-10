package com.jiabian.callback.yiwangtong;

import java.security.SecureRandom;
import java.util.Map;
import java.util.TreeMap;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jiabian.util.ConfigUtil;
import com.jiabian.util.DateUtil;

public class YwtRefundUtils {
	private static final Logger logger = LogManager.getLogger(YwtRefundUtils.class.getName());

	//商户结账系统的操作员号(9999权限最大，官方建议不改)
	public static final String OPERATORNO = "9999";
	
	
	//操作员密码加密算法
	public static final String ENCRYPTYPE = "DES";
	
	
	//操作员登录密码
	public static final String YWT_PWD = "YWT_PWD";
	
	
	//退款地址
	public static final String REFUND = "https://payment.ebank.cmbchina.com/NetPayment/BaseHttp.dll?DoRefund";
	
	//商户密钥前8位
	public static final String YWT_FRONTSECRETKEY = "YWT_FRONTSECRETKEY";
	
	/**
	 * 退款流水号
	 */
	public static String getRefundSerialNo() {
		return new StringBuffer().append(RandomStringUtils.randomNumeric(20)).toString();
	}
	
	
	
	/**
	 * DEC加密算法
	 */
	 private static byte[] encrypt(byte[] data, byte[] key) {
        try {
            // 生成一个可信任的随机数源
            SecureRandom sr = new SecureRandom();
            // 从原始密钥数据创建DESKeySpec对象
            DESKeySpec dks = new DESKeySpec(key);
            // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ENCRYPTYPE);
            SecretKey securekey = keyFactory.generateSecret(dks);
            // Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance(ENCRYPTYPE);
            // 用密钥初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
            logger.info("cipher.doFinal(data) 有值吗？"+cipher.doFinal(data));
            return cipher.doFinal(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	 
	 /**
	  * 把byte转换为对应的16进制字符串
	  */
	 public static String  getPwd(){
		 byte[] encrypt = encrypt(ConfigUtil.getConfig(YWT_PWD).getBytes(), ConfigUtil.getConfig(YWT_FRONTSECRETKEY).getBytes());
		 
		    StringBuilder stringBuilder = new StringBuilder("");  
		    if (encrypt == null || encrypt.length <= 0) {  
		        return null;  
		    }  
		    for (int i = 0; i < encrypt.length; i++) {  
		        int v = encrypt[i] & 0xFF;  
		        String hv = Integer.toHexString(v);  
		        if (hv.length() < 2) {  
		            stringBuilder.append(0);  
		        }  
		        stringBuilder.append(hv);  
		    }  
		    logger.info("16进制字符串"+stringBuilder.toString());
		    return stringBuilder.toString();  
	 }
	 
	 
	 
	/**
	 * 组装签名的报文
	 */
	public static Map<String, String> getRefundReqData(String orderNo, String amount,String desc){
		Map<String, String> refundReqData = new TreeMap<String, String>();
		refundReqData.put("dateTime", YwtUtils.getTime());
		refundReqData.put("branchNo",ConfigUtil.getConfig(YwtUtils.YWT_BRANCHNO));
		refundReqData.put("merchantNo",ConfigUtil.getConfig(YwtUtils.YWT_MERCHANTNO));
		refundReqData.put("date",DateUtil.getShortCurrTimes().replaceAll("-", ""));
		refundReqData.put("orderNo",orderNo);
		refundReqData.put("refundSerialNo",getRefundSerialNo());
		refundReqData.put("amount",amount);
		refundReqData.put("desc",desc);
		refundReqData.put("operatorNo",OPERATORNO);
		refundReqData.put("encrypType", ENCRYPTYPE);
		refundReqData.put("pwd", getPwd());
		return refundReqData;
	}
}