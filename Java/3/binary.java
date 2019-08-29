
public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printing out different number systems
		System.out.println(0Xd);
		System.out.println(1.0f/3.0f);
		int y = 10;
		System.out.println(y+=5-2);
		int x = 10;
		System.out.println(x*=(5-2)/5+7);
		
		//Incremental and decremental commands
		int I =10;
		++I;
		I++;
		//++ increases by 1
		System.out.println("I: " + I);
		--I;
		System.out.println("I: " + I);
		int J = 0;
		I = 0;
		J= 0 + ++I;
		System.out.println("j: " + J);
		System.out.println("I: " + I);
		
		
		//converting Numeric types
		double d = 4.5;
		int i = (int) d;
		System.out.println("i: " + i);
		System.out.println((double)1/2);
		
	}

}
