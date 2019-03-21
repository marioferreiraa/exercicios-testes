import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;
public class AnagramaTest {

	Anagrama anagrama;
	
	@Before
	public void iniciarObjetoAnagrama() {
		anagrama = new Anagrama();
	}
	
	@Test
	public void testarAnagramaValido() {
		//Arranjar
		String primeiraPalavra = "avo";
		String segundaPalavra = "voa";
		//Agir
		Boolean result = anagrama.isAnagrama(primeiraPalavra, segundaPalavra);
		//Afirmar
		assertEquals(true, result);
	}
	
	@Test
	public void testarMesmaQuantidadeDeLetras() {
		//Arranjar
		String primeiraPalavra = "amor";
		String segundaPalavra = "Roma";
		//Agir
		Boolean result = anagrama.isAnagrama(primeiraPalavra, segundaPalavra);
		//Afirmar
		assertEquals(true, result);
	}
	
	@Test
	public void testarAnagramaInvalidoComMesmaQuantidadeDeLetras() {
		//Arranjar
		String primeiraPalavra = "dia";
		String segundaPalavra = "ser";
		//Agir
		Boolean result = anagrama.isAnagrama(primeiraPalavra, segundaPalavra);
		//Afirmar
		assertEquals(false, result);
	}
	
	@Test
	public void testarAnagramaInvalidoComQuantidadeDeLetrasDiferentes() {
		//Arranjar
		String primeiraPalavra = "sapo";
		String segundaPalavra = "sap";
		//Agir
		Boolean result = anagrama.isAnagrama(primeiraPalavra, segundaPalavra);
		//Afirmar
		assertEquals(false, result);
	}
	
	@Test(expected = NullPointerException.class)
	public void testarAnagramaInserindoParametrosNulos() {
		//Arranjar
		String primeiraPalavra = null;
		String segundaPalavra = null;
		//Agir
		Boolean result = anagrama.isAnagrama(primeiraPalavra, segundaPalavra);
	}
	
	@Test
	public void testarAnagramaInserindoParametrosVazios() {
		//Arranjar
		String primeiraPalavra = "";
		String segundaPalavra = "";
		//Agir
		Boolean result = anagrama.isAnagrama(primeiraPalavra, segundaPalavra);
		//Afirmar
		assertEquals(false, result);
	}
	
}
