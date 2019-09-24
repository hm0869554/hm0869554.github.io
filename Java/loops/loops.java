import java.util.Scanner;

public class loops {

public static double printGrade (double score) {
		double square;
		
		square = score * score;
		
		return square;
}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. while loop
			
		Scanner input = new Scanner(System.in);
		double k = input.nextDouble();
		double A;
		A = printGrade(k);
		System.out.println(A);
		}
		
	
	
	}
			

