package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static String browser = "chrome";    //External Configuration xls,csv etc.
	public static WebDriver driver;
	public static void main(String[] args) {
	
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}else if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
		
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/#traditional-locators");
		driver.findElement(By.linkText("Actions API")).click();
		driver.findElement(By.partialLinkText("Actions")).click();
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		driver.close();	
	}

}
