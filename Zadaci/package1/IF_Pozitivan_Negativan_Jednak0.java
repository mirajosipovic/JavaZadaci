package package1;

import java.util.Scanner;

public class IF_Pozitivan_Negativan_Jednak0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// UNESITE BROJ SA TASTATURE I ISPISITE DA LI JE BROJ
		// POZITIVAN, NEGATIVAN ILI JEDNAK NULI.

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite bilo koji broj.");
		int broj = s.nextInt();

		if (broj > 0) {
			System.out.println("Broj je pozitivan.");
		} else if (broj < 0) {
			System.out.println("Broj je negativan.");
		} else {
			System.out.println("Broj je nula.");
		}
		s.close(); //zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
