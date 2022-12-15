package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shreyansh");
		String s = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		System.out.println(s);
	}

}
