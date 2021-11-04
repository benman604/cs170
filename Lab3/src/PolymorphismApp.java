/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Driver class for employee app to test Manager, SeniorWorker, and RegularWorker classes
 */

//Demo: test for polymorphism in the Employee hierarchy

// import JOptionPane
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PolymorphismApp { // driver class
   public static void main( String[] args ) // main method
   {
      Employee[] ref = new Employee[3];  // superclass reference
      String output = "";

      Manager manager = new Manager( "Wang", 5800.00, 345.00, 200.00 ); // create employee instance
      SeniorWorker senior = new SeniorWorker( "Smith", 6250.0, 1500.0);
      RegularWorker regular = new RegularWorker( "Lee", 2980.00, 270.0);

      DecimalFormat precision2 = new DecimalFormat( "0.00" ); // decimal formatter

      ref[0] = manager;  // Employee reference to a manager

      ref[1] = senior;  // Employee reference to a senior worker

      ref[2] = regular;  // Employee reference to a regular Worker

      for(int i = 0; i < 3; i++)     			//polymorphic form output for different objects
        output += ref[i].toString() + " earned $" +
                precision2.format( ref[i].earnings() ) + "\n"; // add employee data to output

      JOptionPane.showMessageDialog( null, output, // display result
         "Demonstrating Polymorphism",
         JOptionPane.INFORMATION_MESSAGE );
   } // end main method
} // end driver class

