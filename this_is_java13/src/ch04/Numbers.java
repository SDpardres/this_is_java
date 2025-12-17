package ch04;

public class Numbers<T extends Number> {

	private T num;
	
	public Numbers(T num) {
		this.num = num;
	}
	
	public double returnDouble() {
		return this.num.doubleValue();
	}
}

