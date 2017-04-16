package bean;

public class Class {
	private int clazzId;
	private int clazzStudentNum;

	public Class() {

	}

	public Class(int clazzId, int clazzStudentNum) {
		super();
		this.clazzId = clazzId;
		
		this.clazzStudentNum = clazzStudentNum;
		
	}

	public int getClazzId() {
		return clazzId;
	}

	public void setClazzId(int clazzId) {
		this.clazzId = clazzId;
	}

	

	public int getClazzStudentNum() {
		return clazzStudentNum;
	}

	public void setClazzStudentNum(int clazzStudentNum) {
		this.clazzStudentNum = clazzStudentNum;
	}

	

}
