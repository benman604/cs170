import java.util.Scanner;
public class TypesOfLoopsQuestion11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // (1)
        int response = sc.nextInt();
        int count = 0;
        do {
            System.out.println("response is " + response);
            response = sc.nextInt();
            count++;
        }
        while (response >= 0 && response <= 99);
        
        // (2)
        for(;;) {
            int responce = sc.nextInt();
            if(responce < 0 || responce > 99) {
                break;
            }
            System.out.println("response is " + responce);
        }
        
        // (3)
        int intData = 10;
        while (intData >= 10){
            intData = sc.nextInt();
            if(intData >= 10)
                System.out.println(" " + intData);
        }
        
        // (4)
        int sum = 0;
        for(int count = 0; count <= 1299; count++) {
            sum += count;
        }
	}
}
