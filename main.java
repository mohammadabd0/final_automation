package final_project;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class main extends Paremters{
	

	
//	  @Test public void createAcc() throws InterruptedException {
//	  driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("mohammad");
//	  
//	  // XPath for the Last Name input
//	  driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("ahmad");
//	  
//	  
//	  // XPath for the Email input
//	  driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys(
//	  "mokh2982@gmail.com");
//	  
//	  
//	  // XPath for the Password input
//	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mohammad@123"
//	 );
//	  
//	 
//	 // XPath for the Confirm Password input
//	 driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys(
//	 "mohammad@123");
//	 
//	 driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).
//	 click();
//	  
//	 
//	  driver.get(
//	 "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/"
//	 ); driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(
//	 "mokh2982@gmail.com");
//	 
//	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mohammad@123");
//	  
//	  driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//	  Thread.sleep(3000); String weclome_Msg = driver.findElement(By.xpath(
//	  "/html/body/div[2]/header/div[1]/div/ul/li[1]/span")).getText();
//	  System.out.println(weclome_Msg); Boolean welcome =
//	 weclome_Msg.contains("Welcome");
//	 
//	  MyAssert.assertEquals(welcome, true); MyAssert.assertAll();
//	  
//	  }
//	 
//	@Test
//	public void search_bar() {
//			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(
//				  "mokh2982@gmail.com");
//				  
//			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mohammad@123");
//				  
//			driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//				  
//			driver.get("https://magento.softwaretestingboard.com/");
//				  
//			String [] search  = {"jacket","t-shirt","jeans for men","jeans for women","pants"};
//			Random rand = new Random();
//				  
//			int randomSearch = rand.nextInt(0,search.length);
//				  
//			WebElement searchBar = 	  driver.findElement(By.xpath("//*[@id=\"search\"]"));
//			searchBar.sendKeys(search[randomSearch]+ Keys.ENTER);
//				 
//			String hu=	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText();
//			Boolean bool = hu.contains(hu);
//			
//			MyAssert.assertEquals(bool, bool);
//			MyAssert.assertAll();
//			
//				  
//				  
//		
//	} 
	@Test
	public void selecetItem() throws InterruptedException {

		
			List<WebElement> items = driver.findElements(By.className("product-image-photo"));
			
			Random rand = new Random();

			//System.out.println(items.size());
			
			items.get(0).click();
			 Thread.sleep(3000);

			String  [] sizeIndex0 = {"//*[@id=\"option-label-size-143-item-166\"]","//*[@id=\"option-label-size-143-item-167\"]","//*[@id=\"option-label-size-143-item-168\"]","//*[@id=\"option-label-size-143-item-169\"]","//*[@id=\"option-label-size-143-item-170\"]"}; 
			String [] color0 = {"//*[@id=\"option-label-color-93-item-50\"]","//*[@id=\"option-label-color-93-item-56\"]","//*[@id=\"option-label-color-93-item-57\"]"};
			int randomcolor = rand.nextInt(0,color0.length);
			int randomsize = rand.nextInt(0,sizeIndex0.length);
			
			for (int i = 0; i < 1; i++) {
				driver.findElement(By.xpath(sizeIndex0[randomsize])).click();
				 Thread.sleep(3000);
				driver.findElement(By.xpath(color0[randomcolor])).click();
				 Thread.sleep(2000);
				driver.findElement(By.id("qty")).clear();

				driver.findElement(By.id("qty")).sendKeys("3");
				 Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
				
			}
			driver.get("https://magento.softwaretestingboard.com/");
			items = driver.findElements(By.className("product-image-photo"));
			Thread.sleep(3000);
		
			items.get(1).click();
			
			String[] sizeOptionsXPathIndexOne = {
				    "//div[@class='swatch-attribute-options clearfix']/div[@id='option-label-size-143-item-166']",
				    "//div[@class='swatch-attribute-options clearfix']/div[@id='option-label-size-143-item-167']",
				    "//div[@class='swatch-attribute-options clearfix']/div[@id='option-label-size-143-item-168']",
				    "//div[@class='swatch-attribute-options clearfix']/div[@id='option-label-size-143-item-169']",
				    "//div[@class='swatch-attribute-options clearfix']/div[@id='option-label-size-143-item-170']"
				};
			String[] colorOptionsXPath = {
				    "//div[@class='swatch-attribute-options clearfix']/div[@id='option-label-color-93-item-57']",
				    "//div[@class='swatch-attribute-options clearfix']/div[@id='option-label-color-93-item-59']",
				    "//div[@class='swatch-attribute-options clearfix']/div[@id='option-label-color-93-item-60']"
				};
			int colorOption1 = rand.nextInt(0,colorOptionsXPath.length);
			int sizeIndexOne = rand.nextInt(0,sizeOptionsXPathIndexOne.length);
			Thread.sleep(3000);

			for (int i = 0; i < 1; i++) {
				driver.findElement(By.xpath(sizeOptionsXPathIndexOne[sizeIndexOne])).click();
				 Thread.sleep(3000);
				driver.findElement(By.xpath(colorOptionsXPath[colorOption1])).click();
				 Thread.sleep(2000);
				driver.findElement(By.id("qty")).clear();

				driver.findElement(By.id("qty")).sendKeys("2");
				 Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
				
			}
		
	} 
	
//	@Test(priority = 3)
//	public void Adding_items_test_number_3() throws InterruptedException {
//
//		driver.get("https://magento.softwaretestingboard.com/");
//		Random rand = new Random();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		// scroll down to the items
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1850)", "to scroll down to the items");
//
//		WebElement ItemContainer = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]"));
//
//		List<WebElement> items = ItemContainer.findElements(By.className("product-item-link"));
//		Thread.sleep(5000);
//
//		String[] URls = { "https://magento.softwaretestingboard.com/radiant-tee.html",
//				"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
//				"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
//				"https://magento.softwaretestingboard.com/hero-hoodie.html",
//				"https://magento.softwaretestingboard.com/fusion-backpack.html" };
//
//		for (int i = 0; i < 5; i++) {
//			driver.get(URls[i]);
//
//			if (driver.getCurrentUrl().contains("radiant")) {
//
//				WebElement colorDiv = driver
//						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]"));
//				String[] colorsssLabels = { "option-label-color-93-item-50", "option-label-color-93-item-56",
//						"option-label-color-93-item-57" };
//				int RandomColor = rand.nextInt(0, 3);
//				List<WebElement> Sizes = driver.findElements(By.className("swatch-option"));
//				int RandomSize = rand.nextInt(0, 5);
//				Sizes.get(RandomSize).click();
//				Thread.sleep(3000);
//
//				List<WebElement> colorsssss = colorDiv.findElements(By.tagName("div"));
//				colorsssss.get(RandomColor).click();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");
//
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//			} else if (driver.getCurrentUrl().contains("breathe")) {
//				
//				int[] myRandomQ = {0,1,2,3,4,5,9,10,90,100,70};
//				
//				int index = rand.nextInt(0, 11); 
//				
//
//				WebElement colorLength2 = driver.findElement(
//						By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[2]/div"));
//				List<WebElement> colorIndex2 = colorLength2.findElements(By.tagName("div"));
//
//				Thread.sleep(5000);
//				List<WebElement> Sizes = driver.findElements(By.className("swatch-option"));
//				int RandomSize = rand.nextInt(0, 5);
//				Sizes.get(RandomSize).click();
//				Thread.sleep(5000);
//				int RandomColor = rand.nextInt(0, 3);
//				colorIndex2.get(RandomColor).click();
//				Thread.sleep(3000); 
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("4");
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//			} else if (driver.getCurrentUrl().contains("argus")) {
//				Thread.sleep(5000);
//				List<WebElement> Sizes = driver.findElements(By.className("swatch-option"));
//				int RandomSize = rand.nextInt(0, 5);
//				Sizes.get(RandomSize).click();
//				List<WebElement> ColorsTank = driver.findElements(By.className("color"));
//				Thread.sleep(5000);
//
//				int RandomColorForTankProduct = rand.nextInt(0, 1);
//				Thread.sleep(5000);
//				driver.findElement(By.id("option-label-color-93-item-52")).click();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("4");
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//			} else if (driver.getCurrentUrl().contains("hoodie")) {
//				
//				WebElement colorsDiv = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//						List<WebElement> Colorssss = colorsDiv.findElements(By.tagName("div")); 
//				
//				
//				Thread.sleep(5000);
//				List<WebElement> Sizes = driver.findElements(By.className("swatch-option"));
//				int RandomSize = rand.nextInt(0, 5);
//				Sizes.get(RandomSize).click();
//				List<WebElement> ColorsTank = driver.findElements(By.className("color"));
//				Thread.sleep(5000);
//
//				int RandomColorForTankProduct = rand.nextInt(0, 3);
//				
//				Colorssss.get(RandomColorForTankProduct).click(); 
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("1");
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//
//			} else if (driver.getCurrentUrl().contains("fusion")) {
//
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("5");
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//			}
//		}
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
//
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]")).click();
//
//		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
//
//		Thread.sleep(5000);
//		String FinalPriceAtWebSite = driver
//				.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[4]/td/strong/span")).getText();
//		System.out.println(FinalPriceAtWebSite);
//		String updatedFinalPriceAtWebSite = FinalPriceAtWebSite.replace("$", "");
//		double priceAsDouble = Double.parseDouble(updatedFinalPriceAtWebSite);
//		System.out.println(priceAsDouble);
//		
//		
//		MyAssert.assertEquals(priceAsDouble, 266.3, "this is to test the price");
//		MyAssert.assertAll(); 
//	}

//	@Test(invocationCount = 5, priority = 4)
//	public void Reorder() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.get("https://magento.softwaretestingboard.com/sales/order/history/");
//		driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]/span")).click();
//		Thread.sleep(7000);
//
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input"))
//				.click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
//
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span"))
//				.click();
//
//	}
}

