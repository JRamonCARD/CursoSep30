package practicaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		//Obtener objetos/webelements de ala pagina web
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[@data-test = 'login-button']"));
			
				
		//Login
		userNameTxt.sendKeys("standard_user");
		Thread.sleep(200);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(200);
		loginBtn.click();
		
		
		//Obtener titulo de la pagina
		String title = driver.getTitle();
		System.out.println("El titulo es: " + title);
		
		//Obtener la url
		String url = driver.getCurrentUrl();
		System.out.println("La URL es: " + url);
		
		//Metodo de navegacion
			//driver.navigate().back();
			//Thread.sleep(500);
		
			//driver.navigate().forward();
			//Thread.sleep(500);
		
			//driver.navigate().refresh();
		
		
		//verificar que un elemento este desplegado en la pagina
		boolean prodContainer = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if (prodContainer) {
			System.out.println("El articulo esta desplegado");
		}
		
		
		//Obtener el text de un elemento
		String prodName = driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println("El producto es: " + prodName);
		
		//Dropdown
		driver.manage().window().maximize(); //para maximizar al pantalla
		Select drpdwnProdSelect = new Select (driver.findElement(By.className("product_sort_container")));
		drpdwnProdSelect.selectByVisibleText("Price (high to low)");
		
			
		//Cerrar navegador
		driver.close();  //cierra la ventana/pestaña actual que el webdirver esta usando
		driver.quit();    //cierra todas las ventanas del browser que el webdriver usa
		
	}

}
