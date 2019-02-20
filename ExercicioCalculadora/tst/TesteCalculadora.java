import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TesteCalculadora {
	
	Calculadora c;
	static String n1;
	static String n2;
	static String n3;
	static String n4;
	
	@Before
	public void instanciarCalculadora() {
		c = new Calculadora();
	}
	
	@BeforeClass
	public static void inserirMassaDeTestes() {
		n1 = "3";
		n2 = "4";
		n3 = "1000";
		n4 = "2000";
	}
	
	@After
	public void destruirCalculadora() {
		c = null;
	}
	
	@AfterClass
	public static void destruirMassaDeTestes() {
		n1 = "";
		n2 = "";
		n3 = "";
		n4 = "";
	}
	
	@Ignore
	public void testarSomaDouble() {
		String n1 = "3.0";
		String n2 = "4.2";
		double result = 7.2;
		
		assertEquals(result, c.somar(n1, n2));
	}
	
	@Test(timeout=1000)
	public void testarSoma() {

		int result = 7;
		
		assertEquals(result, c.somar(n1, n2));
		
		int result2 = 3000;
		
		assertEquals(result2, c.somar(n3, n4));
	}
	
	@Test(timeout=1000)
	public void testarDivisao() {
		double result = 0.75;
		
		assertEquals(result, c.dividir(n1, n2));
	}
	
	@Test(timeout=1000)
	public void testarRaiz() {
		double result = 9;
		
		assertEquals(result, c.raizQuadrada(n1));
	}
	
}
