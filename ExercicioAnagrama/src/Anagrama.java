import java.util.Arrays;

public class Anagrama implements IAnagrama {

	@Override
	public Boolean isAnagrama(String primeiraPalavra, String segundaPalavra) {
		
		String p1 = primeiraPalavra.toLowerCase();
		String p2 = segundaPalavra.toLowerCase();
		String[] p1Order = new String[p1.length()];
		String[] p2Order = new String[p2.length()];
		
		if(!p1.isEmpty() && !p2.isEmpty() &&  (p1.length() == p2.length())) {
		
			for(int i=0; i<p1.length(); i++) {
				p1Order[i] = p1.substring(i,i+1);
			}
			
			for(int i=0; i<p2.length(); i++) {
				p2Order[i] = p2.substring(i,i+1);
			}
			
			Arrays.sort(p1Order);
			Arrays.sort(p2Order);
			
			for(int i=0; i < p1Order.length; i++) {
				if(p1Order[i].equalsIgnoreCase(p2Order[i])) {
					continue;
				}else {
					return false;
				}
			}

			return true;
			
		}else {
			return false;
		}
	}

}
