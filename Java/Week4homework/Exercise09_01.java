
class Rectangle {

	private double height = 1;
	
	private double width = 1;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(double newWidth, double newHeight)
	{
		this.width = newWidth;
		this.height = newHeight;
	}
	
	public double getArea()
	{
		double area;
		area = width * height;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter;
		perimeter = height + height + width + width;
		return perimeter;
	}
}
public class Exercise09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(4.0, 40.0);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		System.out.println("The area of a rectangle with width 4.0 and height 40.0 is " + r1.getArea());
		System.out.println("The perimeter of a rectangle is " + r1.getPerimeter());
		System.out.println("The area of a rectangle with width 3.5 and height 35.9 is " + r2.getArea());
		System.out.println("The perimeter of a rectangle is" + r2.getPerimeter());
	}

}
