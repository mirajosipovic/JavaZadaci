package package1;

import java.util.Scanner;

public class Funkcije_Prebacivanje_Vrednosti_Jard_Metar_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NAPISATI FUNKCIJU koja unetu vrednost distance prebacuje u metre
		// 1 Yard = 0.9144 metara
		// 1 Foot = 0.3048 metara
		// 1 Inch = 0.0254 metara
		// Korisnik unosi distancu i mernu jedinicu
		// Ispis u konzoli se vrsi iz main funkcije // Primer resenja:
		// Molim vas unesite distancu:
		// 150
		// Molim vas unesite mernu jedinicu (Yard, Foot ili Inch):
		// Yard
		// 150 Yard je isto sto i 137.16 metara

		Scanner scanner = new Scanner(System.in);
		String unosMerneJedinice;
		double unosBroja;
		System.out.println("Unesite mernu jedinicu (yard, foot ili inch): ");
		unosMerneJedinice = scanner.nextLine();
		System.out.println("Unesite distancu: ");
		unosBroja = scanner.nextInt();
		double preracunataDistanca = preracunavanjeDistance(unosMerneJedinice, unosBroja);
		System.out.println(unosBroja + " " + unosMerneJedinice + " je " + preracunataDistanca + " metara.");
	}

	public static double preracunavanjeDistance(String mernaJedinica, double unos) {
		double rezultat = 0;
		if (mernaJedinica.equals("yard")) {
			rezultat = unos * 0.9144;
		} else if (mernaJedinica.equals("foot")) {
			rezultat = unos * 0.3048;
		} else if (mernaJedinica.equals("inch")) {
			rezultat = unos * 0.0254;
		}
		return rezultat;
	}
}
