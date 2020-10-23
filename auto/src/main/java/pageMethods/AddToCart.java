package pageMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

public class AddToCart extends WebTestBase {
	
	public static WebElement numberOfItems() {
		return driver.findElement(By.id("quantity_wanted"));
	}
	
	public static WebElement size() {
		return driver.findElement(By.id("group_1"));
	}
	
	public static WebElement color(String color) {
		return driver.findElement(By.xpath("//ul[@id='color_to_pick_list']//li//a[@name='"+color+"']"));
	}
	
	public static WebElement addToCart() {
		return driver.findElement(By.xpath("//button[@name='Submit']"));
	}
	
	public static WebElement proceedToCheckOut() {
		return driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	}
	
	public static WebElement more(int index) {
		return driver.findElement(By.xpath("(//a[@title='View'])["+index+"]"));
	}
	
	public static WebElement continueShopping() {
		return driver.findElement(By.xpath("//div[@class='button-container']//span[@title='Continue shopping']"));
	}
	
	public static WebElement proceedToCheckOutMainPage() {
		return driver.findElement(By.xpath("//a[@title='Proceed to checkout']//span[text()='Proceed to checkout']"));
	}
	
	public static WebElement proceedToCheckOutAddress() {
		return driver.findElement(By.name("processAddress"));
	}
	
	public static WebElement proceedToCheckOutShipping() {
		return driver.findElement(By.name("processCarrier"));
	}
	
	public static WebElement tos() {
		return driver.findElement(By.id("cgv"));
	}
	
	public static WebElement conformMyOrder() {
		return driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	}
	
	public static WebElement payByBanWire() {
		return driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
	}
	
	public static WebElement orderHistory() {
		return driver.findElement(By.xpath("//a[@title='Orders']"));
	}
}
