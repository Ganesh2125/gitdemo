package E2E_Project.Project1;

import java.io.IOException;
import java.util.ArrayList;

public class SampleTestCase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		exceldriven d=new exceldriven();
		ArrayList data=d.getData("Login");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		
	}

}
