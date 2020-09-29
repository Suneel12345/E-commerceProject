package Flipkart;

		import java.util.ArrayList;
		import java.util.concurrent.TimeUnit;

		import org.eclipse.jdt.internal.compiler.ast.ThrowStatement;
		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.Test;

		public class Flipkart {
			WebDriver driver;
			@BeforeMethod
			public void Shopping() throws InterruptedException{
				System.setProperty("webdriver.chrome.driver","D:\\\\Testing\\\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("https://www.flipkart.com/");
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
				@Test
				public void Login() throws InterruptedException
					{
				driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("8218025151");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Suneel@123",Keys.ENTER);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("i phone 11 pro",Keys.ENTER);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//div[contains(@class,'t-0M7P _2doH3V')]//div[3]//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]//div[1]//img[1]")).click();
				Thread.sleep(4000);
				ArrayList<String> windowTabs=new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(windowTabs.get(0));
				Thread.sleep(4000);
				driver.switchTo().window(windowTabs.get(1));
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@class='_1TJldG _3c2Xi9']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[@class='_2AkmmA _I6-pD _7UHT_c']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[@class='_2AkmmA _2Q4i61 _7UHT_c']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//label[@class='_8J-bZE _3C6tOa _1syowc _2i24Q8 _1Icwrf']//div[@class='_6ATDKp']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@name='cardNumber']")).sendKeys("25464645878455");
				Thread.sleep(4000);
				Select dd1=new Select(driver.findElement(By.xpath("//select[@name='month']")));
				dd1.selectByVisibleText("02");
				Thread.sleep(4000);
		        Select dd2=new Select(driver.findElement(By.xpath("//select[@name='year']")));
				dd2.selectByVisibleText("22");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@name='cvv']")).sendKeys("214");
				driver.findElement(By.xpath("//button[@class='_2AkmmA wbv91z _7UHT_c']")).click();

			

	}

}
