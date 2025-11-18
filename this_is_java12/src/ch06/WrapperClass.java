package ch06;

public class WrapperClass {

	private Integer wrapperInt;
	private int iInt;
	
	public WrapperClass(int i) {
		this.wrapperInt = i;			//박싱
		this.iInt = this.wrapperInt;	//언박싱
	}
	
	public int calSample() {
		return this.wrapperInt + this.iInt;
	}
	
	public void compareWrapper() {
		Integer wrapperInt2 = this.iInt;
		System.out.printf("두 객체의 == 결과 : %s\n", String.valueOf(wrapperInt2 == wrapperInt));
	}
}
