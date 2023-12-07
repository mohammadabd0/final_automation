package final_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Paremters {

	
		
	SoftAssert MyAssert = new SoftAssert();
	WebDriver driver = new EdgeDriver();
	
	@BeforeTest
	public void webDriver(){
		//driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		 //driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
		driver.get("https://magento.softwaretestingboard.com/");

	}
}
