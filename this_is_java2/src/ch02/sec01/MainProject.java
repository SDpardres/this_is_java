package ch02.sec01;

public class MainProject {

	public static void main(String[] args) {
		
		//1. 변수
		int score; //변수 선언
		score = 90; //값 대입
		
		int age = 20; //생성 & 대입을 한 줄로 표현
		
		int value;
		//int result = value + 20; 초기화 안된 변수를 읽음
		
		//byte result = score * 2; 값 허용 범위를 넘어섬
		
		//2. 타입 : 정수
		char a = 'a';
		int charA = 'b';
		System.out.printf("유니코드 연산 : %d\n", a+charA);
		System.out.printf("문자 출력 : %s\n", (char) charA);
		
		long var1 = 3000000000L;
		long var2 = 20;
		//long var3 = 3000000000; long 타입에 대한 out of range 에러 발생
		
		//3. 타입 : 실수
		float fA = 0.5f;
		//float fB = 0.5; float에 대한 type mismatch 발생
		
		System.out.printf("5e2 : %f\n0.12E-2 : %f\n", 5e2, 0.12E-2);
		
		//4. 타입 : 논리
		boolean stop = true;
		boolean nonStop = 5 > 10;
		System.out.printf("result1 : %s\nresult2 : %s\n", 
				String.valueOf(stop), 
				String.valueOf(nonStop));
		
		//5. 타입 : 문자열
		char cA = 'a';		//문자 	-> 유니코드 변환
		String strA = "a";	//문자열 	-> 유니코드 변환 불가능
		
		String name = "홍\t길\t동";
		name = name.concat("\n나이 : 20");
		System.out.println(name);
		
		String total = """
				홍	길	동
				나이 : 20 \
				\\만 19
				""";
		System.out.println(total);
	}

}
