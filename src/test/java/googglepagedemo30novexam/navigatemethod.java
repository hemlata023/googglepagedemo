package googglepagedemo30novexam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
        WebElement sercbox =driver.findElement(By.id("APjFqb"));
		
		sercbox.sendKeys("java tutorial");
		sercbox.sendKeys(Keys.ENTER);
		System.out.println("Title......" +driver.getTitle());
		System.out.println("Title......" +driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Title......" +driver.getTitle());
		driver.navigate().forward();
		
		
		
	}

}
