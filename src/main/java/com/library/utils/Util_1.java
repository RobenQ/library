package com.library.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Util_1 {
	public static String sHAEncrypt(String password) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA");
		String value = password;
		//int a = Integer.parseInt(value);
		//byte b = (byte) a;
		byte[] inpute = value.getBytes();
		mDigest.update(inpute);        //input可以是字节型或字节型数组
		String key = new BigInteger(mDigest.digest()).toString();
		return key;
	}
	
	public static String getUuid() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
