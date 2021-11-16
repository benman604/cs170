
//Demo: super abstract class Employee with abstract method for polymorphism 

public abstract class Employee {
   private String name;

   // Constructor
   public Employee(String name ) {
      this.name = name;
   }

   public String getName()
      { return name; }
   
   public abstract double earnings();  //define an abstract method for polymorphism
}
