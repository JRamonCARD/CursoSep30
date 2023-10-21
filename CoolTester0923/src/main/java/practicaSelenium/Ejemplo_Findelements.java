package practicaSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_Findelements {

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
		
		
		//Findelements nos regresauna lista de todos los webelements que contengan el mismo localizador
		List <WebElement> prodList = driver.findElements(By.className("inventory_item_name"));
		System.out.println("El numero de elementos es: " + prodList.size()); // para que imprima el numero de elementos de una lista.
		
		//Obtener el nombre del elemento dependiendo de su ubicación en ele arreglo
		String primerProd = prodList.get(0).getText();
		String segProd = prodList.get(1).getText();
		System.out.println(primerProd);
		System.out.println(segProd);
		
		//Ciclo for para imprimir los productos de la lista
		for (int i =0; i < prodList.size(); i++)
		{
			System.out.println("Los productos de la lista: " + prodList.get(i).getText());
		}
		

	}

}
