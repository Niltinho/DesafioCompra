package suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import suporte.DriverFactory;
import tests.CompraTest;

@RunWith(Suite.class)
@SuiteClasses({
	CompraTest.class
})
public class SuiteTeste {
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}

}
