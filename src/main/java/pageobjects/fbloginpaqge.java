package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fbloginpaqge {

	public WebDriver driver;
	
	By login=By.xpath("//input[@type='email']");
	By password=By.xpath("//input[@type='password']");
	By loginclick=By.xpath("//input[@type='submit']");
	
	public fbloginpaqge(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getlogin() {
		
		return driver.findElement(login);
	}
	
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement clickpage() {
		return driver.findElement(loginclick);
	}
	
}
