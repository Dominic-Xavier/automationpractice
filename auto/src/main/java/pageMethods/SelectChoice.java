package pageMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.WebTestBase;

public class SelectChoice extends WebTestBase {
	
	public static List<WebElement> category(){
		List<WebElement> dresses = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));
		return dresses;
	}
	
	public static List<WebElement> choice_of_dress(){
		List<WebElement> dresses = driver.findElements(By.xpath("(//ul)[4]//li"));
		return dresses;
	}
	
	public static WebElement listView(){
		return driver.findElement(By.xpath("//a[text()='List']"));
	}
	
	public static WebElement addToCart(int index){
		return driver.findElement(By.xpath("(//a[@title='Add to cart'])["+index+"]"));
	}
}
