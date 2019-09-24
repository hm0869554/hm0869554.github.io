import java.util.Scanner;

public class Scratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
	
		int n;
		n = 10;
		n = stdin.nextInt();
		while (n > 0){
			
			if(n>100) {
				System.out.print(n + " ");
				n = stdin.nextInt();
			}
			
			else
			{
				n = stdin.nextInt();
			}
		}
		
		
				
			
	}

}
