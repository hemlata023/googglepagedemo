package googglepagedemo30novexam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/tooltip/");
		Actions actions= new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.id("age")).sendKeys(Keys.PAGE_DOWN);
		
		
		WebElement op= driver.findElement(By.id("age"));
		actions.moveToElement(op).perform();
		String strtext= driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println("tooltip text is..."+strtext);
		
		
		

	}

}
