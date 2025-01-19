package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String studentPassed() {
		return (finalGrade() > 60) ? "PASS" : "FAILED";
	}
	
	public double pointsMissing() {
		return 60 - finalGrade();
	}
}
