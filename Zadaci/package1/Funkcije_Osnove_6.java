package package1;

public class Funkcije_Osnove_6 {

	public static void main(String[] args) {

//FUNKCIJA KOJA VRACA NESTO

		int suma = sabiranjeDvaBroja(5, 8);
		System.out.println("Ispis iz mejna, suma je " + suma);
	}

//pravim funkciju koja æe da vrati nesto
	public static int sabiranjeDvaBroja(int prviBroj, int drugiBroj) {
		int zbir = prviBroj + drugiBroj;
		return zbir;
	}
}
// Funkcija se zove sabirajeDvaBroja, ona prima dva argumenta,
// i vraca promenljivu tipa integer
// ovo sto mi vrati ova funkcija, cu pokupiti ovom promenljivom
// return je kljucna rec
// NAPOMENA - promenljive mozemo imenovati isto u razlicitim funkcijama, nece se buniti
