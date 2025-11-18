package ch01;

public class Member {
	
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		//매개값이 Member 타입인지 검사하고 타입 변환 후 target 변수에 대입
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {	//문자열 리터럴 비교
				return true;
			}
		}
		return false;
	}
}
