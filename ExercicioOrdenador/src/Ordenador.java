import java.util.Collection;

public class Ordenador implements IOrdenador{
	
	double maiorValor;
	double menorValor;

	@Override
	public void inserirColecao(Collection<String> pColecao) {
		try {
			for(String valor : pColecao) {
				double valorDouble = Double.parseDouble(valor);
				if(valorDouble > maiorValor){
					maiorValor = valorDouble;
				}
				if(menorValor == 0.0) {
					menorValor = valorDouble;
				}else if(valorDouble < menorValor) {
					menorValor = valorDouble;
				}
			}	
		}catch(NumberFormatException n) {
			System.err.println("InserirColecao - Excess�o de Erro na formata��o de N�mero capturada\n");
		}catch (NullPointerException e) {
			System.err.println("InserirColecao - Excess�o de dados nulos capturada\n");
		}
		
		
	}
	
	@Override
	public void informarValor (String pValor) {
		try {
			double valorConvertido = Double.parseDouble(pValor); 
			
			if(valorConvertido > maiorValor) {
				maiorValor = valorConvertido;
			}
			
			if(menorValor == 0.0) {
				menorValor = valorConvertido;
			}else if(valorConvertido < menorValor){
				menorValor = valorConvertido;
			}
		}catch(NumberFormatException n) {
			System.err.println("informarValor - Excess�o de Erro na formata��o de N�mero capturada\n");
		}catch (NullPointerException e) {
			System.err.println("informarValor - Excess�o de dados nulos capturada\n");
		}
	}
	
	@Override
	public double getMenorValor() {
		return this.menorValor;
	}

}
