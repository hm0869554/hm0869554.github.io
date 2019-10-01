import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] myList1 = {1,2,3,4,5};
		int [] myList2 = myList1;
		for (int e: myList2) {
			System.out.print(e + " ");
		}
		
		myList1 [0] = 10;
		for(int e : myList2){
			System.out.print(e + " ");}
		
		/*for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		
		System.out.println("Array Length: " + myList.length);
		
		int [] iList = {2,5,7,3,1};
			for(int i = 0; i < iList.length; i++) {
				System.out.println(iList[i] + " ");
			}
			
		char [] city = {'D', 'a', 'l', 'l', 'a' , 's'};
		System.out.print(city);*/
	
			
	}

}