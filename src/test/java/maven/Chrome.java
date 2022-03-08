package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
	
@Test
public void sample() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	driver.close();
	
}

}
