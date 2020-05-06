package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qaclickpage {
	public WebDriver driver;
	By qatext = By.xpath("//div[@class=]");

	public qaclickpage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement gettext() {
		return driver.findElement(qatext);
	}
}
