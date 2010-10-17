
public class ProgFuerJunitTest implements IMdpJunitDemo {

	public ProgFuerJunitTest(){
		
	}
	public String capitalize(String s) {
		return s.toUpperCase();
	}

	@Override
	public boolean isEmpty(String s) {
		if (s=="" || s==null){ return true;}
		return false;
	}

	@Override
	public String join(String[] strings) {
		// hängt alle Strings des Arrays zusammen
		String out ="";
		for (int i=0;i<strings.length;i++) {
	         out = out + strings[i];
	         }
		return out;
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		// dreht einen Sring um + NullPointerException
		String out ="";
		if (s== null) {
			throw new NullPointerException();
		} else {
			for (int i=0; i < s.length();i++){
				out =out+ s.charAt(s.length()-i-1);
			}
		}
		System.out.println(out);
		return out;
	}
	
}
