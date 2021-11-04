import java.util.Scanner;
public class SwitchTestApp{

      public static void main(String[] args) {

              int dayOfWeek;                    //Declare variables
              String day ="";

              Scanner sc = new Scanner(System.in);

              do {
                System.out.print("Please enter a number (1 to 7). Enter 0 to terminate: ");
                dayOfWeek = sc.nextInt();
                
                 switch(dayOfWeek) {    //switch-case
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 6:        day = "day of week: Work day";
                                 break;
                     case 1:
                     case 7:        day = "day of week: Weekend";
                                 break;
                     case 0:     day = "";
                 }   //End of switch-case
                
                System.out.println(day);
              }
              while(dayOfWeek != 0);
              
              sc.close();
          }

}
