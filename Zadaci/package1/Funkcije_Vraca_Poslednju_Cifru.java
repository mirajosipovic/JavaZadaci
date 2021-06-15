package package1;

import java.util.Scanner;

public class Funkcije_Vraca_Poslednju_Cifru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisti funkciju koja za broj n, vraca poslednju cifru.
		// Primer: Ako se prosledi n=3290329, ona vrati 9

		// poslednji broj dobijamo kad integer podelimo sa 10, on nam ostavi onaj
		// ostatak, znaci treba nam onaj ostatak

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite bilo koji broj: ");
		int biloKojiBroj = s.nextInt();
		System.out.println("Broj koji ste uneli je " + biloKojiBroj + ".");

		int poslednjiBroj = vracanjePoslednjeCifre(biloKojiBroj);
		System.out.println("Poslednja cifra broja: " + biloKojiBroj + " je " + poslednjiBroj);
	}

	public static int vracanjePoslednjeCifre(int n) {
		int poslednjiBroj = n % 10;
		if (poslednjiBroj < 0) {
			poslednjiBroj *= -1;
		}
		return poslednjiBroj;
	}
}
