package ch01;

import ch03.*;
import ch04.*;
import ch05.*;

public class Main {

	public static void main(String[] args) {

		Box<Product, String> b1 = new Box<>();
		b1.setKind(new Product());
		b1.setModel("abc123");
		
		Product p = b1.getKind();
		
		System.out.println(b1.equals(p));
		
		NewContainer nct = new NewContainer();
		String genericMethod = nct.getT();
		
		Numbers num = new Numbers(50);
		System.out.println(num.returnDouble());
		
		
		Course c = new Course();
		
		c.registerCourseAll(new Applicant<Person>(new Person()));
		c.registerCourseStudnet(new Applicant<HighStudent>(new HighStudent()));
		c.registerCourseWorker(new Applicant<Person>(new Person()));
	}

}
