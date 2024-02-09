package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest{
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
  @Test
  public void sampleMethodForEnteringCredentials() {
	  logger.info("Sign in to Login Page");
	  homePage.signInButton();
	  logger.info("Verifying if Login Page is loaded");
	  loginPage.verifyIfLoginPageIsLoaded();
	  logger.info("Entering the credentials");
	  loginPage.enterCredentials();
  }
}
