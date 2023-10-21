package practicaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ejercicio_1 {

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
		
	
		//Dropdown
		driver.manage().window().maximize(); //para maximizar al pantalla
		Select drpdwnProdSelect = new Select (driver.findElement(By.className("product_sort_container")));
		drpdwnProdSelect.selectByVisibleText("Price (high to low)");
		
		//Encontrar "Add to Cart" y agregar producto
		WebElement addCart = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		addCart.click();
		
		//Encontrar el carrito de compras y dar click
		WebElement carCompra = driver.findElement(By.id("shopping_cart_container"));
		carCompra.click();
		
		//Validar "Your Cart" label esta desplegado
		String yourCartLabel = driver.findElement(By.className("title")).getText();
		System.out.println("La etiqueta es: " + yourCartLabel);
		
		//Encontrar boton Checkout y dar click
		WebElement checkOutbtn = driver.findElement(By.id("checkout"));
		checkOutbtn.click();
		
		//Encontrar "Checkout Information", llenar con informacion y mandar data
		WebElement firstNameTxt = driver.findElement(By.id("first-name"));
		firstNameTxt.sendKeys("Ramon");
		
		WebElement lastNameTxt = driver.findElement(By.id("last-name"));
		lastNameTxt.sendKeys("Cardenas");
		
		WebElement zipCode = driver.findElement(By.id("postal-code"));
		zipCode.sendKeys("20200");
		
		//Encontrar "Continue" button y dar click
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		
		//Validar "Check - Overview" label esta desplegado
		String checkoutOverview = driver.findElement(By.className("title")).getText();
		System.out.println("La etiqueta es: " + checkoutOverview);
		
		//Encontrar "Finish" boton esta y dar click
		WebElement finishBtn = driver.findElement(By.id("finish"));
		finishBtn.click();
		
		//Validar que el mensaje de compra es correcto
		String thxOrder = driver.findElement(By.className("complete-header")).getText();
		System.out.println("La etiqueta es: " + thxOrder);
		
		String compraCompleta = "Thank you for your order!";
		
		if ( compraCompleta.contains(thxOrder)) 
			{
				System.out.println("La compra se realizo correctamente");
			}
		else 
			{
				System.out.println("La compra no se realizo");
			}
		
		//Cerrar navegador
		//driver.close();  //cierra la ventana/pestaña actual que el webdirver esta usando
		//driver.quit();    //cierra todas las ventanas del browser que el webdriver usa
		
	}

}
