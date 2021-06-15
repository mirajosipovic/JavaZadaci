package package1;

public class Funkcija_Kalkulator_Zadatak_1_deo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Napisati kalkulator. Korisnik unosi dva broj i operaciju koju zeli da odradi s njima, 
//a mi ispisujemo rezultat. Operacije su +,-,*,/,%

//PRVI DEO ZADATKA - KALKULATOR

		int a = 2;
		int b = 3;
		System.out.println("Zbir brojeva " + a + " i " + b + " je " + sabiranje(a, b)); // ovde pozivam funkciju
																						// sabiranje
		System.out.println("Razlika brojeva " + a + " i " + b + " je " + oduzimanje(a, b)); // ovde pozivam funkciju
																							// odizumanje
	}

	// ako zelimo da saberemo dva broja moramo da napravimo funkciju
	// koja ima sabiranje. Ona ce primiti dva broja
	public static int sabiranje(int prviBroj, int drugiBroj) {
		int zbir = prviBroj + drugiBroj;
		return zbir;
	}

	public static int oduzimanje(int prviBroj, int drugiBroj) {
		int razlika = prviBroj - drugiBroj;
		return razlika;
	}
}

// Da li mozemo da napravimo jednu metodu koja bi odradila sve 4 operacije?
// Nastavak u sledecem delu zadatku.
