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
	public void testarInserindoValoresNaoNumericos() {
		//Arranjar
		Collection<String> colecao = new ArrayList<String>();
		colecao.add("a");
		colecao.add("b");
		colecao.add("c");
		
		//Agir
		o.inserirColecao(colecao);

	}

}
