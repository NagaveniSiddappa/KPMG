package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryDetails {
	
	WebDriver driver;
	public  DeliveryDetails (WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"main\"]/section/div/div[2]/div[1]/button[1]")
	WebElement DeleiveryButton;

	@FindBy(id="title")
	WebElement title;
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="phoneNumber-number")
	WebElement phoneNumbernumber;
	@FindBy(id="searchPostcode")
	WebElement searchPostcode;
	@FindBy(xpath="//*[@id=\"main\"]/section/div/div[2]/div[3]/div[2]/div[2]/div/form/div/div/button")
	WebElement FindAddress;
	@FindBy(xpath="//*[@id=\"addressSearchSelect\"]")
	WebElement AddressDropdown;
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/form/div/div/ul/li[1]/button")
	WebElement AddressSelection;
	
	@FindBy (xpath="//*[@id=\"main\"]/section/div/div[2]/div[3]/div[3]/button")
	WebElement UseAddress;
	
	@FindBy (xpath="//*[@id=\"main\"]/section/div/div[2]/div[5]/form/fieldset/div/div[2]/div[1]")
	
	WebElement DeliveryMethod;
	
	
	
	@FindBy (xpath=("//*[@id=\"main\"]/section/div/div[2]/div[5]/form/fieldset/div/div[2]/div[2]/div[2]/ul/li[1]/ul"))
	WebElement CalenderContainer;
	
	@FindBy(xpath=("//*[@id=\"main\"]/section/div/div[2]/div[5]/form/div[2]/button"))
	
	WebElement ContinueToPayment;
	
	public WebElement DeleiveryButton()
	{
	 return DeleiveryButton;	
	}
	
	public WebElement title()
	{
	 return title;	
	}
	public WebElement firstName()
	{
	 return firstName;	
	}
	public WebElement lastName()
	{
	 return lastName;	
	}
	
	public WebElement phoneNumbernumber()
	{
	 return phoneNumbernumber;	
	}
	
	public WebElement searchPostcode()
	{
	 return searchPostcode;	
	}
	
	public WebElement findAddress()
	{
	 return FindAddress;	
	}
	
	public WebElement AddressDropdown()
	{
	 return AddressDropdown;	
	}
	
	public WebElement AddressSelection()
	{
	 return AddressSelection;	
	}
	public WebElement UseAddress()
	{
	 return UseAddress;	
	}
	
	public WebElement DeliveryMethod()
	{
	 return DeliveryMethod;	
	}
	
	public WebElement CalenderContainer()
	{
	 return CalenderContainer;	
	}
	
	public WebElement ContinueToPayment()
	{
	 return ContinueToPayment;	
	}
	}
	
	
	

