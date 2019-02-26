import java.util.Collection;

public class Ordenador implements IOrdenador{
	
	double maiorValor = 0.0;

	@Override
	public void inserirColecao(Collection<String> pColecao) {
		
		try {
			for(String valor : pColecao) {
				double valorDouble = Double.parseDouble(valor);
				if(valorDouble > maiorValor){
					maiorValor = valorDouble;
				}
			}	
		}catch(Exception n) {
			n.printStackTrace();
		}
	}
	
	@Override
	public void informarValor(String pValor) {
		try {
			double valorConvertido = Double.parseDouble(pValor); 
			if(valorConvertido > maiorValor) {
				maiorValor = valorConvertido;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
