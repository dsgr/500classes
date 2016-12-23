package by.intexsoft.malkevich;

public class B extends A {
	
	
	// init bloc
	{
		System.out.println("B common init block");
		intProperty1 = 11;
	}
	// static init bloc
	static {
		System.out.println("B STATIC init block");
		staticStrProperty= "B";
	}

	// constructor
	B() {
		System.out.println("B constructor");
	}

	B(int i) {
		super(i);
		System.out.println("B constructor with param" +i);
	}

	
	
	@Override
	public int getSum() {
		System.out.println("B getSum");
		return intProperty1;
	}


}
