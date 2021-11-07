/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: 
 */

import java.util.ArrayList;

public class Transcript {
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public int getCoursesLength() {
		return courses.size();
	}
	
	public void AddCourse(String studentName, String courseTitle, int credit, char finalGrade) {
		Course newCourse = new Course(studentName, courseTitle, credit, finalGrade);
		courses.add(newCourse);
	}
	
	public void RemoveCourse(int index) {
		try {
			courses.remove(index);
		}
		catch(IndexOutOfBoundsException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	public void Sort(String by) {
		courses.sort(CourseSortingHelper.comparators.get(by));
	}
	
	public int Search(String courseTitle) {
		for(Course i : courses) {
			if(i.getCourseTitle().equalsIgnoreCase(courseTitle)) {
				return courses.indexOf(i);
			}
		}
		return -1;
	}
	
	public void Print(int index) {
		try {
			Course mycourse = courses.get(index);
			System.out.println(
					"------------------------\n" +
					"Course Title: " + mycourse.getCourseTitle() + "\n" +
					"Credits: " + mycourse.getCredit() + "\n" +
					"Final Grade: " + mycourse.getFinalGrade()
			);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
