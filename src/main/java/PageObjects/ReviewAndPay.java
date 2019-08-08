package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ReviewAndPay {
	

	
	
		
		WebDriver driver;
		
		public  ReviewAndPay (WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		
		@FindBy(css=".order-item_itemType__e8047")
		
		WebElement Item;
		
		@FindBy (xpath="//*[@id=\"main\"]/section/div/div[2]/div/div[1]/div/div/div[2]/dl/dt")
		
		WebElement deliveryMethod;
		
		


	public WebElement Item()
	{
		return Item;
	}

	public WebElement deliveryMethod ()
	{
		return deliveryMethod;
	}

	
	}

