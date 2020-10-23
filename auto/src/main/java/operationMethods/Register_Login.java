package operationMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.WebTestBase;

import pageMethods.SignIn;
import pageMethods.SignUp;

public class Register_Login {
	
	static Select location;
	public static void signIn(String emailId,String passWord) throws InterruptedException {
		SignUp.signIn().click();
		Thread.sleep(2000);
		SignIn.userName().sendKeys(emailId);
		SignIn.passWrod().sendKeys(passWord);
		SignIn.loginButton().click();
	}
	
	public static void address(String firstname, String last_name, String company, String address,String city,String state,String zip_code,String country,String mobileNo, String address_title) {
		SignUp.myaddress().click();
		SignUp.addNewAddress().click();
		SignUp.firstName().sendKeys(firstname);
		SignUp.lastName().sendKeys(last_name);
		WebTestBase.javascript("arguments[0].scrollIntoView();", SignUp.saveButton());
		SignUp.company().sendKeys(company);
		SignUp.address().sendKeys(address);
		SignUp.address2().sendKeys(address);
		SignUp.city().sendKeys(city);
		selectLocation(SignUp.state(), state);
		SignUp.postcode().sendKeys(zip_code);
		selectLocation(SignUp.country(), country);
		SignUp.homePhone().sendKeys(mobileNo);
		SignUp.mobilePhone().sendKeys(mobileNo);
		SignUp.alias().sendKeys(address_title);
		SignUp.saveButton().click();
	}
	
	public static void selectLocation(WebElement element,String visibleText) {
		location = new Select(element);
		location.selectByVisibleText(visibleText);
	}
}
