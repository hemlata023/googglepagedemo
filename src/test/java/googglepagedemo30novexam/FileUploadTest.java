package googglepagedemo30novexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		WebElement addFile= driver.findElement(By.xpath("//input[@type='file']"));
		String strpath=System.getProperty("user.dir")
				+ "/screenshots/" + "//1701840632433.png";
		addFile.sendKeys(strpath);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
