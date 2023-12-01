package googglepagedemo30novexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select single =new Select(driver.findElement(By.id("select-demo")));
		single.selectByValue("Tuesday");
		
		// TODO Auto-generated method stub

	}

}
