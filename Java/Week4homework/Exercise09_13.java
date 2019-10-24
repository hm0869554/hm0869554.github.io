import java.util.Scanner;
class Location
{
	public static int[] locateLargest(double[][] a) {
		int[] location = new int[] {0, 0};
		double largest = a[0][0];
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (largest < a[i][j]) {
                    largest = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
            
	}
		
		return location;
}
	
}
public class Exercise09_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int rows = input.nextInt();
		int columns = input.nextInt();
		double [][] userArray = new double [rows][columns];
		System.out.println("Enter the array: ");
		for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                userArray[i][j] = input.nextDouble();
            }
        }
		int[] location = Location.locateLargest(userArray);
		System.out.print("The location of the largest element is ("+ location[0] + ", " + location[1] + ")");
		
	}

}
