package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePractice {
	public LoginPagePractice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
		@FindBy(id="username")
		WebElement usernameTextField;
		
		@FindBy(name="pwd")
		WebElement passwordTextField;
		
		@FindBy(xpath="//div[text()='Login ']")
		WebElement loginButton;
		
		public void loginPAction(String username,String password) {
			usernameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			loginButton.click();
		}

		

	

	}


