package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.xpath("//p[@class='intro']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", s);
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));
		System.out.println("Number of rows ="+" "+row.size());
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr[2]/td"));
		System.out.println("Number of column ="+" "+column.size());
		//List<WebElement> columndata = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/td"));
		
		for(int i=2; i<=row.size(); i++) {
			
			System.out.println("");
			System.out.println("----------------------------------------------------------------------");
			for(int j=1 ; j<=column.size(); j++) {
				
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tbody/tr["+i+"]/td["+j+"]")).getText());
				System.out.print("  |  ");
		}
			
		}
		}

}
