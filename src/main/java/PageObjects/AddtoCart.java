package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	
	WebDriver driver;
	public  AddtoCart (WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
   
	
	
	@FindBy(id="button--add-to-basket")
	
	WebElement AddToBasket;
	
	@FindBy (linkText="Go to your basket")
	
	WebElement GoToBasket;
	
	


public WebElement addtobasket()
{
	return AddToBasket;
}

public WebElement gotobasket()
{
	return GoToBasket;
}


}
