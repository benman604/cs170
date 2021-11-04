/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Operation class for manager
 */

//Demo:Manager class derived from RegularWorker
//override earning() method as a polmorphism operation

public class Manager extends RegularWorker { // operation class
   protected double bonus;

   public Manager( String name, double salary, double overtimePay, double bonus) { // constructor
      super( name, salary, overtimePay);  // call superclass constructor
      this.bonus = bonus;
   }

   public double earnings() { return super.earnings() + bonus ; }	//override the method for polymorphism for Manager


   public String toString() {	//override the method to print the name
      return "Manager: " + super.getName();
   }
} // end operation class

