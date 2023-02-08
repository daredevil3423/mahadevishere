package genericUtility;

import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	public void waitForTitle(WebDriver driver,String title) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditons.titleContains(title));
	}

}
