import java.util.Scanner;

public class Scratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double InvestmentAmount;
		double MonthlyInterestRate;
		int years;
		System.out.println("Enter the Investment Amount");
		InvestmentAmount = input.nextDouble();
		System.out.println("Enter the Monthly Interest Rate");
		MonthlyInterestRate = input.nextDouble();
		System.out.println("Enter the number of years");
		years = input.nextInt();
		
		futureInvestmentValue(InvestmentAmount, MonthlyInterestRate, years);
		
	}
	
	public static double futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int years) {
		double InvestmentValue = 0;
		monthlyInterestRate = monthlyInterestRate/1200;
		for(int i = 1; i <= years; i++) {
			InvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, i * 12);
			InvestmentValue = Math.floor(InvestmentValue *100.0)/100.0;
			System.out.println(i + " " + InvestmentValue);
		}
		
		
		return investmentAmount;
	}
		

}
