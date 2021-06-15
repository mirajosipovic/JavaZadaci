
package package1;

import java.util.Scanner;

public class FOR_Petlja_Unos_N_Brojeva_SA_Tast_Ispis_Poz {

//Napisati program koji ucitava N brojeva od korisnika i ispisuje koliko je pozitivnih brojeva uneo.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete: ");
		
		int ukupanBroj = s.nextInt();
		int brojacPozitivnih = 0;
		int broj;

		for (int i = 1; i <=ukupanBroj; i++) {
			System.out.println("Unesite " + i + " broj: ");
			broj = s.nextInt();
			
			if (broj > 0) {
				brojacPozitivnih++;
			
			}
		}
		System.out.println("Uneli ste " + brojacPozitivnih + " pozitivna broja.");
	}
}
