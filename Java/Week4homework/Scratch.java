import java.util.Scanner;

public class Exercise04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		String y;
		
		System.out.println("Please enter a number between or including 0 and 15: ");
		x = input.nextInt();
		
		if(x > 15 || x < 0) {
			System.out.println(x + " is an invalid input");
		}
		else	
		{y = Integer.toHexString(x);
		
		System.out.println(y);}
		
		
		
		
		
				
			
	}

}
