package PageBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/header/div/button/span")
	public static WebElement ClickLogoutBtn;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div[2]/button[2]/span")
	public static WebElement ClickLogoutConfirmBtn;
}
