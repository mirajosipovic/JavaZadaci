package package1;

public class Funkcije_Niz_Ispis_El_Niza_Deljivih_Sa3_Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//bonus zadatak, napravite funkciju koja prima niz, a vraca niz koji 
//sacinjavaju samo element prosledjenog niza koji su deljivi sa 3

		int[] niz = { 5, 7, 8, 10, 12, 23, 44, 34, 15, 28 };
		System.out.println("Elementi niza koji su deljivi sa 3 ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 3 == 0) {
				System.out.println(niz[i] + " ");
			}

		}
		int[] nizDva = { 5, 7, 9, 15, 33, 58, 18, 34 };
		System.out.println("Elementi niza dva koji su deljivi sa tri ");
		int[] vracenoIzFunkcije = vracanjeNizaBrojevaDeljivihSaTri(nizDva);
		for (int i = 0; i < vracenoIzFunkcije.length; i++) {
			System.out.println(vracenoIzFunkcije[i]);
		}

	}

	public static int[] vracanjeNizaBrojevaDeljivihSaTri(int[] primljenNiz) {
		int[] nizBrojevaDeljivihSaTri;
		int brojac = 0;
		for (int i = 0; i < primljenNiz.length; i++) {
			if (primljenNiz[i] % 3 == 0) {
				brojac += 1;
			}

		}
		nizBrojevaDeljivihSaTri = new int[brojac];
		int index = 0;
		for (int i = 0; i < primljenNiz.length; i++) {
			if (primljenNiz[i] % 3 == 0) {
				nizBrojevaDeljivihSaTri[index] = primljenNiz[i];
				index += 1;

			}
		}
		return nizBrojevaDeljivihSaTri;
	}
}
