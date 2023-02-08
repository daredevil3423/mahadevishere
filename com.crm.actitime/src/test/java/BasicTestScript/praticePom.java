package BasicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomRepository.HomePagePractice;
import pomRepository.LoginPagePractice;

public class praticePom {

	public static void main(String[] args) {
		String expectedTitle="Enter";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPagePractice login=new LoginPagePractice(driver);
		login.loginPAction("admin","manager");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		HomePagePractice homep= new HomePagePractice(driver);
		String actualTitle = homep.verifyTitle();
		
		
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("pass");
		}
		else
			System.out.println("failed");
		
		homep.logoutA();
		driver.quit();
		

	}

}
