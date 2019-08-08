package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public  HomePage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@id='desktopSearch']")
	
	WebElement SearchText;
	
	//@FindBy (xpath="//*[@id=\"root\"]/header/div[3]/div/div[2]/div/div[1]/div/div[1]/form/div/div/button")
	@FindBy (xpath="//*[@id=\"mobile-search\"]/div/div[1]/form/div/div/button")
	WebElement SearchButton;
	
	@FindBy (css="body > main > div.product-set-container > div.product-list-container-right > div.product-list-container > div.product-list-container__chunk.product-list-container__chunk--1 > section:nth-child(1) > div.product-card__image-wrap > a > img")
			
	WebElement SelectProduct;



public WebElement SearchText()
{
	return SearchText;
}

public WebElement SearchButton()
{
	return SearchButton;
}

public WebElement SelectProduct()
{
	return SelectProduct;
}
}