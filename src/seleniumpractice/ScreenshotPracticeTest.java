package seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotPracticeTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		
		File ss = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("C:\\Testing\\ScreeshotPractice\\ssPractice.png"));

	}

}
