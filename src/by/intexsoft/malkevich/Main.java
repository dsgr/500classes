package by.intexsoft.malkevich;

import java.io.File;
import java.io.IOException;
import com.sun.codemodel.*;

public class Main {

	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {

		/*
		 * for (int i = 1; i <= 500; i++) { JCodeModel cm = new JCodeModel();
		 * JDefinedClass dc =
		 * cm._class("by.intexsoft.malkevich.generated_classes.My" + i); JMethod
		 * m = dc.constructor(0);
		 * 
		 * File file = new File("./src"); file.mkdirs(); cm.build(file); }
		 */

		A a_instance = new A();
		System.out.println("A1 " + a_instance.intProperty1);
		System.out.println("A2 " + a_instance.intProperty2);
		System.out.println("A3 " + a_instance.strProperty);
		System.out.println("-------------------");

		B b_instance = new B();
		System.out.println(b_instance.getSum());
		System.out.println("-------------------");

		C c_instance = new C();
		System.out.println(c_instance.getSum());
		System.out.println("-------------------");

		System.out.println(a_instance.staticStrProperty);

	}

}
