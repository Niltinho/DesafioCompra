package pages;

import org.openqa.selenium.By;

import suporte.BasePage;

public class ShippingPage extends BasePage {
	
	public void setAceitarTermos() {
		clicarBotao(By.id("cgv"));
	}
	
	public void clicarBotaoCheckout() {
		clicarBotao(By.name("processCarrier"));
	}

}
