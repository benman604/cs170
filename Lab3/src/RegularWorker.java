/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Operation class for regular workers
 */

//Demo: RegularWorker class derived from Employee
//with a polymorphic method earnings()

public class RegularWorker extends Employee { // operation class
   protected double salary, overtimePay; // variables

   public RegularWorker( String name, double salary, double overtimePay) { // main method
      super( name );  // call superclass constructor
      this.salary = salary;
      this.overtimePay = overtimePay;
   }

   public double earnings() { return salary + overtimePay; }	//implements the method for polymorphism


   public String toString() {	//override the method to print the name
      return "Regular worker: " + getName();
   }
} // end operation class


