package ch01;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;
import java.util.StringTokenizer;

import ch05.StringBytes;
import ch06.*;
import ch11.*;
import ch12.PrintAnnotation;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

		Member m1 = new Member("123");
		Member m2 = new Member("123");
		Member m3 = new Member("456");
		
		System.out.printf("m1 == m2 : %s\n", String.valueOf(m1.equals(m2)));
		System.out.printf("m1 == m3 : %s\n", String.valueOf(m1.equals(m3)));
		
		Student s1 = new Student(1, "abc");
		Student s2 = new Student(1, "abc");
		Student s3 = new Student(3, "abc");
		
		System.out.printf("equals => s1 == s2 : %s\n", String.valueOf(s1.equals(s2)));
		System.out.printf("hashCode => s1 == s3 : %s\n", s1.hashCode() == s3.hashCode());
		
		SmartPhone sp = new SmartPhone("Samsung", "Android");
		System.out.printf("override toString() : %s\n", sp.toString());
		System.out.printf("original toString() : %s\n", s3.toString());
		
		Person p1 = new Person("001", "ABC", 24);
		System.out.printf("신원 정보 → id : %s 이름 : %s 나이 : %s\n", 
				p1.id(), p1.name(), p1.age());
		System.out.printf("p1의 세부 정보 : %d\t%s\n", p1.hashCode(), p1.toString());
		
		System.err.println("에러 발생");
		
//		int keyCode = 0;
//		try {
//			keyCode = System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		exitProcessor(0);
		
		/* 프로퍼티 값 출력*/
		System.out.printf("OS : %s\n", System.getProperty("os.name"));
		System.out.printf("USER info : %s\n", System.getProperty("user.name"));
		System.out.printf("USER info : %s\n", System.getProperty("user.home"));
		
		/* 프로퍼티 키 : 값 출력*/
		Properties props = System.getProperties();
		for(Object objKey : props.keySet()) {
			String key = (String) objKey;
			System.out.printf("%-40s : %s\n", key, System.getProperty(key).toString());
		}
		
		String sample = "자바";
		try {
			StringBytes stringBytes = new StringBytes(sample.getBytes(), "EUC-KR");
			System.out.printf("UTF-8 인코딩 결과 : %s\n", stringBytes.getStr1());
			System.out.printf("EUC-KR 인코딩 결과 : %s\n", stringBytes.getStr2());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String strToken = Arrays.toString(sample.getBytes());
		StringTokenizer s = new StringTokenizer(strToken, ",");
		
		System.out.printf("분리할 수 있는 문자열의 총 수 : %d\n", s.countTokens());
		while(s.hasMoreTokens()) {
			System.out.printf("남아있는 문자열이 있는지 확인 : %s\n", String.valueOf(s.hasMoreTokens()));
			System.out.printf("문자열을 하나씩 가져옴 : %s\n", s.nextToken());
		}
		
		WrapperClass wc = new WrapperClass(10);
		wc.compareWrapper();
		ReflectionSample r = new ReflectionSample(wc);
		r.getPackInfo();
		r.getMemberInfd();
		
		Class is = ImageSource.class;
		System.out.printf("이미지 경로 :%s\n", is.getResource("image/hello_price.png"));
		System.out.printf("이미지 경로 :%s\n", is.getResource("image/lowest_pirce.png"));
		System.out.printf("이미지 경로 :%s\n", is.getResource("image/lowest_pirce.png").getPath());
		
		for(Method m : ImageSource.class.getDeclaredMethods()) {
			//PrintAnnotation 정보 얻기
			PrintAnnotation printAnnotation = m.getAnnotation(PrintAnnotation.class);
			
			printLine(printAnnotation);
			m.invoke(new ImageSource());
			printLine(printAnnotation);
		}
	}
	
	public static void exitProcessor(int status) {
		//통상적으로
		//0: 정상종료
		//1: 비정상 종료
		System.exit(status);
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			for(int i = 0; i < printAnnotation.prop2(); i++) {
				System.out.printf("%s\n", printAnnotation.value());
			}
		}
	}

}
