/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: Helper class to store comparators used to compare different variables of the Course class
 */

// import packages
import java.util.Comparator;
import java.util.Hashtable;

public class CourseSortingHelper {
	// store comparators in a hashtable
	static public Hashtable<String, Comparator<Course>> comparators = new Hashtable<String, Comparator<Course>>();
	
	// static block
	static {
		// comparator for string Course.studentName
		comparators.put("Student Name", new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
				return c1.getStudentName().compareTo(c2.getStudentName());
			}
		});
		
		// comparator for string Course.courseTitle
		comparators.put("Course Title", new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
				return c1.getCourseTitle().compareTo(c2.getCourseTitle());
			}
		});
		
		// comparator for int Course.credit
		comparators.put("Credit", new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
				return Integer.compare(c1.getCredit(), c2.getCredit());
			}
		});
		
		// comparator for char Course.finalGrade
		comparators.put("Final Grade", new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
				return Character.compare(c1.getFinalGrade(), c2.getFinalGrade());
			}
		});
	} // end static block
}
