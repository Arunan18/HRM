package TestBase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonBase.BaseTest;

public class LogoutTest extends BaseTest{
	@Test
	public void Logout() throws InterruptedException{
		PageFactory.initElements(driver, PageBase.LogoutPage.class);
		PageBase.LogoutPage.ClickLogoutBtn.click();
		Thread.sleep(2000);
		PageBase.LogoutPage.ClickLogoutConfirmBtn.click();
	}
	
	@BeforeTest
	public void Login() throws InterruptedException {
		PageFactory.initElements(driver, PageBase.LoginPage.class);
		PageBase.LoginPage.Username.sendKeys("user");
		PageBase.LoginPage.Password.sendKeys("password");
		PageBase.LoginPage.clickPasswordVisibleBtn.click();
		Thread.sleep(2000);
		PageBase.LoginPage.clickLoginBtn.click();
		
	}
}
