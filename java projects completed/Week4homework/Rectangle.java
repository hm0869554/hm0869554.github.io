
public class Rectangle {

	private double length = 0;
	
	private double width = 0;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(double newLength, double newWidth)
	{
		this.width = newWidth;
		this.length = newLength;
	}
	
	public double getArea()
	{
		double area;
		area = width * length;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter;
		perimeter = length + length + width + width;
		return perimeter;
	}
}
