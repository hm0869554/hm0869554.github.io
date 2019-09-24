import java.util.Scanner;

public class Scratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		int consec = 0;
		int number;
		int prev;
		
		number = stdin.nextInt();
		
		while(number >= 0) 
		{
			if(prev == number) 
			{
				consec++;
			}
			prev = number;
		}
		System.out.println(consec);
		
				
			
	}

}
