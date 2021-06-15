package package1;

public class Funkcije_Niz_Petlja_Sabira_El_Niza_Dok_Je_Zb_Manji_Od_Resenje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] niz = { 1, 8, -5, 1, 1, 194, 8, 1, 1, 2, 3, 2, 5, 7, 5, 500 };
		int zbir = 0;

		for (int i = 0; i < niz.length; i++) {
			if ((zbir + niz[i]) < 200) {
				zbir += niz[i];
				int ostatak = 200 - zbir;

				System.out.println(
						"Ako dodamo " + (i + 1) + ". element niza zbir je: " + zbir + ", a do 200 fali: " + ostatak);
			}

			else if ((zbir + niz[i]) > 200) {
				int pogresanZbir = zbir += niz[i];

				System.out.println("Ako dodamo " + (i + 1) + ". element niza: " + niz[i] + " zbir æe biti "
						+ pogresanZbir + " a prešli smo 200 za " + (pogresanZbir - 200));
				break;
			} else {
				System.out.println("Trenutni zbir je taèno 200.");
				zbir += niz[i];
				break;
			}
		}
		if (zbir < 200) {
			System.out.println("Zbir elemenata niza je manji od 200.");
		}
	}
}
