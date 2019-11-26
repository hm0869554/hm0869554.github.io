import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		int [] myList1 = {1,2,3,4,5};
		int [] myList2 = myList1;
		for (int e: myList2) {
			System.out.print(e + " ");
		}
		
		myList1 [0] = 10;
		for(int e : myList2){
			System.out.print(e + " ");}
		
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		
		System.out.println("Array Length: " + myList.length);
		
		int [] iList = {2,5,7,3,1};
			for(int i = 0; i < iList.length; i++) {
				System.out.println(iList[i] + " ");
			}
			
		char [] city = {'D', 'a', 'l', 'l', 'a' , 's'};
		System.out.print(city);*/
		
		Scanner input = new Scanner(System.in);
		double[] list = new double [10];
		for(int i=0; i < 10; i++) 
		{
			list[i] = input.nextDouble();
		}
		
		list = selectionSort(list);
		for(double e : list) {
			System.out.println(e + " ");
		}
		
		
	
			
	}
	
	public static double[] selectionSort(double []list) 
	{
		double currMinValue;
		int currMinIndex;
		
		for(int i =0; i < list.length - 1 ; i++) 
		{
			currMinValue = list[i];
			currMinIndex = i;
			for(int j = i + 1; j < list.length; j++) 
			{
				if (currMinValue > list [j]) 
				{
					currMinValue = list[j];
					currMinIndex = j;
				}
			}
			if(currMinValue !=i) 
			{
				list[currMinIndex] = list[i];
				list[i] = currMinValue;
			}	
		}return list;
	}
	

}


/*
- Read from input and asign the values to an array
1 Linear Search (takes an arroy ints and a key) will return true if key value is in array otherwise false
key = (int)Math.random() * 10; will create a random key of values from 0 to 9;
2.Select Sort (what selection sort is
3.Binary Search  (1 2 3 4 5 6 7 8 9 10) starts at middle if less goes down if higher goes up
4. Two Dimensional Array */