import java.util.Scanner;

public class InClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//math ceiling rounds up to the next integer
		System.out.println(Math.ceil(1.1));
		//math floor rounds down to the next integer
		System.out.println(Math.floor(-1.99));
		//rounds to the nearest integer if it is a .5 then it rounds to the nearet even integer
		System.out.println(Math.rint(-4.5));
		// rounds normally where if its 2.5 it rounds to 3 and 2.49 rounds to 2
		System.out.println(Math.round(2.5));
		// returns the smaller of the two numbers max returns the larger
		System.out.println(Math.min(2.5, 2.6));
		// returns the absolute value
		System.out.println(Math.abs(-5));
		//prints out an A from its unicode number
		System.out.println('\u0041');
		char c = 'a';
		System.out.println(c + 1);
		char ch = (char)0xAB0041;
		System.out.println(ch);
		ch = (char)65.25;
		System.out.println(ch);
		int i = (int)'a';
		System.out.println(i);
		byte b = 'a';
		System.out.println(b);
		System.out.println('a'=='a');
		System.out.println('a'=='b');
		System.out.println("\t\t Today's lesson was \nvery \"boring\"");
				
		
		
	}

}
