import java.util.Scanner;
 
public class Exercise04_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String ssn;
		
		System.out.println("Please enter a social security number");
		ssn = input.next();
		
		if(ssn.matches("\\d{3}-\\d{2}-\\d{4}")){
			System.out.println(ssn + " is a valid social security number");
		}
		else {
			System.out.println(ssn + " is an invalid social security number");
		}
	}

}
