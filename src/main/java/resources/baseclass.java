package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeBrowser() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Admin\\eclipse-workspace\\Project1\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Desktop\\G-Studies\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\Desktop\\G-Studies\\Drivers\\Chrome\\chromedriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
