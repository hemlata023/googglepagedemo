package googglepagedemo30novexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatortsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.linkText("Elemental Selenium")).click();
		//driver.findElement(By.partialLinkText("Selenium")).click();
		String strurl= driver.findElement(By.linkText("Elemental Selenium")).getAttribute("href=http://elementalselenium.com/");
		System.out.println(strurl);
		driver.findElement(By.cssSelector("button.radius")).click();
		WebElement sercbox =driver.findElement(By.id("APjFqb"));

		

	}

}
