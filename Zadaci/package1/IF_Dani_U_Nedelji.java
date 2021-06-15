package package1;

import java.util.Scanner;

public class IF_Dani_U_Nedelji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// POMOCU SWITCH-A SE IZVRSAVA JEDAN OD VISE BLOKOVA KODA

		// ZA SVAKI DAN U NEDELJI, ZA SVAKI REDNI BROJ KOJI UNESEMO
		// ZELIMO DA IMAMO RAZLICITO PONASANJE

		Scanner s = new Scanner(System.in);
		System.out.println("UNesite redni broj dana u nedelji:");

		int redniBrDanaUNedelji = s.nextInt();

		if (redniBrDanaUNedelji == 1) {
			System.out.println("Ponedeljak je");

		} else if (redniBrDanaUNedelji == 2) {
			System.out.println("Utorak je");

		} else if (redniBrDanaUNedelji == 3) {
			System.out.println("Sreda je.");

		} else if (redniBrDanaUNedelji == 4) {
			System.out.println("Cetvrtak je");

		} else if (redniBrDanaUNedelji == 5) {
			System.out.println("Petak je.");

		} else if (redniBrDanaUNedelji == 6) {
			System.out.println("Subota je.");

		} else if (redniBrDanaUNedelji == 7) {
			System.out.println("Petak je.");

		} else {
			System.out.println("Redni broj dana u nedelji nije validan.");
		}
		s.close(); //zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
