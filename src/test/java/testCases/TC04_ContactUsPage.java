package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageFactory.ContactUsPage;
import pageFactory.HomePage;
import utilities.GeneratlUtilities;

public class TC04_ContactUsPage extends BaseTestCase
{
	@Test
	void ContactDetails() throws InterruptedException
	{
		
		GeneratlUtilities gu = new GeneratlUtilities();
		gu.scrollingPage(driver);
		
		Thread.sleep(4000);

		HomePage hp = new HomePage(driver);
		hp.ClickOnContactUs();

		ContactUsPage cp = new ContactUsPage(driver);
		cp.EnterYourName();
		logger.info("Name Entered");
		cp.EnterEmail();
		logger.info("Email Entered");
		cp.EnterEnquiry();
		logger.info("Enquiry Entered");
		
		gu.scrollingPage(driver);
		Thread.sleep(4000);
		
		cp.ClickOnSubmit();
		
		String actual_text = cp.EnquirySent();
		String expected_text = "Your enquiry has been successfully sent to the store owner!";
		
		Assert.assertEquals(actual_text, expected_text);
		
		cp.ClickOnContinue();
		logger.info("Contact Us Test Case Passed");
				
	}
	
	
	

}
