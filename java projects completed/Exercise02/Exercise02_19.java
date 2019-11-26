import java.util.Scanner;

public class Exercise02_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Name: Hunter Murphy
		// Date: 8/30/2019
		
		Scanner userInput = new Scanner(System.in);
		
		double s;
		double area;
		double x1;
		double x2;
		double y1;
		double y2;
		double x3;
		double y3;
		double xTotal;
		double yTotal;
		double dif1;
		double dif2;
		double dif3;
		//ask for the coordinates
		System.out.print("Please enter the X1 and Y1 Coordinates: ");
		
		x1 = userInput.nextDouble();
		
		
		y1 = userInput.nextDouble();
		
		System.out.print("Please enter the X2 and Y2 Coordinates: ");
		
		x2 = userInput.nextDouble();
		
		
		y2 = userInput.nextDouble();
		
		System.out.print("Please enter the X3 and Y3 Coordinates");
		
		x3 = userInput.nextDouble();
		
		y3 = userInput.nextDouble();
		
		//calculate side 1
		
		xTotal = x2 - x1;
		
		yTotal = y2 - y1;
		
		xTotal = Math.pow(xTotal, 2);
				
		yTotal = Math.pow(yTotal, 2);
		
		dif1 = xTotal + yTotal;
		
		dif1 = Math.sqrt(dif1);
		
		//calculate side 2
		
		xTotal = x2 - x3;
		
		yTotal = y2 - y3;
		
		xTotal = Math.pow(xTotal, 2);
				
		yTotal = Math.pow(yTotal, 2);
		
		dif2 = xTotal + yTotal;
		
		dif2 = Math.sqrt(dif2);
		
		//calcualte side 3
		
		xTotal = x1 - x3;
		
		yTotal = y1 - y3;
		
		xTotal = Math.pow(xTotal, 2);
				
		yTotal = Math.pow(yTotal, 2);
		
		dif3 = xTotal + yTotal;
		
		dif3 = Math.sqrt(dif3);
		
		//calculate area
		
		s = (dif1 + dif2 + dif3)/2;
		
		s = (s*(s-dif1)*(s-dif2)*(s-dif3));
		
		area = Math.sqrt(s);
		
		System.out.println("The area of the triangle is " + area);
	}

}
