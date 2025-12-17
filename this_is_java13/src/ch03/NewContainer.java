package ch03;

public class NewContainer {

	public <T> T getT() {
		Container<T> ct = new Container<>();
		
		return ct.get();
	}
}

