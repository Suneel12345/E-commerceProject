package Amazon;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.Test;

		public class amazon {
			WebDriver driver;
			@BeforeMethod
			public void HpLappy() throws InterruptedException{
				System.setProperty("webdriver.chrome.driver","D:\\\\Testing\\\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("http://www.amazon.in");
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				}
				@Test(priority=1)
				public void Login() throws InterruptedException
				{
				driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8218025151",Keys.ENTER);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Suneel@123",Keys.ENTER);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@name='option' and @type='radio' and @value='sms']")).click();
				driver.findElement(By.xpath("//input[@id='continue']")).click();
				}
				@Test(priority=2)
				public void SearchItemandSelect() throws InterruptedException
				{
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("t-shirts for men"+Keys.ENTER);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//div[@class='sb_1LbkwDuT']//div[2]//div[1]//a[1]")).click();
				Thread.sleep(6000);
				Select dropdown=new Select(driver.findElement(By.xpath("//select[@name='dropdown_selected_size_name']")));
				dropdown.selectByVisibleText("L");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@name='submit.buy-now']")).click();
				Thread.sleep(4000);
				}
				@Test(priority=3)
				public void PaymentThroughDebitCard() throws InterruptedException
				{
				driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='suneel']")).sendKeys("");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='addCreditCardNumber']")).sendKeys("918218025151");
				Thread.sleep(2000);
				Select dropdown1=new Select(driver.findElement(By.xpath("//span[@id='pp-Bf3YVu-81']//span[@class='a-button-text a-declarative']")));	
				dropdown1.selectByVisibleText("10");
				Thread.sleep(2000);
				Select dropdownYear=new Select(driver.findElement(By.xpath("//span[@id='pp-Bf3YVu-82']//span[@class='a-button-text a-declarative']")));
				dropdownYear.selectByVisibleText("2019");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:AddCreditCardEvent']")).click();
				}
			    @Test(priority=4)
			    public void PaymentThroughNetBanking() throws InterruptedException
			    {
			    driver.findElement(By.xpath("//input[@type='radio' and @value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")).click();
		        Thread.sleep(2000);
		         Select drop=new Select(driver.findElement(By.xpath(".//span[@class='a-button a-button-dropdown']")));
		         drop.selectByVisibleText("HDFC Bank");
		        Thread.sleep(2000);
			    }
			    @AfterMethod
			    public void logout() 
			    {
			    	driver.close();
			    }
			

	}

