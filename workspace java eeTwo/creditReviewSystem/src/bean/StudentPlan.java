package bean;

public class StudentPlan {
	private int student_Id;
	private int plan_Id;

	public StudentPlan() {
		super();
	}
	public StudentPlan(int training_Id, int Id) {
		super();
		this.plan_Id = training_Id;
		this.student_Id = Id;
	}
	public int getTraining_Id() {
		return plan_Id;
	}
	public void setTraining_Id(int training_Id) {
		this.plan_Id = training_Id;
	}
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int course_Id) {
		this.student_Id = course_Id;
	}
	

}
