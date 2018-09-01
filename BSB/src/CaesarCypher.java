
public class CaesarCypher {

	private int key;
	
	private final static String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static String shiftedAlphabet;
	
	public CaesarCypher(int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0, this.key);
		String rightSubstring = alphabet.substring(this.key);
		shiftedAlphabet = rightSubstring + leftSubstring;
	}
	public String textEncode(String clearText) {
		clearText = clearText.toUpperCase();
		String textEncoded = "";
		for (int i = 0; i < clearText.length(); i++) {
		textEncoded += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
		}
		return textEncoded;
	}
	
	public String textDecode(String textEncoded) {
	textEncoded = textEncoded.toUpperCase();
	String textDecoded = "";
	for(int i = 0; i < textEncoded.length();i++) {
	textDecoded += alphabet.charAt(shiftedAlphabet.indexOf(textEncoded.charAt(i)));
	}
	return textDecoded;
	}
	
}
