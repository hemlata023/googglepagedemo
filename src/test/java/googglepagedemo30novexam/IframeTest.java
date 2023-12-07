package googglepagedemo30novexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		WebElement inpbox=driver.findElement(By.xpath("//input[@type='text']"));
		inpbox.sendKeys("Hello Welcome");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		inpbox=driver.findElement(By.xpath("//input[@type='text']"));
		inpbox.clear();
		inpbox.sendKeys(" Welcome Muskan");
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());
		driver.switchTo().frame("frame2");
		 WebElement dr=driver.findElement(By.id("animals"));
		 Select sl=new Select(dr);
		 sl.selectByValue("babycat");
		
		
		


	}

}
