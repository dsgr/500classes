package by.intexsoft.malkevich;

public class A {
	// init bloc
	{
		System.out.println("A common init block");
		intProperty1 = 1;
	}
	// static init bloc
	static {
		System.out.println("A STATIC init block");
		staticStrProperty= "A";
	}

	// constructor
	A() {
		System.out.println("A constructor");

	}

	public String strProperty;
	public static String staticStrProperty;

	public int intProperty1;
	public int intProperty2;

	public int getSum() {
		System.out.println("B getSum");
		return intProperty1 + intProperty2;
	}

}
