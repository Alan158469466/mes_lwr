package com.tl.mes.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import org.apache.commons.codec.binary.Base64;

/**
 * 该类为工具类，封装一些工具方法
 * @author Alan
 */
public class Util {

	/**
	 * MD5加密
	 * 将传入的src加密处理
	 * @param src 明文字符串
	 * @return 加密后的字符串结果
	 * @throws NoSuchAlgorithmException 
	 */
	public static String md5(String src) throws NoSuchAlgorithmException{
		//将字符串信息采用MD5处理
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] output = md.digest(src.getBytes());//字符串变字节
		//将MD5处理结果利用Base64转成字符串
		String s = Base64.encodeBase64String(output);	
		return s;
	}
	
	
	/**
	 * 生成UUID
	 * @return UUID字符串
	 */
	public static String createUUID(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-","");
	}
	
	
	
}
