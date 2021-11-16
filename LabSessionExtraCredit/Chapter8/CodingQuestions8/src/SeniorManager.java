//SeniorManager class derived from Manager
//override earnings() method to perform polymorphic operation

public final class SeniorManager extends Manager {
   private double meritPay;

   public SeniorManager( String name, double salary, double overtimePay, double bonus, double meritPay) {
      super( name, salary, overtimePay, bonus );  // call superclass constructor
      this.meritPay = meritPay;
   }

   public double earnings() { return super.earnings() + meritPay; }	//override the polymorphic method for senior manager


   public String toString() {	//override the method to print the name
      return "Senior Manager: " + super.getName();
   }
}  