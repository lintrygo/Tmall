package bean;

public class Training {
private int training_Id;
private String training_Name;
public Training(){
	
}
public Training(int training_Id, String training_Name) {
	super();
	this.training_Id = training_Id;
	this.training_Name = training_Name;
}
public int getTraining_Id() {
	return training_Id;
}
public void setTraining_Id(int training_Id) {
	this.training_Id = training_Id;
}
public String getTraining_Name() {
	return training_Name;
}
public void setTraining_Name(String training_Name) {
	this.training_Name = training_Name;
}

}
