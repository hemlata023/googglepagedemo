package googglepagedemo30novexam;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autocomplite {
    public static final String expValue= "JavaScript";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Actions actions= new Actions(driver);
		driver.get("https://jqueryui.com/autocomplete/");
		
	   WebElement frame1 =driver.findElement(By.cssSelector(".demo-frame"));
	   driver.switchTo().frame(frame1);
	   
		
		WebElement inp =driver.findElement(By.cssSelector("#tags"));
		inp.sendKeys("as");
		List<WebElement> items=  driver.findElements(By.cssSelector("ul#ui-id-1 >li"));
		System.out.println("number of matching items......"+items.size());
		for(WebElement item: items) {
			System.out.println(item.getText());
			if(item.getText().equalsIgnoreCase(expValue)) {
				item.click();
				break;
				
			}

			
		}
		

	}

}
