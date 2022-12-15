package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		//Thread.sleep(3000);
		
		List<WebElement> listdd = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(listdd.size());
		
		for(int i=0;i<listdd.size();i++) {
			System.out.println(listdd.get(i).getText()+"---------"+listdd.get(i).isSelected());
		}
		
		Thread.sleep(3000);
		driver.switchTo().frame("google-ebay");
		driver.switchTo().frame(0);
		driver.findElement(By.id("close")).click();
		driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		WebElement w = driver.findElement(By.id("gh-cat"));
		Select s = new Select(w);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("2984");
		Thread.sleep(2000);
		s.selectByVisibleText("Business & Industrial");
		
		System.out.println("------------------------------------------------------------");
		
		for(int i=0;i<listdd.size();i++) {
			if(listdd.get(i).isSelected()==true) {
			System.out.println(listdd.get(i).getText()+"---------"+listdd.get(i).isSelected());
			}
			else {
				
			}
	}

	}
	
}
