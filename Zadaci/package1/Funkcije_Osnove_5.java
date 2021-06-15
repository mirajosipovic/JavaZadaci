package package1;

public class Funkcije_Osnove_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//FUNKCIJE - OSNOVE

		System.out.println("Trenutno sam u main metodi");

//pozivam funkciju
		ispisiNesto("Mira", 7);// dodajemo 2 parametra
	}

	public static void ispisiNesto() {
		System.out.println("Ispisujem iz funkcije (bez argumenta)");
	}

	public static void ispisiNesto(String argument1) {
		System.out.println("Ispisujem iz funkcije (sa string argumentom) " + argument1);
	}

	public static void ispisiNesto(int argument1) {
		System.out.println("Ispisujem iz funkcije (sa int argumentom) " + argument1);
	}

	public static void ispisiNesto(String argument1, int argument2) {
		System.out.println("Ispisujem iz funkcije (sa dva argumenta) prvi argument: " + argument1 + " drugi argument: "
				+ argument2); // telo funkcije
	}
}

//NA OSNOVU PARAMETARA KOJE SMO MU PROSLEDILI ON CE ZNATI KOJU FUNKCIJU DA POZOVE.
//NAPOMENA - AKO IMAMO VISE ARGUMENATA MI MORAMO NJIH U POZIVU DODATI //ONIM REDOSLEDOM KOJIM SU DEFINISANI
//U OVOM SLUCAJU, MORA PRVO STRING, A ZATIM INTEGER.
