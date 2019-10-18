//package midTermExamFall19;
// Name : Hunter Murphy
import java.util.Scanner;

	  //--------------------------------------------//
	 //					Project 1                  //
	//--------------------------------------------//

/*
Write a program that reads in ten(10) integers between 1 and 100 included. Save input numbers to an array of integers,
name 'list' and size 10. Declare a variable of type integer and name 'key'. Assign a random value from 1 to 100 to key 
variable.((int)Math.random() * 100 + 1).
Implement a method named linearSearch with the signature: public static int linearSearch(int[] x, int key).
The method compares the key with each element in the array. If a match is made, the linear search returns  the index of
the element in the array that matches the key. If no match found, the search returns -1. Invoke linearSearch from main
and if the returned value is -1 print 'key value is not in the array', otherwise print 'key value found in the array
and in position' the position of the returned value.
*/

 /*<-- Uncomment the block of code for Project 1
 
public class midTermExamFall19 {

	public static void main(String[] args) {
		//1. Create the input stream (Scanner...)
		//2. Create an array of 10 integers with the name 'list'.
		//3. Read the 10 integers from input (for..list[i]...nextInt()..)and assign each one to your array.
		//4. Declare an integer variable with the name 'key' and assign a random number to your variable.
		//5. Declare an integer variable with the name 'found' that gets the returning value from linearSearch(..) method.
		//6. Print a message related to your returned value.
		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
		int key =  (int)(Math.random() * 100);
		int found;
		System.out.println(key);
		System.out.println("Enter 10 integers from 1 to 100");
		for(int i = 0; i < list.length ; i++) 
		{	
			System.out.print("Integer " + (i + 1) + ": ");
			list[i] = input.nextInt();
			while(list[i] < 1 || list[i] > 100)
			{
				System.out.println("Integer not between 1 to 100. Please enter an integer from 1 to 100");
				list[i] = input.nextInt();
			}
		}
		found = linearSearch(list, key);
		if (found != -1)
		{
			System.out.println("key was found at position " + found);
		}
		else
		{
			System.out.println("Key not found");
		}
	}
	public static int linearSearch(int[] list, int key) {
		//Iterate the array and compare the elements of array 'list' with the 'key' (for..if..)
		//If 'key' is found return the position of the element (index)
		//else return -1
		int found = -1;
		for(int i = 0; i < list.length; i++)
		{
			if(key == list[i])
			{
				found = i;
			}
			
		}
		return found;
		
		
	}

}//End of uncomment block of code for Project 1 -->*/


		  //--------------------------------------------//
		 //					Project 2                  //
		//--------------------------------------------//

/*
Write a program that reads in ten(10) double type numbers between 1 and 100. Save input numbers to an array of
type double, size 10, and name 'dList'. Implement the method selectionSort that sorts the elements of the array in ascending
mode (i.e. 1, 2, 3, 4, 5..). From main method invoke the selectionSort, save the returned array, and print the sorted 
elements of the array.
selectionSort signature: public static double[] selectionSort(double[] dList)
*/

/* <-- Uncomment the block of code for Project 2
  
public class midTermExamFall19 {
	public static void main(String[] args) {
		//1. Create the input stream(Scanner...).
		//2. Create an array of 10 double values with the name 'dList'
		//3. Read the 10 doubles from input (for..dList[i]...nextDouble()..)and assign each one to your array.
		//4. Invoke the method; dList = selectionSort(dList);
		//5. dList is now sorted and you will have to display the elements of the array (for(double e: dList)...).
		Scanner input = new Scanner(System.in);
		double[] dList = new double[10];
		System.out.println("Please enter 10 doubles");
		for(int i = 0; i < dList.length; i++)
		{	
			System.out.print("Double " + (i+1) +": ");
			dList[i] = input .nextDouble();
		}
		dList = selectionSort(dList);
		for(int i = 0; i < dList.length; i++)
		{
			System.out.println(dList[i]);
		}
	}


	public static double[] selectionSort(double[] dList) {
		//Implement the selectionSort algorithm
		double currMinValue;
		int currMinIndex;
		for(int i = 0; i < dList.length; i++)
		{
			currMinValue = dList[i];
			currMinIndex = i;
			for(int j = i + 1; j < dList.length; j++)
			{
				if(currMinValue > dList[j])
				{
					currMinValue = dList[j];
					currMinIndex = j;
				}
			}
			if(currMinValue != dList[i])
			{
			dList[currMinIndex] = dList[i];
			dList[i] = currMinValue;
			}
		}
		
		return dList;
		}
	}
//}End of uncomment block of code for Project 2 --> */

		  //--------------------------------------------//
		 //					Project 3                  //
		//--------------------------------------------//

