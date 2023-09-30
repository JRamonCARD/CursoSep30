package pruebaSeleniumDos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  //Double slash to add comments
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.test.com");
		
  }
}
