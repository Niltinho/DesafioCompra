package pages;

import org.openqa.selenium.By;

import suporte.BasePage;

public class AddressPage extends BasePage {
	
	public void clicarBotaoCheckout() {
		clicarBotao(By.name("processAddress"));
	}

}
