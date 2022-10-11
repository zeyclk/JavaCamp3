package Entities;

public class Instructor {
	private int instructorId;
	private String instructorFirstName;
	private String instructorLastName;
	
	
	public Instructor(int instructorId,String firstName,String lastName) {
		this.instructorId=instructorId;
		this.instructorFirstName=firstName;
		this.instructorLastName=lastName;
		
	}


	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}


	public String getInstructorFirstName() {
		return instructorFirstName;
	}
	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}


	public String getInstructorLastName() {
		return instructorLastName;
	}
	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}
	
	
	
	
}
