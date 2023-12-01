package googglepagedemo30novexam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MYgooglepage {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
		options.addArguments("--headless");
		
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		WebElement sercbox =driver.findElement(By.id("APjFqb"));
		
		sercbox.sendKeys("java tutorial");
		sercbox.sendKeys(Keys.ENTER);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
