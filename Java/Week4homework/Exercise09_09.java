class RegularPolygon
{
	private int n = 3;
	
	private double side = 1;
	
	private double x = 0;
	
	private double y = 0;
	
	public RegularPolygon()
	{
		
	}
	
	public RegularPolygon(int newN, double newSide)
	{
		this.n = newN;
		this.side = newSide;
	}
	
	public RegularPolygon (int newN, double newSide, double newX, double newY)
	{
		this.n = newN;
		this.side = newSide;
		this.x = newX;
		this.y = newY;
	}
	
	public void setN(int n)
	{
		this.n = n;
	}
	
	public void setSide(double side)
	{
		this.side = side;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public int getN()
	{
		return n;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public double getx()
	{
		return x;
	}
	
	public double gety()
	{
		return y;
	}
	
	public double getPerimeter()
	{
		double perimeter;
		perimeter = n * side;
		return perimeter;
	}
	
	public double getArea()
	{
		double area;
		area = n * Math.pow(side, 2)/(4 * Math.tan(Math.PI/n));
		return area;
	}

}
public class Exercise09_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6,4);
		RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("polygon 1 perimeter " + r1.getPerimeter());
		System.out.println("polygon 1 area " + r1.getArea());
		System.out.println("polygon 2 perimeter " + r2.getPerimeter());
		System.out.println("polygon 2 area " + r2.getArea());
		System.out.println("polygon 3 perimeter " + r3.getPerimeter());
		System.out.println("polygon 3 area " + r3.getArea());
	}

}
