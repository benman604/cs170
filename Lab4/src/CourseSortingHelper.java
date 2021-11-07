/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: 
 */

import java.util.Comparator;
import java.util.Hashtable;

public class CourseSortingHelper {
	static public Hashtable<String, Comparator<Course>> comparators = new Hashtable<String, Comparator<Course>>();
	
	static {
		comparators.put("studentName", new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
				return c1.getStudentName().compareTo(c2.getStudentName());
			}
		});
		
		comparators.put("courseTitle", new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
				return c1.getCourseTitle().compareTo(c2.getCourseTitle());
			}
		});
		
		comparators.put("credit", new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
				return Integer.compare(c1.getCredit(), c2.getCredit());
			}
		});
		
		comparators.put("finalGrade", new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
				return Character.compare(c1.getFinalGrade(), c2.getFinalGrade());
			}
		});
	}
}
