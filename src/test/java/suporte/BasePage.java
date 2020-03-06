package suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
/////// Campo ///////////////
	
	public void escreverCampo(By by, String texto) {
		DriverFactory.getDriver().findElement(by).sendKeys(texto, Keys.ENTER);
	}

	public String obterValorCampo(String id_campo) {
    	WebElement valor = DriverFactory.getDriver().findElement(By.id(id_campo));
    	return valor.getText();
    }
	
	public void escreverCampo(String id_campo, String texto) {
		DriverFactory.getDriver().findElement(By.id(id_campo)).clear();
		DriverFactory.getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	public String obterValorCampo(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	//////////// Botão ////////////
	public void clicarBotao(By by){
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarBotaoAction(String elem_visivel, String elem_nao_visivel){
		WebElement elemVisivel = DriverFactory.getDriver().findElement(By.xpath(elem_visivel));
	    Actions build = new Actions(DriverFactory.getDriver());
	    build.moveToElement(elemVisivel).build().perform();
	    WebElement elemNaoVisivel = DriverFactory.getDriver().findElement(By.xpath(elem_nao_visivel));
	    elemNaoVisivel.click();
	}
	
	//// Link
	public void clicarLink(String link) {
		DriverFactory.getDriver().findElement(By.linkText(link)).click();
	}
	
	/////// Interagir Janela //////////////
	public void descerJanela() {
		JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
		jse.executeScript("scrollBy(0,500)", "");
	}
	
	//////// Combo //////////////
	public void selecionarComboValue(String id, String valor) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByValue(valor);
	}
	
	public void selecionarComboVisible(String id, String valor) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
}
