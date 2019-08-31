import java.util.Scanner; 

public class Exercise02_05

 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//name : Hunter Murphy
		//Date: 8/29/2019
		double Subtotal;
		double gratuityRate;
		double gratuity;
		Scanner userInput = new Scanner(System.in);
		double total;
		
		System.out.print("Please enter in the subtotal: $");
		
		Subtotal = userInput.nextDouble();
		
		System.out.print("Enter Gratuity Rate :");
		
		gratuityRate = userInput.nextDouble();
		
		System.out.println("Gratuity rate: " + gratuityRate + "%");
		
		gratuityRate = gratuityRate/100;
		
		System.out.println(gratuityRate);
		
		gratuity = gratuityRate * Subtotal;
		
		System.out.println("Gratuity: $" + gratuity);
		
		total = Subtotal + gratuity;
		
		System.out.println("Total: $" + total);
		
	}

}
