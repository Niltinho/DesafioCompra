package pages;

import suporte.BasePage;

public class SummaryPage extends BasePage {
	
	public void clicarBotaoCheckout() {
		clicarLink("Proceed to checkout");
	}
	
}
