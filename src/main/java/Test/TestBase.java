package Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TestBase {

	public static WebDriver driver;
	
//add some comments 
    public String Text;
    public String Email;
    public String title;
	public String firstname;
	public String LastName;
	public String phoneNumbernumber;
	public String searchPostcode;

	public void setUp() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\sudar\\eclipse-workspace\\KPMG\\src\\main\\resources\\PropertiesFile");
		Properties prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("Browser");

		String URL = prop.getProperty("URL");
        Text=prop.getProperty("Text");
        Email=prop.getProperty("Email");
		title = prop.getProperty("title");
		firstname = prop.getProperty("firstname");
		LastName = prop.getProperty("LastName");
		phoneNumbernumber = prop.getProperty("phoneNumbernumber");
		searchPostcode = prop.getProperty("searchPostcode");

		// REPORT_PATH=prop.getProperty("REPORT_PATH");

		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sudar\\Downloads\\drivers browser\\ChromeDriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);

		}

		else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sudar\\Downloads\\drivers browser\\geckodriver.exe");
			driver = new FirefoxDriver();

			driver.get(URL);
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return ;
		
	}
	

	public void captureScreenShot( WebDriver driver) {
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile method

			FileHandler.copy(src, new File("C://selenium//" + System.currentTimeMillis() + ".png"));

		} catch (IOException e)

		{
			System.out.println(e.getMessage());
		}
	}

}