/*
In this project you will implement the binarySearch method where in the 'worst case' for an array of 1024 elements,
binary search approach needs log2(1024)+1 = 11 comparisons, while linear search approach needs 1024 comparisons.
For binary search to work, the elements in the array must already be ordered. Copy from Project 2 your implementation 
of the 'selectionSort' and paste the method to your current project.

Write a program that initializes an array of type double, size 32, and name 'rList' with 32 randomly generated 
double numbers in the range of [0-99]. (use Math.random() * 100). 
Declare a variable of type double and name 'key'. Assign a random value from 1 to 99 to key variable. (Math.random() * 100)
Call the 'selectionSort' method that takes as parameter the 'rList' and returns a sorted array. Next call the 
'binarySearch' method that takes as parameters the 'rList and the 'key'.

binarySearch signature: public static int binarySearch(double[] rList, double key);

The method compares the key with each element in the array. If a match is made, the binary search returns the index of
the element in the array that matches the key. If no match found, the search returns -1. Invoke binarySearch from main
and if the returned value is -1 print 'key value is not in the array', otherwise print 'key value found in the array
and in position' the position of the returned value.
*/

 /*//<-- Uncomment the block of code for Project 3

public class midTermExamFall19 {
	public static void main(String[] args) {
		//1. Create the input stream (Scanner...)
		//2. Create an array of 32 double type numbers with the name 'rList'.
		//3. Assign 32 randomly generated double values to your array(use for..rList[i], Math.random() * 100).
		//4. Declare a double variable with the name 'key' and assign a random number in range [1-99] to your variable.
		//5. Declare an integer variable with the name 'found' that gets the returning value from binarySearch(..) method.
		//6. Print a message related to your returned value.
		Scanner input = new Scanner(System.in);
		double[] rList = new double[32];
		double key;
		int found;
		key = (Math.random() * 100);
		for(int i = 0; i < rList.length; i++)
		{
			rList[i] = (Math.random() * 100) ;
		}
		found = binarySearch(rList , key);
		if(found != -1)
		{
			System.out.println("Key was found at Array position " + found);
		}
		else
		{
			System.out.println("Key was not found");
		}
	}
	public static double[] selectionSort(double[] rList) {
		//This method is taken from Project 2
		return rList;
	}
	public static int binarySearch(double[] rList, double key) {
		//Implement the binarySearch algorithm
		//Iterate the array and compare the elements of array 'rList' with the 'key' (for..if..)
		//If 'key' is found return the position of the element (index)
		//else return -1
		int found = -1;
		for(int i = 0; i < rList.length; i++) 
		{
			if(rList[i] == key)
			{
				found = i;
			}
		}
		return found;
		
		
		
		
	}
}//End of uncomment block of code for Project 3 --> */



		  //--------------------------------------------//
		 //					Project 4                  //
		//--------------------------------------------//

/*
Nested loops are often used to process (initialize, print..) a two-dimensional array.
Create a two-dimensional array with name 'matrix' and type int that has 4 rows and 4 columns. 
Initialize the array with input values. Remember that matrix.length gives the number of rows, and matrix[i].length gives
the number of columns. 
Implement a method with the name 'meanTwoDim' that returns the mean value of the elements of the array.
public static double meanTwoDim(int[][] matrix);
Use the given method printMatrix to display the elements of the array and print the mean value of the elements in the array.
*/

/* <-- Uncomment the block of code for Project 4
public class midTermExamFall19 {
	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static double meanTwoDim(int[][]matrix) {
		//Calculate the mean and return the result.
		//The [return 0] bellow is for the compiler not to complain, because when uncommented 
		//the method must return something
		double sum = 0;
		int matrixCount = 0;
		double mean;
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				sum += matrix[i][j];
				matrixCount++;
			}
		}
		mean = sum / matrixCount;
		return mean;
	}
	public static void main(String[] args) {
		//1. Create an integer type two dimensional array that has 4 rows, 4 columns and the name 'matrix'.
		//2. Create an input stream(Scanner...)
		//3. Iterate through all locations of the array and insert input data. (You need a nested loop)
		//4. Call the 'printMatrix' method to display the contents of the array.
		//5. Call the 'meanTwoDim' method and save the result to a double variable with the name 'mean'
		//6. Display the mean.
		double mean;
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[4][4];
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j ++)
			{	
				System.out.print("Enter a value for matrix[" + i + "]" + "[" + j + "]: ");
				matrix[i][j] = input.nextInt();
			}
		}
		printMatrix(matrix);
		mean = meanTwoDim(matrix);
		System.out.println("Average of the Matrix is " + mean);
	}
}//End of uncomment block of code for Project 4 --> */

//Good Luck!
