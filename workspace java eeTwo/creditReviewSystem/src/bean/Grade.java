package bean;

public class Grade {
	private int student_Id;
	private int course_Id;
	private float grade;
	public Grade() {
		super();
	}
	public Grade(int student_Id, int course_Id, float grade) {
		super();
		this.student_Id = student_Id;
		this.course_Id = course_Id;
		this.grade = grade;
	}
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public int getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(int course_Id) {
		this.course_Id = course_Id;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	

}
