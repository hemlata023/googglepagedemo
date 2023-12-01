package googglepagedemo30novexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkRadiotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		//WebElement sercbox =driver.findElement(By.id("isAgeSelected"));
		//if(!sercbox.isSelected()) {
			//sercbox.click();
			
		//}
		
		


	}

}
