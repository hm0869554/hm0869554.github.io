package p2;


public interface Interface1 {

	public static final int x = 10;
	public default Object interfaceDefaultMthod() {
		return new Object();
		}
	public static void interfaceStaticMethod() {
		System.out.println("From inside interface static Method");
	}
	public abstract void inerfaceAbstractMethod();
	

}
