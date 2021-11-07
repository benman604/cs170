/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: 
 */

public class Course {
	// instance variables
	private String studentName;
	private String courseTitle;
	private int credit;
	private char finalGrade;
	
	// constructor method
	public Course(String studentName, String courseTitle, int credit, char finalGrade) {
		this.studentName = studentName;
		this.courseTitle = courseTitle;
		this.credit = credit;
		this.finalGrade = finalGrade;
	}
	
	// setters and getter methods
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public char getFinalGrade() {
		return finalGrade;
	}
	public void setFinalGrade(char finalGrade) {
		this.finalGrade = finalGrade;
	}
}
