package testInterfaces;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class testInterfaces1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Comparable
		System.out.println("\n\t\t__Comparable__\n");
		ComparableRectangle compRect1 = new ComparableRectangle(2, 3);
		ComparableRectangle compRect2 = new ComparableRectangle(2, 3);
		ComparableRectangle compRect3 = new ComparableRectangle(3, 4);
		System.out.println("compRect1: " + compRect1.toString());
		System.out.println("compRect2: " + compRect2.toString());
		System.out.println("compRect3: " + compRect3.toString());
		System.out.println("compRect1 compare to compRect2: " + compRect1.compareTo(compRect2));
		System.out.println("compRect1 compare to compRect3: " + compRect1.compareTo(compRect3));
		// cloneable - comparable //
		System.out.println("\n\t\t__Cloneable <> Comparable__\n");
		House house1 = new House(123, 1000);
		
		try {
			House house2 = (House)house1.clone();
			System.out.println("__house1__\n" + house1.toString());
			System.out.println("__house2__\n" + house2.toString());
			System.out.println("Compare built year of <house1> with built year of <house2> : " + house1.compareTo(house2));
			house1.setWhenBuilt(2010, 10, 20);
			System.out.println("__house1__\n" + house1.toString());
			System.out.println("__house2__\n" + house2.toString());
			System.out.println("Compare built year of <house1> with built year of <house2> : " + house1.compareTo(house2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}

//-------------------------------Comparable-----------------------------------

class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	//Return width//
	public double getWidth() {
		return this.width;
	}
	//Return height//
	public double getHeight() {
		return this.height;
	}
	//return area//
	public double getArea() {
		return this.width * this.height;
	}
}

class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
	
	//construct a comparablerectangle with specified properties//
	public ComparableRectangle(double width, double height) {
		super(width,height);
	}
	
	@Override // Implement the CompareTo method defined in comparable
	public int compareTo(ComparableRectangle o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if(this.getArea() < o.getArea())
			return -1;
		else return 0;
	}
	
	@Override // Implement the toString method in Objec class
	public String toString() {
		return "Width: " + this.getWidth() + " Height: " + this.getHeight() + " Area: " + this.getArea();
	}
	
}

//-----------------------------Cloneable------------------------------//

class House implements Cloneable, Comparable<House> {
	private int id;
	private double area;
	private  Calendar whenBuilt;
	  
	public House(int id, double area) {
		this.id = id;
	    this.area = area;
	    whenBuilt = new GregorianCalendar();
	}
	public int getId() {
		return this.id;
	}
	public double getArea() {
		return this.area;
	}
	public String getWhenBuilt() {
	    return " Year: " + whenBuilt.get(Calendar.YEAR) + " " + 
	    		"Month: " + whenBuilt.get(Calendar.MONTH) + " " + "Date: " + whenBuilt.get(Calendar.DATE);
	}
	public void setWhenBuilt(int year, int month, int date) {
		whenBuilt.set(year, month, date);
	}
	@Override /** Override the protected clone method defined in 
    the Object class, and strengthen its accessibility */
	public Object clone() throws CloneNotSupportedException {
		// Perform a shallow copy
		House houseClone = (House)super.clone(); 
		// Deep copy on whenBuilt
//		houseClone.whenBuilt = (Calendar)(whenBuilt.clone());
		return houseClone;
	}
	@Override // Implement the compareTo method defined in Comparable
	public int compareTo(House o) {
		if (this.whenBuilt.get(Calendar.YEAR) > o.whenBuilt.get(Calendar.YEAR))
			return 1;
	    else if (this.whenBuilt.get(Calendar.YEAR) < o.whenBuilt.get(Calendar.YEAR))
	    	return -1;
	    else
	    	return 0;
	}
	@Override // Implement the toString method in Object class
	public String toString() {
		return "House ID: " + this.getId() + "\nHouse Area: " + this.getArea() + "\nWhen Build: " + this.getWhenBuilt() + "\n";
	}
}






