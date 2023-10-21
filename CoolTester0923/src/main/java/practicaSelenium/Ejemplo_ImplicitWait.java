package practicaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_ImplicitWait {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Implicit wait que espere 5 segundos antes de arrancar toda la busqueda
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement userNameTxt = driver.findElement(By.id("user-name"));

	}

}
