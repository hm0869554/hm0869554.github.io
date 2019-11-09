package p2;

class Vehicle extends Object{
	public String model;
	private double speed;
	
	public Vehicle() {
		System.out.println("\nSupperclass's no-args Constructor Invoked.");
	}
	
	public Vehicle(String model, double speed) {
		System.out.println("\nSuperclas's two-args Constructor invoked.");
		
		this.model = model;
		this.speed = speed;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String toString() {
		System.out.println("Vehicle's toString() method Invoked");
		return "Car's model : " + this.getModel() + " and " + "Car's speed: " + this.getSpeed() + " Mph";
	}
	
	public String toStringFromObject() {
		System.out.println("Object;s toString() method Invoked.");
		return super.toString();
	}
	
	public boolean equals(Object o) {
		if(o instanceof Car)
		{
			return this.getModel() == ((Car)o).getModel() && this.getSpeed() == ((Car)o).getSpeed();
		}
		return false;
	}
}

class Car extends Vehicle{
	public Car() {
		System.out.println("\nCar's no-args Constructor Invoked.");
	}
	
	public Car(String model, double speed) {
		//this.model = model;
		// this.speed = speed;
		//this.setSpeed(speed);
		super(model, speed);
	}
	
	public void ifEquals(Object o)
	{
		super.equals(o);
	}
}

class Truck extends Vehicle{
	private Truck() {
		
	}
	public static void m() {
		System.out.println("From inside Truck class static method.");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		Car c1 = new Car("Malibu", 50);
		System.out.println(c1.toString());
		System.out.println(c1.toStringFromObject());
		Car c2 = new Car("Malibu", 50);
		System.out.println(c1.equals(c2));
		Car c3 = new Car("Tesla", 200);
		
		System.out.println(c1.equals(c3));
		Object o = new Car("Malibu", 50);
		System.out.println(c1.equals(o));
		
		//Truck t2 = new Truck();
		Truck.m();
		//System.out.println(t2.toString());
		
		
		
		
		
	}
}
