package by.intexsoft.malkevich;

public class C extends B{
	
	
	// init bloc
	{
		System.out.println("C common init block");
		intProperty1 = 111;
	}
	// static init bloc
	static {
		System.out.println("C STATIC init block");
		staticStrProperty= "C";
	}

	// constructor
	C() {
		System.out.println("C constructor");
	}
	C(int i) {
		super(i);
		System.out.println("C constructor with param" + i);
	}
	
	@Override
	public int getSum() {
		System.out.println("C getSum");
		return intProperty1+ intProperty2;
	}

	
	
	

}
