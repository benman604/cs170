/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Abstract class as template for employees
 */

//Demo: super abstract class Employee with abstract method for polymorphism 

public abstract class Employee { // abstract class
   private String name; // name

   // Constructor
   public Employee(String name ) { // constructor
      this.name = name;
   }

   public String getName() // name getter
      { return name; }
   
   public abstract double earnings();  //define an abstract method for polymorphism
} // end abstract class
