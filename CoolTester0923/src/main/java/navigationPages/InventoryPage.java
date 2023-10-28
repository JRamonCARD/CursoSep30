package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClasses;

public class InventoryPage {
	
	
		//Constructor siempre va
		public InventoryPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//LoginPage WebElements
		@FindBy(id = "add-to-cart-sauce-labs-backpack")
		private WebElement addCartBtn;
		
		@FindBy(id = "remove-sauce-labs-backpack")
		private WebElement removeCartBtn;
		
		//Metodo para verificar  Remover esta desplegado
		public  boolean addToCartAndVerifyRemoveBtn() {
			WrapClasses.click(addCartBtn);
			return WrapClasses.verifyElementDisplayed(removeCartBtn);
		}
		
		

}
