package ch11;

import ch12.PrintAnnotation;

public class ImageSource {

	@PrintAnnotation("")	//value에 자동 대입
	public void annotationTest1() {
		
	}
	
	@PrintAnnotation(value="값", prop2=5)
	public void annotationTest2() {
		
	}
}
