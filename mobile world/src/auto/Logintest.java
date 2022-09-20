package auto;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Logintest {
	

	@Test
	public void register() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.banyanpro.com/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Bhavadharani");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("q1w2e3");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@type='submit']")));
		//driver.findElement(By.xpath("//a[@type='submit']")).click();

		
	
}
}
