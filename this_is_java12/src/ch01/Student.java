package ch01;

public class Student {

	private int no;
	private String nm;
	
	public Student(int no, String nm) {
		this.no = no;
		this.nm = nm;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public String getNm() {
		return this.nm;
	}
	
	@Override
	public int hashCode() {
		return no + nm.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() && nm.equals(target.getNm())){
				return true;
			}
		}
		
		return false;
	}
	
}
