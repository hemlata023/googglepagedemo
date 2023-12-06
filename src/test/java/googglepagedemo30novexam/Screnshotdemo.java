package googglepagedemo30novexam;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screnshotdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions= new Actions(driver);
		
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=25_28");
		//actions.scrollByAmount(10,400).perform();
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src= screen.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")
				+ "/screenshots/" + System.currentTimeMillis() +".png";
		FileUtils.copyFile(src, new File(path));
		
		WebElement image= driver .findElement(By.cssSelector("div.col-12.text-center"));
		actions.scrollToElement(image).perform();
		
		
		

	}

}
