package testCases;

import org.testng.annotations.Test;

import pageFactory.HomePage;

public class SearchByPranav extends BaseTestCase {
	
	@Test
	void search () {
		
	HomePage hp=new HomePage(driver);
	hp.ClickOnSearchBar();
	
	}
}
