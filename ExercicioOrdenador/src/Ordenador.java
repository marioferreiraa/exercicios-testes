import java.util.Collection;

public class Ordenador implements IOrdenador{
	
	double maiorValor;
	double menorValor;
	double valorMedio;

	@Override
	public void inserirColecao(Collection<String> pColecao) {
		double valorAcumulado = 0;
		try {
			for(String valor : pColecao) {
				
				double valorDouble = Double.parseDouble(valor);
				
				menorValor = (menorValor == 0.0) ? valorDouble : menorValor;
				
				if(valorDouble > maiorValor){
					maiorValor = valorDouble;
				}
				
				if(valorDouble < menorValor) {
					menorValor = valorDouble;
				}
				valorAcumulado += valorDouble;
			}	
			valorMedio = valorAcumulado / pColecao.size();
		}catch(NumberFormatException n) {
			System.err.println("InserirColecao - Excessão de Erro na formatação de Número capturada\n");
		}catch (NullPointerException e) {
			System.err.println("InserirColecao - Excessão de dados nulos capturada\n");
		}
		
		
	}
	
	@Override
	public void informarValor (String pValor) {
		try {
			
			double valorConvertido = Double.parseDouble(pValor); 
			
			menorValor = (menorValor == 0.0) ? valorConvertido : menorValor;
			
			if(valorConvertido > maiorValor) {
				maiorValor = valorConvertido;
			}
			
			if(valorConvertido < menorValor){
				menorValor = valorConvertido;
			}
			
		}catch(NumberFormatException n) {
			System.err.println("informarValor - Excessão de Erro na formatação de Número capturada\n");
		}catch (NullPointerException e) {
			System.err.println("informarValor - Excessão de dados nulos capturada\n");
		}
	}
	
	@Override
	public double getMenorValor() {
		return this.menorValor;
	}
	
	@Override
	public double getMaiorValor() {
		return this.maiorValor;
	}
	
	@Override
	public double getValorMedio() {
		return this.valorMedio;
	}

}
