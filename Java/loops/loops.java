import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. while loop
			int data, sum = 0;
			Scanner input = new Scanner(System.in);
			do {
				System.out.print("Enter an integer (the input ends if it is 0): ");
				data = input.nextInt();
				sum += data; //sum equals sum plus data;
				
			}while(data != 0);
			
			System.out.println("The sum is " + sum);
			for(int i = 0; i < 100; i++) {
				if(i %2 == 0)
					System.out.println("even: " + i);
			}
			
			
			int j = 0;
			while(j < 100) {
				if(j % 2 == 0)
					System.out.println("even: " + j);
				j++;
			}
	}

}
