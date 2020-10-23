package operationMethods;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.util.WebTestBase;

import pageMethods.AddToCart;
import pageMethods.SelectChoice;
import pageMethods.SignIn;
import pageMethods.SignUp;

public class Operaion extends WebTestBase {
	
	static int count=1;
	
	public static void category(String value) {
		Actions mouse = new Actions(driver);
		List<WebElement> category = SelectChoice.category();
		for (WebElement webElement : category) {
			String categor = webElement.getText();
			if(categor.equals(value)) {
				mouse.moveToElement(webElement).build().perform();
				break;
			}	
		}
	}
	
	public static void subcategory(String value) {
		List<WebElement> list = SelectChoice.choice_of_dress();
		for (WebElement webElement : list) {
			String categor = webElement.getText();
			if(categor.equals(value)) {
				webElement.click();
				break;
			}	
		}
		SelectChoice.listView().click();
	}
	
	public static void more(int value) {
		WebElement morebutton = AddToCart.more(value);
		scrollView(morebutton);
		morebutton.click();
	}
	
	public static void addToCart() throws InterruptedException {
		AddToCart.numberOfItems().sendKeys("5");
		Select size = new Select(AddToCart.size());
		size.selectByVisibleText("L");
		AddToCart.color("Yellow").click();
		WebElement addtocart = AddToCart.addToCart();
		scrollView(addtocart);
		addtocart.click();
		if(count<=2) {
			Thread.sleep(3000);
			WebTestBase.javascript("arguments[0].click();", AddToCart.continueShopping());
			count++;
		}
		else {
			WebTestBase.javascript("arguments[0].click();", AddToCart.proceedToCheckOut());
		}
	}
	
	public static void proceedToCheckout() throws InterruptedException {
		WebElement proceedToCheckOutMainPage, proceedToCheckOutAddress, checkoutShipping, payment, confirnOrder;
		proceedToCheckOutMainPage = AddToCart.proceedToCheckOutMainPage();
		scrollView(proceedToCheckOutMainPage);
		//proceed to checkout
		proceedToCheckOutMainPage.click();
		proceedToCheckOutAddress = AddToCart.proceedToCheckOutAddress();
		scrollView(proceedToCheckOutAddress);
		//proceed to checkout in Address
		proceedToCheckOutAddress.click();
		//tos click
		AddToCart.tos().click();
		checkoutShipping = AddToCart.proceedToCheckOutShipping();
		//proceed to checkout in shipping
		scrollView(checkoutShipping);
		checkoutShipping.click();
		payment = AddToCart.payByBanWire();
		scrollView(payment);
		payment.click();
		confirnOrder = AddToCart.conformMyOrder();
		scrollView(confirnOrder);
		confirnOrder.click();
	}
	
	public static void orderHistory() throws IOException {
		SignUp.account().click();
		AddToCart.orderHistory().click();
		WebTestBase.screenshot("payment");
		SignIn.logOut().click();
	}
	
	public static void scrollView(WebElement element) {
		WebTestBase.javascript("arguments[0].scrollIntoView();", element);
	}
}
