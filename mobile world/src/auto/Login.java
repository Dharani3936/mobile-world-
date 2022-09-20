package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

	@Test(dataProvider="getData")
	public void setup(String user,String lpassword) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom login=new Pom(driver);
		login.goTo();
		login.loginpage(user,lpassword);

			
	}
	@DataProvider
	public Object[][] getData()
	{
        Object[][] data=new Object[3][2];
		//correct data
		data[0][0]="Bhava";
		data[0][1]="1q2w3e";
		
		
		//incorrect data
		data[1][0]="!@#$%^";
		data[1][1]="1q2w3e34r5t6y7u8i9i";
		
		data[2][0]="";
		data[2][1]="";
		
		return data;
	}

}
