import java.util.Arrays;

//package p1;

class Rectangle
{
	private int x;
	private int y;
	private double width;
	private double length;
	private String rName;
	private int[] a;
	
	public static int numOfRect;
	//-------------------------------------------------------------
	public Rectangle() 
	{
		++numOfRect;
	}
	//-------------------------------------------------------------
	public Rectangle(double width, double length) {
		this(3, 3, width, length);
	}
	//-------------------------------------------------------------
	public Rectangle(int x , int y , double width, double length)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
		++numOfRect;
	}
	//-------------------------------------------------------------
	public double getWidth() {
		return this.width;
	}
	
	public void setArray(int[] arr) {
		this.a = arr;
	}
	
	public int[] getArray() {
		return a;
	}
	
	//-------------------------------------------------------------
	public void printRectInfo() {
		System.out.println("Center: (" + x + ", "+ y + ")");
		System.out.println("width: " + width + ", Length: " + length);
		System.out.println("Shape's name: " + rName);
		Pow();
	}
	//--------------------------------------------------------------
	public static double sqRoot() {
		return Math.sqrt(16);
	}
	//--------------------------------------------------------------
	public static void Pow() {
		System.out.println(sqRoot());
		System.out.println("Num of objects: " + numOfRect);
	}
	
}

public class ObjextExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.printRectInfo();
		Rectangle r2 = new Rectangle(5,10);
		r2.printRectInfo();
		Rectangle r3 = new Rectangle();
		
		System.out.println("The number of my Rectangles is: " + Rectangle.numOfRect);
		//System.out.println(r2.getWidth());
		
		Rectangle[] rArray = new Rectangle[5];
		double[] rArraywidth = new double[5];
		for(int i = 0; i < 5; i++)
			rArray[i] = new Rectangle();
		for(int i = 0; i < rArray.length; i++)
			rArraywidth[i] = rArray[i].getWidth();
			int [] arr = new int[] {1,2,3,4,5,6,7};
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(rArraywidth));
			
		r1.setArray(arr);
		System.out.println(Arrays.toString(r1.getArray()));
		arr[0] = 100;
		System.out.println(Arrays.toString(r1.getArray()));
		
		
		

	}

}
