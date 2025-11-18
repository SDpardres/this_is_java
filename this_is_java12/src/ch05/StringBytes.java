package ch05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringBytes {
	
	private String str1;
	private String str2;
	
	public StringBytes(byte[] bytes, String charsetName) throws UnsupportedEncodingException {
		//기본 문자셋으로 byte 배열을 디코딩해서 String 객체로 생성
		str1 = new String(bytes);
		//특정 문자셋으로 byte 배열을 디코딩해서 String 객체로 생성
		str2 = new String(bytes, charsetName);
		
		System.out.println("byte 배열 인코딩 : " + Arrays.toString(bytes));
	}
	
	
	public String getStr1() {
		return this.str1;
	}
	
	public String getStr2() {
		return this.str2;
	}
}
