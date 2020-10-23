package pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

public class SignIn extends WebTestBase {
	public static WebElement userName() {
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement passWrod() {
		return driver.findElement(By.id("passwd"));
	}
	
	public static WebElement forgotPassWrod() {
		return driver.findElement(By.linkText("Forgot your password?"));
	}
	
	public static WebElement loginButton() {
		return driver.findElement(By.id("SubmitLogin"));
	}
	
	public static WebElement logOut() {
		return driver.findElement(By.linkText("Sign out"));
	}
}
