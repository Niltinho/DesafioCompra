package tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pages.AddressPage;
import pages.HomePage;
import pages.PaymentPage;
import pages.ShippingPage;
import pages.SigninPage;
import pages.SummaryPage;
import suporte.BaseTest;
import utils.Generator;

public class CompraTest extends BaseTest {
	
	private HomePage homePage = new HomePage();
	private SummaryPage summaryPage = new SummaryPage();
	private SigninPage siginPage = new SigninPage();
	private AddressPage addressPage = new AddressPage();
	private ShippingPage shippingPage = new ShippingPage();
	private PaymentPage paymentPage = new PaymentPage();
	
	@Test
	public void testRealizarCompra() {
		
		// Escolhe o produto ///
		homePage.escolherProduto();
		homePage.clicarBotaoCheckout();
		
		// Valida o produto selecionado //
		assertEquals("Blouse\nSKU : demo_2\nColor : Black, Size : S", homePage.validarProduto());
		
		// Cadastra o Cliente //
		summaryPage.clicarBotaoCheckout();
		siginPage.setEmail("niltinho"+Generator.numeroRandomico().nextInt(99)+"@teste.com");
		siginPage.clicarBotaoCriarConta();
		
		siginPage.setSexoMasculino();
		siginPage.setPrimeiroNome("Nilton");
		siginPage.setUltimoNome("Correia");
		siginPage.setDiaAniversario("18");
		siginPage.setMesAniversario("April ");
		siginPage.setAnoAniversario("1990");
		siginPage.setEndereco("Rua Doutor Bento Vidal");
		siginPage.setCidade("Osasco");
		siginPage.setEstado("California");
		siginPage.setCep("00000");
		siginPage.setPais("United States");
		siginPage.setCelular("551199999-9999");
		siginPage.setEmailAlternativo("niltinho"+Generator.numeroRandomico().nextInt(99)+"@teste2.com");
		siginPage.setSenha("1312" + Generator.numeroRandomico().nextInt(100));
		
		// Valida o endereço do cliente //
		assertTrue(siginPage.validarEndereco().contains("Rua Doutor Bento Vidal\nOsasco, California 00000\nUnited States"));
		
		// Prossegue para o frete //
		addressPage.clicarBotaoCheckout();
		
		// Aceita os termos de contrato e prossegue para o pagamento //
		shippingPage.setAceitarTermos();
		shippingPage.clicarBotaoCheckout();
		
		// Valida o valor total do produto //
		assertEquals("$29.00", paymentPage.validarValorTotal());
		
		// Seleciona o método e confirma o pagamento //
		paymentPage.setMetodoPagamento();
		paymentPage.clicarBotaoConfirmarPagamento();
		
		// Valida a compra finalizada //
		assertTrue(paymentPage.validarCompraFinalizada().contains("Your order on My Store is complete."));
	}
}
