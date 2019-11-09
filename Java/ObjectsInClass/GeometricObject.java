import java.util.Date;
public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new Date();
	}
	
	/** Construct a geometric object with the specified co
	 * and filled value */
	 public GeometricObject(String color, boolean filled) {
		 dateCreated = new Date();
		 this.color = color;
		 this.filled = filled;
	 }
	 
	 /** Return color */
	 public String getColor( ) {
		 return color;
	 }
	 
	 /**return date created*/
	 
	 public Date getDateCreated() {
		 return dateCreated;
	 }
	 
	 /** Return filled. Since filled is boolean, its get method is name isFilled*/
	 public boolean isFilled() {
		 return filled;
	 }
	 
	 /** Set a new filled*/
	 public void setFilled(boolean filled){
		 this.filled = filled;
	 }
	 
	 public void setColor(String color) {
		 this.color = color;
	 }
	 /** Return a string representation of this object */
	 public String toString() {
		 return "created on " + dateCreated + "\ncolor: " + color + 
				 "and filled: " + filled;
	 }
	
class Circle extends GeometricObject {
		private double radius;
		
		
		public Circle() {
			
		}
		
		public Circle(double radius) {
			this.radius = radius;
		}
		
		public Circle(double radius, String color, boolean filled) {
			this.radius = radius;
			setColor(color);
			setFilled(filled);
		}
		
		/** Return radius */
			public double getRadius() {
				return radius;
			}
		/** Set a new radius*/
			public double getDiameter() {
				return radius * 2;
			}
		
		/** Return Diameter*/
			
			public double getPerimeter() {
				return 2 * radius * Math.PI;
			}
			
		/** Print the cirlce info*/
			public void printCircleInfo() {
				System.out.println("The circle is creted " + getDateCreated() +
						" and the radius is " + radius);
			}
			
		 
	 }

	public static void main(String[] args){
		Circle circle = new Circle(1);
		 System.out.println("A circle " + circle.toString());
	}
}




