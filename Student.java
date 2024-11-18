
package assignment2;

public class Student implements Comparable<Student> {
	
	private int studentID;
	private String stuName;
	private String email;
	private int grade;

	@Override
	public int compareTo(Student other) {
		return Integer.compare(this.grade, other.grade);
	}
	
	 @Override
	 public String toString() {
		 return "Student ID: " + studentID +
				 ", Name: " + stuName +
	               ", Email: " + email +
	               ", Grade: " + grade;
	    }
	
	public Student(int studentID, String stuName, String email, int grade) {
		this.studentID = studentID;
		this.stuName = stuName;
		this.email = email;
		this.grade = grade;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public String getEmail () {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
