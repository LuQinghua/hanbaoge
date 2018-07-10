package com.jiabian.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	public static final String MD5 = "MD5";

	public static String encryptionStr(String pw) {
		try {

			// 拿到一个MD5转换器（如果想要SHA1参数换成”SHA1”）
			MessageDigest messageDigest = MessageDigest.getInstance(MD5);
			// 输入的字符串转换成字节数组
			byte[] inputByteArray = pw.getBytes();
			// inputByteArray是输入字符串转换得到的字节数组
			messageDigest.update(inputByteArray);
			// 转换并返回结果，也是字节数组，包含16个元素
			byte[] resultByteArray = messageDigest.digest();
			// 字符数组转换成字符串返回
			return byteArrayToHex(resultByteArray);
		} catch (NoSuchAlgorithmException e) {
			return null;
		}
	}

	
	public static String MD5Encode(String origin) {
        String resultString = null;
        try {
            resultString = origin;
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHex(md.digest(resultString.getBytes("utf-8")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultString;
    }
	
	public static String byteArrayToHex(byte[] byteArray) {

		// 首先初始化一个字符数组，用来存放每个16进制字符
		char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		// new一个字符数组，这个就是用来组成结果字符串的（解释一下：一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方））
		char[] resultCharArray = new char[byteArray.length * 2];
		// 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去
		int index = 0;
		for (byte b : byteArray) {
			resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
			resultCharArray[index++] = hexDigits[b & 0xf];
		}
		// 字符数组组合成字符串返回
		return new String(resultCharArray);
	}
	
	public static void main(String[] args){
		System.out.println(MD5Encode("jb2619"));
		String str = "<span style=\"font-family:宋体;font-size:14px;\">孙志勤：字半村，号一知，半边店主，新安江丁。任新安书画家协会理事，中国美术家协会安徽分会会员，</span><span style=\"font-family:宋体;font-size:14px;letter-spacing:0pt;line-height:1.5;\">安徽当代中国山水画研究院秘书长，中国书画家协会理事，中国书画研究院研究员，黄山市美术家协会理事，黟县美术家协会副主席，新安书画家协会理事。曾师从于：新金陵画派代表人物尚可，花鸟大家孙其峰，长江画派代表人物施江城。花鸟、山水兼修，尤擅长山水画。</span>";
		System.out.println(str.replaceAll( "</?[a-zA-Z]+[^><]*>", ""));
	}
}
