package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/java/browserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=addresses");
		List<WebElement> l = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));
		for (WebElement webElement : l) {
			System.out.println(webElement.getText());
		}
	}
}
