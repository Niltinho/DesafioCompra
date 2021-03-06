package suporte;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import pages.HomePage;
import utils.Generator;
import utils.Screnshot;

public class BaseTest {
	
	private HomePage homePage = new HomePage();
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void inicializar() {
		homePage.acessarTelaInicial();
	}
	
	@After
	public void finaliza() {
				
		String arquivoPrint = "target" + File.separator +"print" + File.separator + testName.getMethodName() + Generator.dataHoraParaArquivo() + ".png";
		Screnshot.tirar(DriverFactory.getDriver(), arquivoPrint);
		
		if(Propriedades.FECHAR_BROWSER) {
		DriverFactory.killDriver();
		}
		
	}

}
