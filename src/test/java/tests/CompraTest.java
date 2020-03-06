package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pages.HomePage;
import suporte.BaseTest;

public class CompraTest extends BaseTest {
	
	private HomePage homePage = new HomePage();
	
	@Test
	public void testRealizarCompra() {
		
		homePage.escolherProduto();
		homePage.clicarBotaoCheckout();
		
		assertEquals("Blouse\nSKU : demo_2\nColor : Black, Size : S", homePage.validarProduto());
	}
	
	
}
