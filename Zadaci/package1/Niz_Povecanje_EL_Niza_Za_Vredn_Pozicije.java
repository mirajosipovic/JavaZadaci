package package1;

public class Niz_Povecanje_EL_Niza_Za_Vredn_Pozicije {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji svaki element niza
		// povecava za vrednost pozicije na kojoj se
		// element nalazi. Vrednosti i broj elemenata niza su proizvoljni
		// Primer izvrsenja:
		// niz = {1, 5, 7, -1, 4}
		// Nakon izvrsenja programa:
		// niz = {1, 6, 9, 2, 8}
		// Kako je ovaj niz dobijen?
		// niz = {1+0, 5+1, 6+2, -1+3, 4+4}

		int[] nizBrojeva = { 1, 5, 7, -1, 4 };
		System.out.print("Niz pre promene: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			System.out.print(nizBrojeva[i] + ", ");
		}

		System.out.println();
		System.out.print("Niz nakon promene: ");
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = nizBrojeva[i] + i;
			System.out.print(nizBrojeva[i] + ", ");
		}
	}
}
