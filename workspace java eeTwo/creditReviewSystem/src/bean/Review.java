package bean;

public class Review {
	private int student_Id;
	private boolean state;
	private float gradePoint;
	public Review() {
		super();
	}
	public Review(int student_Id, boolean state, float gradePoint) {
		super();
		this.student_Id = student_Id;
		this.state = state;
		this.gradePoint = gradePoint;
	}
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public float getGradePoint() {
		return gradePoint;
	}
	public void setGradePoint(float gradePoint) {
		this.gradePoint = gradePoint;
	}
	

}
