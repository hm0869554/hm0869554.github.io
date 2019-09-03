import java.util.Scanner;

public class Exercise02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Name: Hunter Murphy
		//Date: 8/30/2019
		
		Scanner userInput = new Scanner(System.in);
		double xTotal;
		double yTotal;
		double x1;
		double x2;
		double y1;
		double y2;
		double dif;
		
		System.out.print("Please enter the X1 and Y1 Coordinates: ");
		
		x1 = userInput.nextDouble();
		
		
		y1 = userInput.nextDouble();
		
		System.out.print("Please enter the X2 and Y2 Coordinates: ");
		
		x2 = userInput.nextDouble();
		
		
		y2 = userInput.nextDouble();
		
		xTotal = x2 - x1;
		
		yTotal = y2 - y1;
		
		xTotal = Math.pow(xTotal, 2);
				
		yTotal = Math.pow(yTotal, 2);
		
		dif = xTotal + yTotal;
		
		dif = Math.sqrt(dif);
		
		System.out.println("The distance between the two points is " + dif);
	}

}
