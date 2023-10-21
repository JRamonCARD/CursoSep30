package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClasses;

public class LoginPage {
	
	//Constructor siempre va, este comienza llamando todos los elementos pero sin usarlos
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//LoginPage WebElements
	
	//@FindBy es palabra reservada de selenium para encontrar elementos, en este caso encuentro By ID despues la declaro privada del tipo WebElement y la nombro "userName"
	@FindBy(id = "user-name")
	private WebElement userNameTxt;
	
	@FindBy(id = "password")
	private WebElement pswTxt;
	
	@FindBy(id = "login-button")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//*[@data-test= 'error']")
	private WebElement errorBox;
	
	
	
	
	
	//Metodo llamadao "login" para hacer el login en la LoginPage
	public void  login(String user, String pwd) {
		
		WrapClasses.sendKeys(userNameTxt, user);  //mando llamar de la WrapClasses el metodo sendKeys en el cual obtengo el userNameTxt y se lo asigno a la variable "user"
		WrapClasses.sendKeys(pswTxt, pwd);
		WrapClasses.click(btnLogin);
		
	}
	
	//Metodo para guardar en una variable tipo boolean  el contenido del elemento "errorbox" despues validar que contenga el text que pude en contains
	public boolean validateLockedError() {
		boolean errorDisplayed = WrapClasses.getText(errorBox).contains("Sorry, this user has been locked out");
		return errorDisplayed;
	}

}
