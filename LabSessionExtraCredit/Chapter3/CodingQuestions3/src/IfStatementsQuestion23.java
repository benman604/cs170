
public class IfStatementsQuestion23 {

	public static void main(String[] args) {
		// 1) Write an if statement to satisfy the condition: if the value of variable named letter is lessthan ‘z’, variable x increases by 1.
		if(letter < 'z') {
			x++;
		}
		
		// (2) Write an if-else statement to satisfy the conditions: if the value of variable named letter isless than ‘z’, increases variable x by 1; otherwise, increases variable y by 1.
		if(letter < 'z') {
			x++;
		}
		else {
			y++;
		}
		
		// (3) Write an if-else statement to satisfy the conditions: if the expression x < y <= z, useSystem.out.println() to display the value of y; otherwise display the values of y and z.
        if(x < y && y <= z) {
            System.out.println(y);
        }
        else {
            System.out.println(y);
            System.out.println(z);
        }
        
        // (4) Write an if-else statement to satisfy the conditions: if the expression x <= z, use System.out.println() to display the values of x and z; otherwise if x > y, then display the values of x and y.
        if(x <= z) {
            System.out.println(x);
            System.out.println(z);
        }
        else if(x > y){
            System.out.println(x);
            System.out.println(y);
        }
	}

}
