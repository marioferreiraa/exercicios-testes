import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class TestePalindromo {
	
	Palindromo palindromo;
	
	@Before
	public void initPalindromo() {
		palindromo = new Palindromo();
	}
	
	@Test
	public void testarPalindromoValidoComPalavra() {
		//Arranjar
		String palavra = "arara";
		//Agir
		Boolean res = palindromo.isPalindromo(palavra);
		//Afirmar
		assertEquals(true, res);
	}
	
	@Test
	public void testarPalindromoValidoComLetraMaiusculaEMinuscula() {
		//Arranjar
		String palavra = "Ana";
		//Agir
		Boolean res = palindromo.isPalindromo(palavra);
		//Afirmar
		assertEquals(true, res);
	}
	
	@Test
	public void testarPalindromoInvalidoComPalavra() {
		//Arranjar
		String palavra = "abobora";
		//Agir
		Boolean res = palindromo.isPalindromo(palavra);
		//Afirmar
		assertEquals(false, res);
	}
	
	@Test
	public void testarPalindromoValidoComFrases() {
		//Arranjar
		String frase = "Socorram me subi no onibus em marrocos";
		//Agir
		Boolean res = palindromo.isPalindromo(frase);
		//Afirmar
		assertEquals(true, res);
	}
	
	@Test
	public void testarPalindromoInvalidoComFrases() {
		//Arranjar
		String frase = "Eu amo testes";
		//Agir
		Boolean res = palindromo.isPalindromo(frase);
		//Afirmar
		assertEquals(false, res);
	}
	
	@Test(expected = NullPointerException.class)
	public void testarPalindromoInserindoParametroNulo() {
		//Arranjar
		String frase = null;
		//Agir
		Boolean res = palindromo.isPalindromo(frase);
	}
	
	@Test
	public void testarPalindromoInserindoPalavraComAcento() {
		//Arranjar
		String palavra = "anã";
		//Agir
		Boolean res = palindromo.isPalindromo(palavra);
		//Afirmar
		assertEquals(true, res);
	}
	
	
}
