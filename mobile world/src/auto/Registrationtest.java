package auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registrationtest {
				
	@SuppressWarnings("deprecation")
	@Test
	public void register() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
		driver.findElement(By.linkText("Sign up")).click();
		//driver.findElement(By.xpath("//p/a")).click();
		driver.findElement(By.id("myName")).sendKeys("Bhavadharani");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("bhava123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("q1w2e3");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("05");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("27");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("2000");
		driver.findElement(By.xpath("//form/div[3]/div[4]")).click();
		driver.findElement(By.cssSelector("input[type='number']")).sendKeys("9898989898");
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("My hobbies are playing games");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//form/div[6]/div[3]")).click();
		//driver.quit();
		
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://mobileworld.azurewebsites.net");
		driver1.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
		driver1.findElement(By.linkText("Sign up")).click();
		//driver.findElement(By.xpath("//p/a")).click();
		driver1.findElement(By.id("myName")).sendKeys("Bh");
		driver1.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Pi");
		driver1.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("bhava123gmail.com");
		driver1.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("q1w979b987n9879792e3");
		driver1.findElement(By.cssSelector("input[type='date']")).sendKeys("05");
		driver1.findElement(By.cssSelector("input[type='date']")).sendKeys("27");
		driver1.findElement(By.cssSelector("input[type='date']")).sendKeys("2000");
		driver1.findElement(By.xpath("//form/div[3]/div[4]")).click();
		driver1.findElement(By.cssSelector("input[type='number']")).sendKeys("989898998989899898");
		driver1.findElement(By.cssSelector("textarea.form-control")).sendKeys("My hobbies are playing games");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println(driver1.switchTo().alert().getText());
		Thread.sleep(3000);
		driver1.switchTo().alert().accept();
		driver1.findElement(By.xpath("//form/div[6]/div[3]")).click();*/
		
		
	}
}
		
	
	


