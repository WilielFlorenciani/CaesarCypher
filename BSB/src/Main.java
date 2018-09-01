
public class Main {

	public static void main(String[] args) {
		CaesarCypher shift4 = new CaesarCypher(4);
		//double sqrt2 = Math.sqrt(2.0);
		String hi = "POTATOISGOODFORBODY";
		String hello = shift4.textEncode(hi);
		System.out.println(hello);
		//System.out.println("Here lies:"+ hello);
		System.out.println(shift4.textDecode(hello));
	}
}
