import java.text.Normalizer;

public class Palindromo implements IPalindromo{

	@Override
	public boolean isPalindromo(String palindromo) {
				
		StringBuffer sb = new StringBuffer(palindromo);
		String original = Normalizer.normalize(palindromo.replaceAll(" ",""), Normalizer.Form.NFD);
		String reverso = Normalizer.normalize(sb.reverse().toString().replaceAll(" ",""), Normalizer.Form.NFD);
		original = original.replaceAll("[^\\p{ASCII}]", "");
		reverso = reverso.replaceAll("[^\\p{ASCII}]", "");
		System.out.println("Original - " + palindromo + "\n Reverso - " + reverso);
		if(reverso.equalsIgnoreCase(original.replaceAll(" ",""))) {
			return true;
		}else {
			return false;
		}
	}
	
}
