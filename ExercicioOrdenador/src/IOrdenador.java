import java.util.Collection;

public interface IOrdenador {
	
	/**
	 * Metodo que recebe uma cole��o de strings, e varre a mesma afim de encontrar o maior valor double.
	 * @param pColecao
	 */
	public void inserirColecao(Collection<String> pColecao);
	
	/**
	 * Metodo que recebe um valor como string, converte para double e verifica se � maior que o armazenado.
	 * Caso seja maior, insere o valor recebido na vari�vel comparada.
	 * @param pValor
	 */
	public void informarValor(String pValor);
	
	/**
	 * Metodo que deve retornar o menor valor armazenado.
	 * @return menorValor
	 */
	public double getMenorValor();
	
	/**
	 * Metodo que deve retornar o maior valor armazenado.
	 * @return maiorValor
	 */
	public double getMaiorValor();
	
	/**
	 * Metodo que deve retornar a m�dia dos valores inseridos na cole��o
	 * @return valorMedios
	 */
	public double getValorMedio();
	
	/**
	 * Metodo que deve retornar o valor do meio, ou a soma dos dois valores do meio da cole��o (Size impar/ Size par)
	 * @return valorMediano
	 */
	public double getValorMediano();
	
	
}
