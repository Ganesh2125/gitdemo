package E2E_Project.Project1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.qaclickpage;
import resources.baseclass;

public class qatest extends baseclass {

	@Test
	public void checktext() throws IOException {
		driver = initializeBrowser();

		driver.manage().window().maximize();

		qaclickpage qa1 = new qaclickpage(driver);
		Assert.assertEquals(qa1.gettext().getText(), "FEATURED COURSES");

	}
}
