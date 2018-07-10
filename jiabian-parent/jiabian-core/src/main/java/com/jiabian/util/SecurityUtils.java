package com.jiabian.util;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * 加密工具类
 * SecurityUtils
 * 创建人:黄世平
 * 时间：2016年11月8日-上午9:37:26 
 * @version 1.0.0
 *
 */

public class SecurityUtils {
	private static final Logger logger = LogManager.getLogger("SecurityUtils");
	private static byte[] iv = { 1, 9, 8, 9, 0, 6, 0, 4 };
	private static String defaultKey = "";//ConfigUtil.getConfig(Constants.DECRYPT_KEY);

	public static byte[] encryptDES(String encryptString, String encryptKey) throws Exception {
		IvParameterSpec zeroIv = new IvParameterSpec(iv);
		SecretKeySpec key = new SecretKeySpec(encryptKey.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
		byte[] encryptedData = cipher.doFinal(encryptString.getBytes(Constants.ENCODING));

		return encryptedData;
	}

	/**
	 * 字符串加密算法
	 * @param encryptString
	 * @param encryptKey
	 * @return
	 * @throws Exception
	 */
	public static String encryptByDESAndEncodeByBase64(String encryptString, String encryptKey) {
		try {
			return Base64Utils.encode(encryptDES(encryptString, encryptKey));
		} catch (Exception e) {
			logger.error("字符串加密异常!",e);
			return null;
		}
	}

	public static String decryptDES(byte[] encryptedData, String decryptKey) throws Exception {
		if(encryptedData == null){
			return null;
		}
		IvParameterSpec zeroIv = new IvParameterSpec(iv);
		SecretKeySpec key = new SecretKeySpec(decryptKey.getBytes(Constants.ENCODING), "DES");
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
		byte decryptedData[] = cipher.doFinal(encryptedData);
		String decryptedString = new String(decryptedData, Constants.ENCODING);

		return decryptedString;
	}

	/**
	 * 字符串解密算法
	 * @param encryptedString
	 * @param decryptKey
	 * @return
	 * @throws Exception
	 */
	public static String decryptByDESAndDecodeByBase64(String encryptedString, String decryptKey) {
		try {
			return decryptDES(Base64Utils.decode(encryptedString), decryptKey);
		} catch (Exception e) {
			logger.error("字符串解密异常！",e);
			return null;
		}
	}

	public static String decryptByDESAndDecodeByBase64(String encryptRequest) {
		try {
			return decryptByDESAndDecodeByBase64(encryptRequest, defaultKey);
		} catch (Exception e) {
			logger.error("decrpted parameters fail!!" + e.getMessage());
			return null;
		}
	}

	/**
	 * hmac算法
	 * 
	 * @param encryptText
	 * @param encryptKey
	 * @return
	 * @throws Exception
	 */
	public static String HmacSHA1Encrypt(String encryptText, String encryptKey) {
		try {
			// 根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
			SecretKey secretKey = new SecretKeySpec(encryptKey.getBytes(Constants.ENCODING), Constants.MAC_NAME);
			// 生成一个指定 Mac 算法 的 Mac 对象
			Mac mac = Mac.getInstance(Constants.MAC_NAME);
			// 用给定密钥初始化 Mac 对象
			mac.init(secretKey);

			return Base64Utils.encode(mac.doFinal(encryptText.getBytes(Constants.ENCODING)));

		} catch (Exception e) {
			logger.error("签名算法异常!" + e);
			return null;
		}
	}

}
