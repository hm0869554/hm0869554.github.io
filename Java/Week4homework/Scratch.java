import java.util.Scanner;

public class Scratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter list: ");
		num = input.nextInt();
		int[] list = new int[num];
		for(int i = 0; i < num; i++)
		{
			list[i] = input.nextInt();
		}
		boolean sort = isSorted(list);
		if(sort == true)
		{
			System.out.println("The list is sorted");
		}
		if(sort == false)
		{
			System.out.println("The list is not sorted");
		}
		
		
		
	}
		
	public static boolean isSorted(int[] list)
	{
		boolean sort = true;
		for(int i = 0; i < list.length; i++)
		{
			for(int j = i + 1; j < list.length; j++)
			{
				if(list[i] > list[j])
				{
					sort = false;
				}
			}
		}
		return sort;
	}
			
		
		
		
		
		
	
		

}
