package ch05;

public class Course {

	public void registerCourseAll(Applicant<?> applicant) {
		System.out.printf("%s이(가) CourseAll 등록", applicant.kind.getClass().getSimpleName());
	}
	
	public void registerCourseStudnet(Applicant<? extends Student> applicant) {
		System.out.printf("%s이(가) CourseAll 등록", applicant.kind.getClass().getSimpleName());
	}
	
	public void registerCourseWorker(Applicant<? super Worker> applicant) {
		System.out.printf("%s이(가) CourseAll 등록", applicant.kind.getClass().getSimpleName());
	}
}
