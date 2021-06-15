package package1;

import java.util.Scanner;

public class Funkcija_Kalkulator_Zadatak_2_deo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati kalkulator. Korisnik unosi dva broja i operaciju koju zeli da //
		// odradi s njima,
		// a mi ispisujemo rezultat. Operacije su +,-,*,/,%

		Scanner s = new Scanner(System.in);

		System.out.println("Molim Vas unesite prvi broj");
		int a = s.nextInt();

		System.out.println("Molim Vas unesite drugi broj");
		int b = s.nextInt();

		System.out.println("Unesite operaciju");
		String operacija = s.next();

		// pozivam metodu kalkulator samo jednom
		System.out.println("Kad se nad brojevima " + a + " i " + b + " izvrsi operacija " + operacija
				+ " dobije se rezultat " + kalkulator(a, b, operacija));
	}

	public static int kalkulator(int prviBroj, int drugiBroj, String operator) {

		int rezultat;

		if (operator.equals("sabiranje")) {
			rezultat = prviBroj + drugiBroj;

		} else if (operator.equals("oduzimanje")) {
			rezultat = prviBroj - drugiBroj;

		} else if (operator.equals("delenje")) {
			rezultat = prviBroj / drugiBroj;

		} else if (operator.equals("ostatak pri delenju")) {
			rezultat = prviBroj % drugiBroj;

		} else {
			rezultat = prviBroj * drugiBroj;

		}
		return rezultat;
	}
}
