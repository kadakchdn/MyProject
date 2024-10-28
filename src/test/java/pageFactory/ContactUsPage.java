package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneratlUtilities;

public class ContactUsPage 
{
	//Fill Contact Us Form
	
	WebDriver driver;
    public ContactUsPage(WebDriver driver)
    {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
    	
	}
    

	@FindBy(xpath="//input[@id='input-name']")
	WebElement YourName;
	
	@FindBy (xpath="//input[@id='input-email']")
	WebElement Email;
	
	@FindBy (xpath="//textarea[@id='input-enquiry']")
	WebElement Enquiry;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement Submit;
	
	@FindBy (xpath="//p[contains(text(),'Your enquiry has been successfully sent to the sto')]")
	WebElement EnquirySuccessfullySent;
	
	@FindBy (xpath="//a[@class='btn btn-primary']")
	WebElement ContinueAfterEnquirySent;
	
	
	public void EnterYourName()
	{
		
		String firstname = GeneratlUtilities.generateDynamicFirstname();
		String lastname = GeneratlUtilities.generateDynamicLastname();
		YourName.sendKeys(firstname +" " +lastname);

		
		 
	}
	
	public void EnterEmail()
	{
		String email = GeneratlUtilities.generateDynamicEmail();
		Email.sendKeys(email);
		GeneratlUtilities.r_email=email;
	}
	
	public void EnterEnquiry()
	{
		String enquiry = GeneratlUtilities.generateDynamicEnquiry();
		Enquiry.sendKeys(enquiry);
		GeneratlUtilities.r_query=enquiry;
		
	}
	
	public void ClickOnSubmit()
	{
		Submit.click();
	}
	
	public String EnquirySent()
	{
		return EnquirySuccessfullySent.getText();
	}
	
	public void ClickOnContinue()
	{
		ContinueAfterEnquirySent.click();
	}
	

}
