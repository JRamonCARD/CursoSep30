package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClasses {
	
	//Metodo para dar clicks
	public static void click(WebElement webelementUI) {
		webelementUI.click();
	}
	
	//Metodo para mandara texto a web elements tipo cajas de texto
	public static void sendKeys (WebElement webelementUI, String text) {
		webelementUI.sendKeys(text);
	}
	
	public static String getText (WebElement webelementUI) {
		return webelementUI.getText();

	}
}