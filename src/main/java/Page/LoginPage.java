package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(xpath="//input[@id='corporateIdText']")
	private WebElement CorporateIDText;
	
	@FindBy(xpath="//input[@id='loginIDText']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@id='passwordText']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@id='authBtn']")
	private WebElement AuthBtn;
	
	@FindBy(xpath="//input[@id='vascoTokenText']")
	private WebElement VascoToken;
	
	@FindBy(xpath="//button[@id='loginBtn']")
	private WebElement LoginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginApplication(String user,String pass) {
		setText(Username, user);
		setText(Password, pass);
	}
	
	public WebElement getCorporateIDText() {
		return CorporateIDText;
	}
	
	public WebElement getUserName() {
		return Username;
	}
	
	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getAuthBtn() {
		return AuthBtn;
	}
	
	public WebElement getVascoToken() {
		return VascoToken;
	}
	
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	public void ClickLogin() {
		LoginBtn.click();
	}
	
	public void SetUserName(String user) {
		setText(Username, user);
	}
	
	public String getEnteredText() {
		return Username.getAttribute("value");
	}
}