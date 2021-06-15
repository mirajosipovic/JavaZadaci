package package1;

import java.util.Scanner;

public class FOR_Petlja_Progr_Sabira_Broj_Unete_Sa_taTastature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Napisati program koji sabira N brojeva.  Korisnik unosi N i unosi brojeve.
//Primer: Unesite koliko brojeva zelimo da saberemo: 5
//Unesite 1. broj: 1
//Unesite 2. broj: 3
//Unesite 3. broj: 4
//Unesite 4. broj: 2
//Unesite 5. broj: 6
//Suma unetih brojeva je 16

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva zelite da sabirate:");
		int a = s.nextInt();
		int unetiBroj;

		int suma = 0;
		for (int i = 0; i < a; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj: ");
			unetiBroj = s.nextInt();
			suma += unetiBroj;
		}
		System.out.println("Suma unetih brojeva je. " + suma);
	}
}
