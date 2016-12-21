package by.intexsoft.malkevich;

import java.io.File;
import java.io.IOException;
import com.sun.codemodel.*;

public class Main {

	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		// TODO Auto-generated method stub
		//

		for (int i = 1; i <= 500; i++) {
			JCodeModel cm = new JCodeModel();
			JDefinedClass dc = cm._class("by.intexsoft.malkevich.generated_classes.My" + i);
			JMethod m = dc.constructor(0);

			File file = new File("./src");
			file.mkdirs();
			cm.build(file);
		}
	}

}
