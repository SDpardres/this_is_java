package ch06;

import java.lang.reflect.*;

public class ReflectionSample {

	private Class clazz1;
	private Class clazz2;
	private Class clazz3;
	
	public ReflectionSample(WrapperClass wrapperclass) {
		
		this.clazz1 = WrapperClass.class;
		try {
			this.clazz2 = Class.forName("WrapperClass");
		}catch(ClassNotFoundException e) {
			e.getStackTrace();
		}
		this.clazz3 = wrapperclass.getClass();
	}
	
	public void getPackInfo() {
		System.out.printf("패키지 : %s\n", clazz1.getPackage().getName());
		System.out.printf("클래스 간단 이름 : %s\n", clazz1.getSimpleName());
		System.out.printf("클래스 전체 이름 : %s\n", clazz1.getName());
	}
	
	public void getMemberInfd() {
		for(Constructor c : clazz1.getDeclaredConstructors()) {
			System.out.printf("생성자 정보 : %s", c.getName());
			this.printParameters(c.getParameterTypes());
			System.out.printf("\n");
		}
		
		for(Method c : clazz1.getDeclaredMethods()) {
			System.out.printf("메소드 정보 : %s", c.getName());
			this.printParameters(c.getParameterTypes());
			System.out.printf("\n");
		}
		
		System.out.print("필드 정보 : ");
		for(Field c : clazz1.getDeclaredFields()) {
			System.out.printf(c.getType().getName() + " " + c.getName());
		}
		System.out.printf("\n");
	}
	
	private void printParameters(Class[] para) {
		for(Class c : para) {
			System.out.printf(c.getName().concat(" , "));
		}
	}
}
