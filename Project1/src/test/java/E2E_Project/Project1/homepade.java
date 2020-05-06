package E2E_Project.Project1;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.fbloginpaqge;
import resources.baseclass;

public class homepade extends baseclass {
	@Test(dataProvider="getdata")
	public void basepagenavigate(String Username, String Password) throws IOException {

		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		fbloginpaqge log = new fbloginpaqge(driver);
		log.getlogin().sendKeys(Username);
		log.getpassword().sendKeys(Password);
		log.clickpage().click();
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data =new Object[2][2];
		data[0][0]="abc";
		data[0][1]="xyz";
		data[1][0]="def";
		data[1][1]="agr";
		return data;
		
	}

}
