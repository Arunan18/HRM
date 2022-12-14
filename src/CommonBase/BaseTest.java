package CommonBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
public static WebDriver driver;
	
	@BeforeSuite
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Dependences\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://192.168.1.100:3008");
	}
	
	
	 @AfterSuite 
	 public void closeChrome() { 
		// driver.quit(); 
		 }
}
