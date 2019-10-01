import java.util.Scanner;

public class Scratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int longest = 0;
		int count = 0;
		while(input.hasNext()) {
		int length = input.next().length();
		if(length > longest) {
		count = 1;
		longest = length;
		} else if(length == longest) {
		count ++;
		}
		}
	}

}
