/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: Operation class to store a set of courses as a student's transcript
 */

import java.util.ArrayList; // import ArrayList

public class Transcript { // operation class
	private ArrayList<Course> courses = new ArrayList<Course>(); // arraylist of courses
	
	public int getCoursesLength() { // returns number of courses
		return courses.size();
	}
	
	public void AddCourse(String studentName, String courseTitle, int credit, char finalGrade) { // adds course to array
		Course newCourse = new Course(studentName, courseTitle, credit, finalGrade); // create course
		courses.add(newCourse); // add to array
	}
	
	public void RemoveCourse(int index) { // removes course based on index in array
		try { // try block
			courses.remove(index); // remove course
		}
		catch(IndexOutOfBoundsException ex) { // catch invalid index
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	public void Sort(String by) { // sort array based on comparator name in CourseSortingHelper
		courses.sort(CourseSortingHelper.comparators.get(by)); // get comparator and sort
	}
	
	public int Search(String courseTitle) { // returns index of course based on course title
		for(Course i : courses) { // loop through courses
			if(i.getCourseTitle().equalsIgnoreCase(courseTitle)) { // course title matches input
				return courses.indexOf(i); // return index
			}
		}
		// no course with that name, return -1
		System.out.println("ERROR: No course with that title");
		return -1;
	}
	
	public void Print(int index) { // prints course based index in array
		try { // try block
			Course mycourse = courses.get(index); // get course
			System.out.println( // print course data
					"------------------------\n" +
					"Course Title: " + mycourse.getCourseTitle() + "\n" +
					"Credits: " + mycourse.getCredit() + "\n" +
					"Final Grade: " + mycourse.getFinalGrade()
			);
		} catch (Exception ex) { // catch all exceptions
			System.out.println(ex.getMessage());
		}
	}
} // end operation class
