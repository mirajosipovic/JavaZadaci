package package1;

import java.util.Scanner;

public class Funkcije_Prebacivanje_Vrednosti_Jard_Metar_Inc_Drugo_Res {
	public static void main(String[] args) {
		// NAPISATI FUNKCIJU koja unetu vrednost distance prebacuje u metre
		// 1 Yard = 0.9144 metara
		// 1 Foot = 0.3048 metara
		// 1 Inch = 0.0254 metara
		// Korisnik unosi distancu i mernu jedinicu
		// Ispis u konzoli se vrsi iz main funkcije
		// Primer resenja:
		// Molim vas unesite distancu:
		// 150
		// Molim vas unesite mernu jedinicu (Yard, Foot ili Inch):
		// Yard
		// 150 Yard je isto sto i 137.16 metara

		System.out.println("Molimo Vas unesite distancu");
		Scanner s = new Scanner(System.in);
		double n = s.nextDouble();
		System.out.println("Molimo Vas unesite mernu jedinicu (Yard, Foot ili Inch)");
		String a = s.next();
		Konvertor(n, a);
	}

	public static void Konvertor(double n, String a) {
		double iznosUMetrima;
		switch (a) {
		case "Yard": {
			iznosUMetrima = n * 0.9144;
			System.out.println(n + " Yard je isto sto i " + iznosUMetrima + " metara");
			break;
		}
		case "Foot": {
			iznosUMetrima = n * 0.3048;
			System.out.println(n + " Foot je isto sto i " + iznosUMetrima + " metara");
			break;
		}
		case "Inch": {
			iznosUMetrima = n * 0.0254;
			System.out.println(n + " Inch je isto sto i " + iznosUMetrima + " metara");
			break;
		}

		default:
			System.out.println("Niste uneli dobru jedinicu");
		}
	}
}
