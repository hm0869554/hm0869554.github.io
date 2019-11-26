import java.util.Scanner;

public class Exercise02_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Name: Hunter Murphy
		//Date: 8/31/2019
		
		Scanner userInput = new Scanner(System.in);
		
		double futureInvestmentValue;
		double investmentAmount;
		double monthlyInterestRate;
		double numberOfYears;
		
		System.out.println("Enter the investment amount: ");
		
		investmentAmount = userInput.nextDouble();
		
		System.out.println("Enter the annual interest rate in percent: ");
		
		monthlyInterestRate = userInput.nextDouble();
				
		monthlyInterestRate = monthlyInterestRate/100;
		
		System.out.println("Enter the number of years: ");
		
		numberOfYears = userInput.nextDouble();
		
		futureInvestmentValue = investmentAmount * Math.pow(monthlyInterestRate + 1, numberOfYears * 12);
		
		System.out.println("Accumulated value: $" + futureInvestmentValue);
	}

}
