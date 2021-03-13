package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Page.LoginPage;
import Utility.BasePage;
import cucumber.api.java.en.*;


public class LoginTest {
	
	BasePage bp;
	LoginPage lp;

	public LoginTest() {
		bp=new BasePage();
		lp=new LoginPage();
	}
	WebDriver driver;
	
	
	@Given("^user launch the Application$")
	public void user_launch_the_Application() throws Throwable {
		lp=new LoginPage();
	}

	@When("^User enter CorporateIDText, Username and password$")
	public void user_enter_CorporateIDText_Username_and_password() throws Throwable {
		lp.getCorporateIDText().sendKeys("GC2200");
		//driver.findElement(By.xpath("//input[@id='corporateIdText']")).sendKeys("GC2200");
		lp.getUserName().sendKeys("auto1");
		 //driver.findElement(By.xpath("//input[@id='loginIDText']")).sendKeys("auto1");
		lp.getPassword().sendKeys("Bank@12345");
		  // driver.findElement(By.xpath("//input[@id='passwordText']")).sendKeys("Bank@12345");
	}

	@When("^User Click on Auth button$")
	public void user_Click_on_Auth_button() throws Throwable {
		lp.getAuthBtn().click();
		//driver.findElement(By.xpath("//button[@id='authBtn']")).click();
	}

	@Then("^user enter VascoToken$")
	public void user_enter_VascoToken() throws Throwable {
		lp.getVascoToken().sendKeys("256352");
		//driver.findElement(By.xpath("//input[@id='vascoTokenText']")).sendKeys("256352");
	}

	@Then("^User Click on Login button$")
	public void user_Click_on_Login_button() throws Throwable {
		lp.getLoginBtn().click();
		//driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		   Thread.sleep(3000);
		//Assert.assertTrue("Pass", lp.getURL().contains("authLogin"));
		//System.out.println("Logged In Successfully-->"+lp.getURL());
	}



}