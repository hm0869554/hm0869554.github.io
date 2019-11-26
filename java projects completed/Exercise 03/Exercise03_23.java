import java.util.Scanner;
public class  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		double b;
		double c;
		double r1;
		double r2;
		double discriminant;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the a, b, and c coordinates");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		r1 = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), .5)/(2 * a));
		r2 = (-b - Math.pow((Math.pow(b, 2) - 4 * a * c), .5)/(2 * a));
		discriminant = Math.pow(b, 2) - 4 * a * c;
		if(discriminant > 0){
			System.out.println("The equation has two roots " + r1 +" and " + r2);
		}
		else if(discriminant == 0)  {
			System.out.println("The equation has one root " + r1);
		}
		else {
			System.out.println("The equation has no real roots");
		}
		
			
			
	}

}
