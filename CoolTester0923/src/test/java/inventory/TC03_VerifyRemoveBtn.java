package inventory;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClasses;
import navigationPages.InventoryPage;
import navigationPages.LoginPage;

public class TC03_VerifyRemoveBtn {
	
	//Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setDriver();
	
	
	//Page Objects
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventory = new InventoryPage(driver);
	
   
	@BeforeTest
	public void startWebPage() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	
    @Test
    public void TC03() {
    	
    	loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.STANDARD_PASSWORD); //Logueo en la pagina
    	
    	boolean isBtnDisplayed = inventory.addToCartAndVerifyRemoveBtn(); //creacion de variable tipo boolean llamada isBtnDisplayed instanciando el metodo donde valido eso
    	Assert.assertTrue(isBtnDisplayed); //Validacion del boton con Assert    	
    }
    
    @AfterTest
    public void closeDriver() {
    	WrapClasses.takeScreenshot(driver, "TC03_VerifyRemoveBtn");    	
    	driver.quit();
    }
  
  
}
