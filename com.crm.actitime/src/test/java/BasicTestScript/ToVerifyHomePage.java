package BasicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomRepository.HomePage;
import pomRepository.LoginPage;

public class ToVerifyHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedTitle="Enter";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login=new LoginPage(driver);
		login.loginAction("admin", "manager");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		HomePage home = new HomePage(driver);
		String actualTitle = home.verifyTitle();
		
		if(actualTitle.contains(expectedTitle)){
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		home.logoutAction();
		driver.quit();
		
		

	}

}
