package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mobilestest {
	@Test
	public void register() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.linkText("All Mobiles")).click();
		driver.findElement(By.cssSelector("input#myInput")).sendKeys("samsung");
		/*WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#myInput"))).sendKeys("samsung");
		driver.findElement(By.cssSelector("a.btn.btn-primary.waves-effect.waves-light")).click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(2));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr[1]/td[5]/a")));*/
		
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/a")).click();
		
		

}
}