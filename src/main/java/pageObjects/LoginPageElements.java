package pageObjects;

public interface LoginPageElements {
	String loginButton = "//button[@type=\"submit\" and contains(text(),'Sign In')]";
	String emailAddress = "//span[contains(text(),'Sign in with')]/parent::div/form/div/input[@type='email']";
	String password = "//span[contains(text(),'Sign in with')]/parent::div/form/div/input[@type='password']";
}
