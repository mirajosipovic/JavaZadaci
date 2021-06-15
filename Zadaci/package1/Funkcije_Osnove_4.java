package package1;

public class Funkcije_Osnove_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//FUNKCIJE - OSNOVE 

		System.out.println("Trenutno sam u main metodi");
		// pozivam funkciju
		ispisiNesto(7);// dodali smo parametar
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
}
//FUNKCIJU DEFINISE IME FUNKCIJE + BROJ ARGUMENATA + TIP ARGUMENTA.
//DOZVOLICE DA IMAMO DVE FUNKCIJE SA ISTIM NAZIVOM I JEDNIM ARGUMENTOM AKO SU RAZLICITOG TIPA
