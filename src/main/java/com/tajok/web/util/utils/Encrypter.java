package com.tajok.web.util.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Encrypter {
	
	public static String md5(String str){
		MessageDigest messageDigest = null;     
	     
        try {     
            messageDigest = MessageDigest.getInstance("MD5");     
     
            messageDigest.reset();     
     
            messageDigest.update(str.getBytes("UTF-8"));     
        } catch (NoSuchAlgorithmException e) {     
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
        	e.printStackTrace();
        }     
     
        byte[] byteArray = messageDigest.digest();     
     
        StringBuffer md5StrBuff = new StringBuffer();     
     
        for (int i = 0; i < byteArray.length; i++) {                 
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)     
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));     
            else     
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));     
        }     
     
        return md5StrBuff.toString();   
	}
	
	public static String randFileName(){
		String result = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		result += sdf.format(date);
		Double rand =  Math.random()*10000;
		if(rand < 10)
			result += "000" + rand.toString().substring(0, 1);
		else if(rand < 100)
			result += "00" + rand.toString().substring(0, 2);
		else if(rand < 1000)
			result += "0" + rand.toString().substring(0, 3);
		else
			result += rand.toString().substring(0, 4);
		
		return result;
	}
	
}
