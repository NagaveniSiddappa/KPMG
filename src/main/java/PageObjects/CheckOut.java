package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	
	WebDriver driver;
	public  CheckOut (WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (css="#link-button--basket-continue-securely")
	WebElement ContinueToCheckout;
	
	@FindBy(xpath="//*[@id=\"main\"]/section/div/div/div/div[2]/div[1]/div/label/span")
	 WebElement guest;
	@FindBy (xpath="//*[@id=\"email\"]")
	
	WebElement Email;
	
	
   @FindBy (xpath="//*[@id=\"main\"]/section/div/div/div/div[2]/div[2]/form/div[2]/button")
   WebElement Continueasguest;
   
   
   
   public WebElement continuetocheckout()
   {
   	return ContinueToCheckout;
   	
   }
   
   public WebElement guest()
   {
   	return guest;
   }
   
   public WebElement email()
   {
   	return Email;
   }
   
   public WebElement Continueasguest()
   {
   	return Continueasguest;
   }
   
	

}
