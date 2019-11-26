package p3;


public interface Interfaces {

	public static final int x = 10;
	public default Object interfaceDefaultMthod() {
		return new Object();
		}
	public static void interfaceStaticMethod() {
		System.out.println("From inside interface static Method");
	}
	public abstract void inerfaceAbstractMethod();
	

}
