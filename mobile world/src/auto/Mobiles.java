package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Mobiles {

	
	@Test(dataProvider="getData")
	public void setup(String box) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom all=new Pom(driver);
		all.goTo();
		all.mobiles(box);
		
	}

	@DataProvider
	public Object[][] getData()
	{
        Object[][] data=new Object[2][1];
		//correct data
        data[0][0]="samsung";
        
        //incorrect data
		data[1][0]="samsung 20 pixel with dual camera ";
		
		return data;
}
}
