package commonClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

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
	
	public static  boolean verifyElementDisplayed (WebElement webelementUI) {
		return webelementUI.isDisplayed();
	}
	
	public static void takeScreenshot (WebDriver webdriver, String testCaseName) {
		
		//Tomar el screenshot de la pagina
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		//La ruta donde se va a guardar el screenshot
		String screenshotPath = "./test-output/ExecutionResults";
		
		//Creamos el folder usando la ruta especifica de la variable screenshot
		FileHandler.createDir(new File (screenshotPath));
		
			try {
				FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
			}catch (IOException e){
				e.printStackTrace();
				
			}
		
		
	}
	
}