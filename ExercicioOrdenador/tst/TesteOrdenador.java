import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.*;
public class TesteOrdenador {
	
	Ordenador o;
	
	@Before
	public void Ordenador() {
		o = new Ordenador();
	};
	
	@Test
	public void testarInserirColecaoComNumerosInteiros() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("1");
		colecao.add("2");
		colecao.add("3");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(3, o.maiorValor);
	}
	
	@Test
	public void testarInserirColecaoComNumerosReais() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10.12");
		colecao.add("20.2");
		colecao.add("30.1");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(30.1, o.maiorValor);
	}
	
	@Test(expected = NullPointerException.class)
	public void testarInserindoCollectionNulo() {
		//Agir
		o.inserirColecao(null);
	}
	
	@Test
	public void testarInserindoValoresNaoNumericos() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("a");
		colecao.add("b");
		colecao.add("c");
		
		//Agir
		o.inserirColecao(colecao);
	}
	
	@Test
	public void testarinformarValorMaior() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("20");
		colecao.add("30");
		colecao.add("40");
		String valor = "100";
		
		//Agir
		o.inserirColecao(colecao);
		o.informarValor(valor);
		
		//Afirmar
		assertEquals(100, o.maiorValor);
	}
	
	@Test
	public void testarinformarValorMenor() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("70");
		colecao.add("80");
		colecao.add("90.4");
		String valor = "10";
		
		//Agir
		o.inserirColecao(colecao);
		o.informarValor(valor);
		
		//Afirmar
		assertNotEquals(10,o.maiorValor);
	}
	
	@Test
	public void testarinformarValorComDadoInvalido() {
		//Arranjar
		String valor = "a";
		
		//Agir
		o.informarValor(valor);
	}
	
	@Test
	public void testarinformarValorComParametroVazio() {		
		//Agir
		o.informarValor(null);
	}
	
	@Test
	public void testarGetMenorValorInserindoColecao() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("20");
		colecao.add("30");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(10, o.getMenorValor());
	}
	
	@Test
	public void testarGetMenorValorInserindoColecaoEValorAleatório() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("40");
		colecao.add("19");
		colecao.add("20");
		String valAleatorio = "1.7";
		
		//Agir
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		//Afirmar
		assertEquals(1.7, o.getMenorValor());
		
	}
	
	@Test
	public void testarGetMenorValorEnviandoParametrosIguais() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("10");
		colecao.add("10");
		String valAleatorio = "10";
		
		//Agir
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		//Afirmar
		assertEquals(10, o.getMenorValor());
	}
	
	@Test
	public void testarGetMenorValorInserindoValorAleatorio() {
		//Arranjar
		String valAleatorio = "1000";
		String valAleatorio2 = "1001";
		String valAleatorio3 = "1002";
		String valAleatorio4 = "4";
		
		//Agir
		o.informarValor(valAleatorio);
		o.informarValor(valAleatorio2);
		o.informarValor(valAleatorio3);
		o.informarValor(valAleatorio4);
		
		//Afirmar
		assertEquals(4, o.getMenorValor());
	}
	
	@Test
	public void testarGetMenorValorInserindoDadosInvalidos() {
		//Arranjar
		String valAleatorio = "Abobora";
		
		//Agir
		o.informarValor(valAleatorio);
		
		//Afirmar
		assertEquals(0.0, o.getMenorValor());
	}
	
	@Test
	public void testarGetMenorValorInserindoDadosNulos() {
		//Arranjar
		String valAleatorio = null;
		
		//Agir
		o.informarValor(valAleatorio);
		
		//Afirmar
		assertEquals(0.0, o.getMenorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoColecao() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("20");
		colecao.add("30");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(30, o.getMaiorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoColecaoEValorAleatório() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("40");
		colecao.add("19");
		colecao.add("20");
		String valAleatorio = "1.7";
		
		//Agir
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		//Afirmar
		assertEquals(40, o.getMaiorValor());
		
	}
	
	@Test
	public void testarGetMaiorValorEnviandoParametrosIguais() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("10");
		colecao.add("10");
		colecao.add("10");
		String valAleatorio = "10";
		
		//Agir
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		//Afirmar
		assertEquals(10, o.getMaiorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoValorAleatorio() {
		//Arranjar
		String valAleatorio = "1000";
		String valAleatorio2 = "1001";
		String valAleatorio3 = "1002";
		String valAleatorio4 = "4";
		
		//Agir
		o.informarValor(valAleatorio);
		o.informarValor(valAleatorio2);
		o.informarValor(valAleatorio3);
		o.informarValor(valAleatorio4);
		
		//Afirmar
		assertEquals(1002, o.getMaiorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoDadosInvalidos() {
		//Arranjar
		String valAleatorio = "Abobora";
		
		//Agir
		o.informarValor(valAleatorio);
		
		//Afirmar
		assertEquals(0.0, o.getMaiorValor());
	}
	
	@Test
	public void testarGetMaiorValorInserindoDadosNulos() {
		//Arranjar
		String valAleatorio = null;
		
		//Agir
		o.informarValor(valAleatorio);
		
		//Afirmar
		assertEquals(0.0, o.getMaiorValor());
	}
	
	@Test
	public void testarGetValorMedioInserindoDadosInteiros() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
			colecao.add("2");
			colecao.add("4");
			
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(3, o.getValorMedio());
			
	}
	
	@Test
	public void testarGetValorMedioInserindoDadosReais() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("3.5");
		colecao.add("1.5");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(2.5, o.getValorMedio());
	}
	
	@Test 
	public void testarGetValorMedioInserindoDadosInvalidos() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("a");
		colecao.add("b");
		
		//Agir
		o.inserirColecao(colecao);
	}
	
	@Test(expected = NullPointerException.class)
	public void testarGetValorMedioInserindoDadosNulos() {
		//Arranjar
		Collection<String> colecao = null;
		
		//Agir
		o.inserirColecao(colecao);
	}
	
	@Test
	public void testarGetValorMedioComNumeroAleatorio() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("8");
		String valAleatorio = "2";
		
		//Agir
		o.inserirColecao(colecao);
		o.informarValor(valAleatorio);
		
		//Afirmar
		assertNotEquals(4, o.getValorMedio());
	}
	
	@Test
	public void testarGetValorMedianoInserindoCollectionComSizeImpar() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("3");
		colecao.add("4");
		colecao.add("5");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(4, o.getValorMediano());
	}
	
	@Ignore
	public void testarGetValorMedianoInserindoMaisParametrosSizeImpar() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("1");
		colecao.add("2");
		colecao.add("3");
		colecao.add("4");
		colecao.add("5");
		colecao.add("6");
		colecao.add("7");
		colecao.add("8");
		colecao.add("9");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(5, o.getValorMediano());
	}
	
	@Test
	public void testarGetValorMedianoInserindoVariosDadosSizePar() {
		//Arrumar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("4");
		colecao.add("6");
		colecao.add("8");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(5, o.getValorMediano());
	}
	
	@Test
	public void testarGetValorMedianoInserindoCollectionComSizePar() {
		//Arrumar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("4");
		colecao.add("6");
		colecao.add("35");
		colecao.add("12");
		colecao.add("7");
		colecao.add("9.1");
		colecao.add("26");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(23.5, o.getValorMediano());
	}
	
	@Test
	public void testarGetValorMedianoInserindoValoresInvalidos() {
		//Arrumar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("4");
		colecao.add("c");
		colecao.add("35");
		
		//Agir
		o.inserirColecao(colecao);
	}
	
	@Test
	public void testarGetValorMedianoInserindoValoresReais() {
		//Arrumar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("2");
		colecao.add("5.7");
		colecao.add("14.4");
		colecao.add("35");
		
		//Agir
		o.inserirColecao(colecao);
		
		//Afirmar
		assertEquals(10.05, o.getValorMediano());
	}
	
	@Test(expected = NullPointerException.class)
	public void testarGetValorMedianoInserindoValoresNulos() {
		//Arrumar
		Collection<String> colecao = null;
		
		//Agir
		o.inserirColecao(colecao);
	}
	
	@After
	public void destruirObjetoPersistido() {
		o = null;
	}

}
