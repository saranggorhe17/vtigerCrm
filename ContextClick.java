package ActionClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class ContextClick {

	public static void main(String[] args) 
	{
	
		WebDriver driver =new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://demo.guru99.com/test/simple_context_menu.html");
         Actions a = new Actions(driver);
         a.contextClick();
         a.perform();

	}

}
