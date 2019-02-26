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
	
	@Test
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

}
