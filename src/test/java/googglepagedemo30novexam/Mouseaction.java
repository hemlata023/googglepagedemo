package googglepagedemo30novexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions actions= new Actions(driver);
		
		driver.get("https://demo.opencart.com/");
		WebElement srcbox=driver.findElement(By.name("search"));
		actions.contextClick(srcbox).perform();
		WebElement menu =driver.findElement(By.xpath("/html/body/main/div[1]/nav/div[2]/ul/li[3]/a"));
		actions.moveToElement(menu).perform();
		WebElement menuitem=driver.findElement(By.xpath("/html/body/main/div[1]/nav/div[2]/ul/li[3]/a"));
		
		actions.moveToElement(menu).click(menuitem).build().perform();
		
		

	}

}
