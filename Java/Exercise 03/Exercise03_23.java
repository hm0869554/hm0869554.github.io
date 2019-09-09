import java.util.Scanner;
public class Exercise03_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x;
		double y;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the x and y coordinates: ");
		x = input.nextDouble();
		y = input.nextDouble();
		
		if(x <= 2.5 && x>= -2.5 && y >= -5 && y<= 5) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		}
		else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		}
			
	}

}
