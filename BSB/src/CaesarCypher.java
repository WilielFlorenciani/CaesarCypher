
public class CaesarCypher {

	private int key;
	
	private final static String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static String shiftedAlphabet;
	
	public CaesarCypher(int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0, this.key);
		String rightSubstring = alphabet.substring(this.key);
		shiftedAlphabet = rightSubstring + leftSubstring;
	}
	
	
}
