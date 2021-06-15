package package1;

import java.util.Scanner;

public class IF_Paran_Neparan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UNESITE BROJ SA TASTATURE I ISPISITE DA LI JE BROJ PARAN ILI NEPARAN.

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite bilo koji ceo broj:");
		int broj = s.nextInt();

		if ((broj % 2) == 0) {
			System.out.println("Broj je paran.");
		} else if ((broj % 2) != 0) {
			System.out.println("Broj je neparan.");
		}
		s.close(); //zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
