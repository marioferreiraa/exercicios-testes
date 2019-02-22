import java.util.Collection;

public class Ordenador implements IOrdenador{

	@Override
	public void inserirColecao(Collection<String> pColecao) {
		
		double maiorValor = 0.0;
		
		for(String valor : pColecao) {
			double valorDouble = Double.parseDouble(valor);
			if(valorDouble > maiorValor){
				maiorValor = valorDouble;
			}
		}
		
	}

}
