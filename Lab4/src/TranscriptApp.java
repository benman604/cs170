/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: Driver class to create Transcript object, collect input, and call Transcript's methods
 */

import java.util.Scanner; // import scanner

public class TranscriptApp { // driver class
	public static void main(String[] args) { // main method
		System.out.println("Weolcome to Transcript App."); 
		Scanner sc = new Scanner(System.in);  // create scanner
		Transcript transcript = new Transcript(); // create transcript
		
		System.out.print("Student Name: ");
		String studentName = sc.next(); // collect name input
		
		while(true) { // loop to create courses and add them to Transcript till n in inputed
			System.out.println("______________________________");
			System.out.print("Course Title (Enter n to stop): ");
			String courseTitle = sc.next(); // collect course title input
			if(courseTitle.equalsIgnoreCase("n")) // break loop if user inputs n
				break;
			
			int credit = Validator.validateIntWithRange(sc, "Credit: ", 0, 5); // collect/validate credit input
			char finalGrade = Validator.validataCharWithRange(sc, "Final Grade (A-F): ", 'A', 'F'); // collect/validate final grade input
			
			transcript.AddCourse(studentName, courseTitle, credit, finalGrade); // add course
		}
		
		while(true) { // loop to prompt next action until quit
			System.out.println("______________________________");
			System.out.println( // print options
					  "1.  Add Course\n"
					+ "2.  Remove Course\n"
					+ "3.  Sort By\n"
					+ "4.  Search\n"
					+ "5.  Display All\n"
					+ "6.  Quit");
			
			int input = Validator.validateIntWithRange(sc, "Selection an operation (1-6): ", 1, 6); // collect/validate input
			if(input == 6) // break from loop on user quit
				break;
			
			switch(input) { // switch case block for input
			case 1: // add course
				System.out.print("Course Title: ");
				String courseTitle = sc.next(); // collect course title input
				int credit = Validator.validateIntWithRange(sc, "Credit: ", 0, 5); // collect/validate credit input
				char finalGrade = Validator.validataCharWithRange(sc, "Final Grade (A-F): ", 'A', 'F'); // collect/validate final grade input
				transcript.AddCourse(studentName, courseTitle, credit, finalGrade); // add course
				break;
			case 2: // remove course
				System.out.print("Enter the name of the course you want to remove: ");
				String rname = sc.next(); // name of course to remove
				int removeIndex = transcript.Search(rname); // get index with name
				transcript.RemoveCourse(removeIndex); // remove course
				break;
			case 3: // sort by
				String[] sortByOption = {
						"1. Course Title",
						"2. Credit",
						"3. Final Grade"
				};
				for(String i : sortByOption) { // print all options
					System.out.println(i);
				}
				int sortByInput = Validator.validateIntWithRange(sc, "What would you like to sort by? (1-3) ", 1, 3); // collect/validate what user wants to sort by
				String sortBy = sortByOption[sortByInput-1].substring(3); // sort by option in string
				transcript.Sort(sortBy); // sort
				for(int i=0; i<transcript.getCoursesLength(); i++) { // print all courses
					transcript.Print(i);
				}
				System.out.println("------------------------");
				break;
			case 4: // search
				System.out.print("Enter the name of the course you want to find: ");
				String fname = sc.next(); // collect name input
				transcript.Print(transcript.Search(fname)); // print search result
				break;
			case 5: // display all
				for(int i=0; i<transcript.getCoursesLength(); i++) { // loop through courses
					transcript.Print(i); // print each one
				}
				System.out.println("------------------------");
				break;
			} // end switch case
		} // end prompt loop
	} // end main method
} // end driver class
