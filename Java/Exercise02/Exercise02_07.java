import java.util.Scanner;

public class Exercise02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Name: Hunter Murphy
		// Date: 8/29/2019
		
		Scanner userInput = new Scanner(System.in);
		double years;
		double days;
		double mins;
		
		System.out.print("Enter the number of minutes: ");
		
		mins = userInput.nextDouble();
		
		years = (int)mins/525600;
		
		mins = mins%525600;
		
		days = (int)mins/1440;
	
		System.out.println("Years: " + years);
		
		System.out.println("Days: " +days);
		
		
		
		
		
		
		
		
	}

}
