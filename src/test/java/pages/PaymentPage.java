package pages;

import org.openqa.selenium.By;

import suporte.BasePage;

public class PaymentPage extends BasePage {
	
	public String validarValorTotal() {
		return obterValorCampo(By.xpath("//span [@id='total_price']"));
	}
	
	public void setMetodoPagamento() {
		clicarBotao(By.xpath("//a [@title='Pay by bank wire']"));
	}
	
	public void clicarBotaoConfirmarPagamento() {
		clicarBotao(By.xpath("//button [@class='button btn btn-default button-medium']"));
	}
	
	public String validarCompraFinalizada() {
		return obterValorCampo(By.xpath("//div [@class='box']"));
	}
	
	//p [@class='cheque-indent']/strong

}
