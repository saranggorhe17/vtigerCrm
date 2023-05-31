package ActionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://collegedunia.com/college/2868-mallamma-marimallappa-womens-arts-and-commerce-college-mysore");
        List<WebElement> all = driver.findElements(By.xpath("//li[@class='jsx-947163246 position-relative mr-12 list-item-text nav-item']"));
         Actions a = new Actions(driver);
         a.keyDown(Keys.CONTROL);
         
         for(WebElement e : all )
         {
        	 //e.click();
        	 //System.out.println(e.getText());
        	 a.click( );
         }
         a.keyUp(Keys.CONTROL);
         a.perform();


	}

}
