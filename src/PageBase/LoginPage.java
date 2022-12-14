package PageBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div/span[1]/input")
	public static WebElement Username;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div/span[2]/input")
	public static WebElement Password;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div/span[2]/span[2]/span")
	public static WebElement clickPasswordVisibleBtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div/button")
	public static WebElement clickLoginBtn;
	
	
}
