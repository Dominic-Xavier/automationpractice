package com.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTestBase {
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static void browserOpen(String browser_Name) {
		
		switch(browser_Name.toLowerCase()) {
			case "chrome":{
				System.setProperty("webdriver.chrome.driver", "./src/main/java/browserDrivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			}
			
			case "internet explorer":{
				System.setProperty("webdriver.ie.driver", "./src/main/java/browserDrivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
			}
			
			case "firefox":{
				System.setProperty("webdriver.gecko.driver", "./src/main/java/browserDrivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			}
			
			default:
				System.err.println("Incorrect browser name");
		}
	}
	
	public static void pass_Url(String url) {
		driver.get(url);
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static WebDriverWait explicit_weight(WebElement element,int SECONDS) {
		
		WebDriverWait wait = new WebDriverWait(driver,SECONDS);
		wait.until(ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		return wait;
	}
	
	public static void implicit_wait(int Seconds) {
		driver.manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);
	}
	
	public static void javascript(String javascriptCommand) {
		js = ((JavascriptExecutor)driver);
		js.executeScript(javascriptCommand);
	}
	
	public static void javascript(String javascriptCommand,WebElement ele) {
		js = ((JavascriptExecutor)driver);
		js.executeScript(javascriptCommand, ele);
	}
	
	public static void screenshot(String file_name) throws IOException {
		File screen_shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen_shot, new File("./Screenshot/"+file_name+".jpg"));
	}
	
	public void mouseOver() {
		
	}
	
	public static void close() {
		driver.quit();
	}
}
