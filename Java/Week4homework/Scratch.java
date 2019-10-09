import java.util.Scanner;

public class Scratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[] zipcodeList = {2,1,5,7,9,27,0,0};
		int memberId = 29;
		
		System.out.println(Membership(zipcodeList));
		
		
		
	}
	
	public static boolean Membership( int[]zipcodeList) {
		boolean duplicates = false;
		for(int k = 0; k < zipcodeList.length - 1; k++)
		{
			for(int j = zipcodeList.length - 1; j > k; j--)	
				if(zipcodeList[k] == zipcodeList[j])
				{
					duplicates = true;
				}
				
		}
		return duplicates;
	}
		

}
