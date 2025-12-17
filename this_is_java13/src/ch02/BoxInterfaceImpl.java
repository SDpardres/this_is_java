package ch02;

public class BoxInterfaceImpl implements BoxInterface<Home> {

	@Override
	public Home box() {
		return new Home();
	}

}

