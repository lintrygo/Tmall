package bean;

public class PlanCourse {
private int planId;
private int courseId;
public PlanCourse(){}
public PlanCourse(int planId, int courseId) {
	super();
	this.planId = planId;
	this.courseId = courseId;
}
public int getPlanId() {
	return planId;
}
public void setPlanId(int planId) {
	this.planId = planId;
}
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}

}
