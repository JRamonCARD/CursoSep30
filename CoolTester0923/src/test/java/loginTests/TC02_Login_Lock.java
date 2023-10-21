package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.LoginPage;

public class TC02_Login_Lock {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setDriver();
	
	
	//Objetos de la login page
	LoginPage loginPage = new LoginPage(driver);
	
   
	@BeforeTest
	public void startWebPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	
    @Test
    public void TC02() {
    	
    	loginPage.login(GlobalVariables.LOCK_USER, GlobalVariables.STANDARD_PASSWORD);
    	
    	
    	//Declaro variable boolean para validar contenido y despues un assert para saber si es correcto el mensaje de error
    	boolean error = loginPage.validateLockedError();
    	
    	//Validate que el contenido de "error" sea cierto que contenga el mensaje esperado
    	Assert.assertTrue(error);
    }
    
    @AfterTest
    public void closeDriver() {
    	driver.quit();
    }
  
  
}
