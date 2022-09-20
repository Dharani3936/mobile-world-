package auto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registration {

	@Test(dataProvider="getData")
	public void setup(String firstname,String lastname,String email,String password,
			String dob,String mobilenumber,String shortbio) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavadharani.p\\OneDrive - Qualitest Group\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Pom signin=new Pom(driver);
		signin.goTo();
		signin.registration(firstname, lastname, email, password, dob, mobilenumber, shortbio);
	
	}
		
	@DataProvider
    public Object[][] getData()
	{
		Object[][] data=new Object[3][7];
		
		//correct data
		data[0][0]="Bhava";
		data[0][1]="dharani";
		data[0][2]="bhava123@gmail.com";
		data[0][3]="q1w2e3";
		data[0][4]="05/27/2000";
		data[0][5]="9898989898";
		data[0][6]="My hobbies are playing games";
		
		
		//incorret data
		data[1][0]="bh";
		data[1][1]="dh";
		data[1][2]="BHAVA@gmail.com";
		data[1][3]="q1w2e31Q2W3E4R5T6Y7U8I77UYT65RT";
		data[1][4]="";
		data[1][5]="98989898989898989";
		data[1][6]="My hobbies are playing games";
		
		data[2][0]="1224";
		data[2][1]="1q2w3e4r";
		data[2][2]="1q2w@gmail.com";
		data[2][3]="q1w2e31";
		data[2][4]="05/27/2000";
		data[2][5]="9898989";
		data[2][6]="My hobbies are playing games";
		
		return data;
	}
	
	
	}

