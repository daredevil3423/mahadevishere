package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePractice {
	WebDriver driver;
	
	public HomePagePractice(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
		
	}
	
	@FindBy(linkText="Logout")
	WebElement logoutlink;
	
	public String verifyTitle() {
		
		return driver.getTitle();
	}
	public void logoutA() {
		logoutlink.click();
	}
	
	
	
	
	
	

}
