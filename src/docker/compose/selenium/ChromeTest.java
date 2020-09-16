package docker.compose.selenium;

import static org.testng.Assert.assertEquals;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	

	
  @Test
  public void test01() throws Exception {	
	  
	  DesiredCapabilities capability = DesiredCapabilities.chrome();
	  
	  //Below ip address needs to be changed as per that machine where docker is running
	  URL url = new URL("http://35.175.128.90:4444/wd/hub");
  
	 
	  RemoteWebDriver driver = new RemoteWebDriver(url, capability);
	  
	  driver.get("https://www.google.com/");
	  
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  assertEquals(actualTitle, expectedTitle);
	  System.out.println(actualTitle);
	  
	  Thread.sleep(5000);
	  
	  driver.quit();
	  
	  
  }
}
