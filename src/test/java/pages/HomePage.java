package pages;

import org.openqa.selenium.By;

import suporte.BasePage;
import suporte.DriverFactory;

public class HomePage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php");
	}
	
	public void escolherProduto() {
		clicarBotaoAction("//ul[1]/li[2]/div/div[1]/div/a[1]/img", "//ul[1]/li[2]/div/div[2]/div[2]/a[1]/span");
	}
	
	public void clicarBotaoCheckout() {
		clicarLink("Proceed to checkout");
	}
	
	public String validarProduto() {
		return obterValorCampo(By.xpath("//td [@class='cart_description']"));
	}
}
