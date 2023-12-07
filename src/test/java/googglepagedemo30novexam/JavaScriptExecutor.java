package googglepagedemo30novexam;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String strTitle=(String)js.executeScript("return document.title");
		System.out.println(strTitle);
		
		
		
		
		
		js.executeScript("window.scrollBy(10,document.body.scrollHeight)");
		
	}

}
