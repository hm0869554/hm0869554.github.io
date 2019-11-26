
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] table = new double[7][7];
		for(int i = 0; i< table.length; i++)
		{
			for(int j = 0; j <table[i].length; j++) 
			{
				table[i][j] = Math.ceil(Math.random() * 100);
			}
		}
		double a = Mean(table);
		System.out.println(a);
	}
	public static double Mean(double[][] table) {
		double sum = 0;
		for(int i =0; i <table.length; i++) {
			for(int j = 0; j< table[i].length;j++) {
				sum += table[i][j];
			}
		}
		return sum/49;
	}

}
