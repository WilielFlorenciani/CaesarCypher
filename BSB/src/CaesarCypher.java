
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
		int j = alphabet.indexOf(clearText.charAt(i));
		if(clearText.charAt(i) == ' ') {
		textEncoded += clearText.charAt(i);
		}
		else if(j != -1) {
		textEncoded += shiftedAlphabet.charAt(alphabet.indexOf(clearText.charAt(i)));
		}
		else
		{
		textEncoded += clearText.charAt(i);
		}
		}
		return textEncoded;
	}
	public String textDecode(String textEncoded) {
	textEncoded = textEncoded.toUpperCase();
	String textDecoded = "";
	for(int i = 0; i < textEncoded.length();i++) {
		int f = shiftedAlphabet.indexOf(textEncoded.charAt(i));		//variable f was added as an intermediary due to the method indexOf() not being able to be used in a boolean 
		if(textEncoded.charAt(i) == ' ') {
			textDecoded += textEncoded.charAt(i);
			}
			else if(f != -1) {
	textDecoded += alphabet.charAt(shiftedAlphabet.indexOf(textEncoded.charAt(i)));
	}
	else {
		textDecoded += textEncoded.charAt(i);
	}
	}
	return textDecoded;
	}
}
