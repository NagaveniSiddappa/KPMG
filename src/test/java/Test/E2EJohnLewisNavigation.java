package Test;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import PageObjects.HomePage;
import PageObjects.ReviewAndPay;
import PageObjects.AddtoCart;
import PageObjects.CheckOut;
import PageObjects.DeliveryDetails;




public class E2EJohnLewisNavigation extends TestBase {

	TestBase testbase = new TestBase();
	HomePage homepage = new HomePage(driver);
	HomePage home = PageFactory.initElements(driver, HomePage.class);
	AddtoCart addtocart = new AddtoCart(driver);
	AddtoCart add2cart = PageFactory.initElements(driver, AddtoCart.class);
	DeliveryDetails deldetails = new DeliveryDetails(driver);
	DeliveryDetails delvrydetails = PageFactory.initElements(driver, DeliveryDetails.class);
	CheckOut checkout = new CheckOut(driver);
	CheckOut checkOut = PageFactory.initElements(driver, CheckOut.class);
	ReviewAndPay ReviewPay = new ReviewAndPay(driver);
	ReviewAndPay ReviewOrder = PageFactory.initElements(driver, ReviewAndPay.class);
	static ExtentTest test;

	static ExtentReports report;

	@BeforeTest
	public void intializedriver() throws IOException

	{
		testbase.setUp();
		
	}

	@Test()

	public void VerifyHomePage() throws InterruptedException {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		AddtoCart add2cart = PageFactory.initElements(driver, AddtoCart.class);
		CheckOut checkOut = PageFactory.initElements(driver, CheckOut.class);
		DeliveryDetails delvrydetails = PageFactory.initElements(driver, DeliveryDetails.class);
		home.SearchText();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		home.SearchText().sendKeys(testbase.Text);
		home.SearchText().sendKeys(Keys.RETURN);;
		try {
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Actions actionn = new Actions(driver);
			actionn.click(home.SelectProduct()).click().build().perform();

		}

		catch (Exception e) {

			driver.manage().window().maximize();
		}
		WebElement myelement = driver.findElement(By.className("button"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement);

		add2cart.addtobasket().click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions builder = new Actions(driver);

		builder.moveToElement(add2cart.gotobasket()).click().build().perform();

		checkOut.continuetocheckout().click();
		checkOut.guest().click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		checkOut.email().sendKeys(testbase.Email);
		checkOut.Continueasguest().click();
		delvrydetails.DeleiveryButton().click();
		delvrydetails.title().sendKeys(testbase.title);
		delvrydetails.firstName().sendKeys(testbase.firstname);
		delvrydetails.lastName().sendKeys(testbase.LastName);
		delvrydetails.phoneNumbernumber().sendKeys(testbase.phoneNumbernumber);
		delvrydetails.searchPostcode().sendKeys(testbase.searchPostcode);
		delvrydetails.findAddress().click();
		try {
			Select s = new Select(delvrydetails.AddressDropdown());
			s.selectByIndex(1);

		}

		catch (Exception e1) {
			delvrydetails.AddressSelection().click();
		}

		delvrydetails.UseAddress().click();
		
		Thread.sleep(5000);
		delvrydetails.DeliveryMethod().click();
	
	SimpleDateFormat df = new SimpleDateFormat("dd");
		Date dt = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(dt);
		
		cl.add(Calendar.DAY_OF_YEAR, 4);
		dt = cl.getTime();
		String str = df.format(dt);
		System.out.println("The date today is " + str);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement dateWidget = delvrydetails.CalenderContainer();

	  //System.out.println(dateWidget.getText());
			
	  List<WebElement> columns = dateWidget.findElements(By.tagName("li"));
        System.out.println(columns.size());
        
       
	
	
		for (WebElement cell : columns) {
			
			System.out.println(cell);
			if (cell.getText().contains(str)) {

				cell.click();

				break;
			}
		}
		
		
		delvrydetails.ContinueToPayment().click();
        //testbase.captureScreenShot(driver);
	} 
	
	@Test
	
	public void verifyReviewPage()
	{
	ReviewAndPay ReviewOrder = PageFactory.initElements(driver, ReviewAndPay.class);
	
	Assert.assertEquals(ReviewOrder.deliveryMethod().getText(), "Next or named day delivery");
	}
	
	
	


	@AfterTest

	public void tearup() {

		testbase.captureScreenShot(driver);

		driver.close();
	}

}
