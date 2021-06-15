package package1;

public class Funkcije_Nizovi_Vraca_Niz_Osnove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prviBroj = 7;
		int drugiBroj = 8;
		int[] nizVracenIzFunkcije = vratiNamNiz(1, drugiBroj, prviBroj);
		System.out.println("Elementi niza: ");

		for (int i = 0; i < nizVracenIzFunkcije.length; i++) {

			System.out.print(nizVracenIzFunkcije[i] + ", ");
		}
	}

	public static int[] vratiNamNiz(int a, int b, int c) {

		// int[] povratniNiz = {a, b, c};
		int[] povratniNiz = new int[3];
		povratniNiz[0] = a;
		povratniNiz[1] = b;
		povratniNiz[2] = c;
		return povratniNiz;
	}
}
