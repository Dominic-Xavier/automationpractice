package main;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.util.WebTestBase;

import operationMethods.Operaion;
import operationMethods.Register_Login;
import pageMethods.SignUp;

public class MainClass {
	
	@BeforeClass
	public void openbrowser() {
		WebTestBase.browserOpen("Chrome");
		WebTestBase.maximizeWindow();
		WebTestBase.pass_Url("http://automationpractice.com/");
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		Register_Login.signIn("faret84833@ptcji.com", "vzlys1995");
	}
	
	@Test(priority = 2)
	public void address() {
		Register_Login.address("demo", "demo", "xyz", "No.12,Texas,US", "Texas", "New York", "10005", "United States", "9856412587", "Home Address");
	}
	
	@Test(priority = 3,dependsOnMethods = {"login","address"})
	public void selectDress() throws InterruptedException {
		for (int i = 1; i <=3; i++) {
			Operaion.category("WOMEN");
			Operaion.subcategory("Summer Dresses");
			Operaion.more(i);
			Operaion.addToCart();
		}
	}
	
	@Test(priority = 4,dependsOnMethods = {"login","address","selectDress"})
	public void checkout() throws InterruptedException, IOException {
		Operaion.proceedToCheckout();
		Operaion.orderHistory();
	}
}
