import static org.junit.Assert.*;

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
	
	@BeforeClass
	public static void inserirMassaDeTestes() {
		n1 = "3";
		n2 = "4";
		n3 = "1000";
		n4 = "2000";
	}
	
	@Before
	public void instanciarCalculadora() {
		c = new Calculadora();
	}
	
	@Ignore
	public void testarSomaDouble() {
		String n1 = "3.0";
		String n2 = "4.2";
		double result = 7.2;
		
		assertSame(result, c.somar(n1, n2));
	}
	
	@Test(timeout=1000)
	public void testarDivisao() {
		double result = 0.75;
		assertEquals(result, c.dividir(n1, n2), 0.1);
	}
	
	@Test(timeout=1000)
	public void testarSoma() {
		int result = 7;
		assertEquals(result, c.somar(n1, n2));
	
		int result2 = 3000;	
		assertEquals(result2, c.somar(n3, n4));
	}
	
	@Test(timeout=1000)
	public void testarRaiz() {
		double result = 5;
		assertEquals(result, c.raizQuadrada("25"), 0.1);
	}
	
	@Test
	public void testarUmMaisUm(){
		//Arranjar
		String num1 = "1";
		String num2 = "1";
		
		//Agir
		int soma = c.somar(num1, num2);
		
		//Afirmar
		assertEquals(2, soma);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testarInserindoDadosNaoNumericos(){
		//Arranjar
		String num1 = "a";
		String num2 = "b";
		
		//Agir
		int soma = c.somar(num1, num2);
	}
	
	@Test
	public void testarSomaDeNumerosNegativos(){
		//Arranjar
		String num1 = "-2";
		String num2 = "-2";
		
		//Agir
		int soma = c.somar(num1, num2);
		
		//Afirmar
		assertEquals(-4, soma);
	}
	
	@Test
	public void testarDivisaoDezPorCinco(){
		//Arranjar
		String num1 = "10";
		String num2 = "5";
		
		//Agir
		double div = c.dividir(num1, num2);
		
		//Afirmar
		assertEquals(2,div,0.1);
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
	
}
