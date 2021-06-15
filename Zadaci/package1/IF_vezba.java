package package1;

public class IF_vezba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// IF SE KORISTI KADA ZELIMO DA NESTO ODRADIMO UZ NEKI USLOV
// SAMO USLOV KOJI JE ZADOVOLJEN CE BITI IZVRSEN

		int a = 23;

		if (a > 15) {
			System.out.println(a + " je vece od 15");
		} else if (a < 15) {
			System.out.println(a + " je manje od 15");
		} else if (a == 15) {
			System.out.println(a + " je jednako sa 15");
		} else {
			System.out.println("Ovo je opciono, ispisace se ako nijedan od prethodnih uslova nije zadovoljen.");
		}
	}

}

