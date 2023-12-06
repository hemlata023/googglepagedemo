package googglepagedemo30novexam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentwin= driver.getWindowHandle();
		System.out.println("parent Win : " +parentwin);
		WebElement tabbin= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]/button"));
		tabbin.click();
		Set<String> tabs=driver.getWindowHandles();
		System.out.println("Numbers of windows......"+ tabs.size());
		for(String child:tabs) {
			System.out.println("windows......"+ child);
			if(!child.equalsIgnoreCase(parentwin));
			  driver.switchTo().window(child);
			  System.out.println("CHILD win with......"+  driver.getTitle());
			  
			  
	
		}
		
		
		
		
		

	}

}
