package pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.util.WebTestBase;

public class SignUp extends WebTestBase {
	
	public static WebElement account() {
		return driver.findElement(By.className("account"));
	}
	
	public static WebElement signIn() {
		return driver.findElement(By.linkText("Sign in"));
	}
	
	public static WebElement createAccountEmailAddress() {
		return driver.findElement(By.xpath("//input[@id='email_create']"));
	}
	
	public static WebElement createAccountButton() {
		return driver.findElement(By.id("SubmitCreate"));
	}
	
	public static WebElement Mr() {
		return driver.findElement(By.id("id_gender1"));
	}
	
	public static WebElement Mrs() {
		return driver.findElement(By.id("id_gender2"));
	}
	
	public static WebElement customerFirstName() {
		return driver.findElement(By.id("customer_firstname"));
	}
	
	public static WebElement customerLastName() {
		return driver.findElement(By.id("customer_lastname"));
	}
	
	public static WebElement e_Mail() {
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement passWord() {
		return driver.findElement(By.id("passwd"));
	}
	
	public static WebElement date() {
		return driver.findElement(By.id("days"));
	}
	
	public static WebElement month() {
		return driver.findElement(By.id("months"));
	}
	
	public static WebElement year() {
		return driver.findElement(By.id("years"));
	}
	
	public static WebElement firstName() {
		return driver.findElement(By.id("firstname"));
	}
	
	public static WebElement lastName() {
		return driver.findElement(By.id("lastname"));
	}
	
	public static WebElement company() {
		return driver.findElement(By.id("company"));
	}
	
	public static WebElement address() {
		return driver.findElement(By.id("address1"));
	}
	
	public static WebElement address2() {
		return driver.findElement(By.id("address2"));
	}
	
	public static WebElement city() {
		return driver.findElement(By.id("city"));
	}
	
	public static WebElement state() {
		return driver.findElement(By.id("id_state"));
	}
	
	public static WebElement postcode() {
		return driver.findElement(By.id("postcode"));
	}
	
	public static WebElement country() {
		return driver.findElement(By.id("id_country"));
	}
	
	public static WebElement additionalInformation() {
		return driver.findElement(By.id("other"));
	}
	
	public static WebElement mobilePhone() {
		return driver.findElement(By.id("phone_mobile"));
	}
	
	public static WebElement homePhone() {
		return driver.findElement(By.id("phone"));
	}
	
	public static WebElement alias() {
		return driver.findElement(By.id("alias"));
	}
	
	public static WebElement register() {
		return driver.findElement(By.id("submitAccount"));
	}
	
	public static WebElement saveButton() {
		return driver.findElement(By.id("submitAddress"));
	}
	
	public static WebElement myaddress() {
		return driver.findElement(By.xpath("//a[@title='Addresses']"));
	}
	
	public static WebElement addNewAddress() {
		return driver.findElement(By.xpath("//a[@title='Add an address']"));
	}
}
