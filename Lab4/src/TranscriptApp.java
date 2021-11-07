/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: 
 */
import java.util.Scanner;

public class TranscriptApp {
	public static void main(String[] args) {
		System.out.println("Weolcome to Transcript App.");
		Scanner sc = new Scanner(System.in);
		Transcript transcript = new Transcript();
		
		System.out.print("Student Name: ");
		String studentName = sc.next();
		
		while(true) {
			System.out.println("______________________________");
			System.out.print("Course Title (Enter n to stop): ");
			String courseTitle = sc.next();
			if(courseTitle.equalsIgnoreCase("n"))
				break;
			
			int credit = Validator.validateIntWithRange(sc, "Credit: ", 0, 5);
			char finalGrade = Validator.validataCharWithRange(sc, "Final Grade (A-F): ", 'A', 'F');
			
			transcript.AddCourse(studentName, courseTitle, credit, finalGrade);
		}
		
		while(true) {
			System.out.println("______________________________");
			System.out.println(
					  "1.  Add Course\n"
					+ "2.  Remove Course\n"
					+ "3.  Sort By\n"
					+ "4.  Search\n"
					+ "5.  Display All\n"
					+ "6.  Quit");
			
			int input = Validator.validateIntWithRange(sc, "Selection an operation (1-6): ", 1, 6);
			if(input == 6)
				break;
			
			switch(input) {
			case 1:
				System.out.print("Course Title: ");
				String courseTitle = sc.next();
				int credit = Validator.validateIntWithRange(sc, "Credit: ", 0, 5);
				char finalGrade = Validator.validataCharWithRange(sc, "Final Grade (A-F): ", 'A', 'F');
				transcript.AddCourse(studentName, courseTitle, credit, finalGrade);
				break;
			case 2:
				System.out.print("Enter the name of the course you want to remove: ");
				String rname = sc.next();
				int removeIndex = transcript.Search(rname);
				transcript.RemoveCourse(removeIndex);
				break;
			case 3:
				String[] sortByOption = {
						"1. Course Title",
						"2. Credit",
						"3. Final Grade"
				};
				for(String i : sortByOption) {
					System.out.println(i);
				}
				int sortByInput = Validator.validateIntWithRange(sc, "What would you like to sort by? (1-3) ", 1, 3);
				String sortBy = sortByOption[sortByInput-1].substring(3);
				transcript.Sort(sortBy);
				for(int i=0; i<transcript.getCoursesLength(); i++) {
					transcript.Print(i);
				}
				System.out.println("------------------------");
				break;
			case 4:
				System.out.print("Enter the name of the course you want to find: ");
				String fname = sc.next();
				transcript.Print(transcript.Search(fname));
				break;
			case 5:
				for(int i=0; i<transcript.getCoursesLength(); i++) {
					transcript.Print(i);
				}
				System.out.println("------------------------");
				break;
			}
		}
	}
}
