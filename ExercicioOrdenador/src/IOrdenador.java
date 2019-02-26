import java.util.Collection;

public interface IOrdenador {
	
	/**
	 * Metodo que recebe uma coleção de strings, e varre a mesma afim de encontrar o maior valor double.
	 * @param pColecao
	 */
	public void inserirColecao(Collection<String> pColecao);
	
	/**
	 * Metodo que recebe um valor como string, converte para double e verifica se é maior que o armazenado.
	 * Caso seja maior, insere o valor recebido na variável comparada.
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
	 * 
	 * @return valorMedios
	 */
	public double getValorMedio();
	
	
}
