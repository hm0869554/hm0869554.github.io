import java.util.Scanner;

public class Scratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		int[] incompletes = {1,2,3,4,5,1,1,2,3,3,5,5,5,5,7,7,9,9};
		int studentID = 5;
		int 
		numberOfIncompletes = 0;
		for(k = 0; k <incompletes.length; k++){
			if(incompletes[k] == studentID) {
				numberOfIncompletes++;
				System.out.print(numberOfIncompletes + " ");
			}
			
		}
		if(numberOfIncompletes == 0) {
			System.out.println("All Work Completed");
		}
	}

}
