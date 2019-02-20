
public class Calculadora implements ICalculadora{

	@Override
	public int somar(String n1, String n2) {
		return Integer.parseInt(n1) + Integer.parseInt(n2);
	}

	@Override
	public double dividir(String n1, String n2) {
		return Double.parseDouble(n1) / Double.parseDouble(n2);
	}

	@Override
	public double raizQuadrada(String n1) {
		return Double.parseDouble(n1) * Double.parseDouble(n1);
	}

}
