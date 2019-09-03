import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery = (int)(Math.random()*100);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		int lotteryDigit1 = lottery/10;
		int lotteryDigit2 = lottery%10;
		int guessDigit1 = guess/10;
		int guesDigit2 = guess%10;
	}

}
