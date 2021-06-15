package package1;

public class Funkcije_Osnove_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//FUNKCIJE - OSNOVE

		System.out.println("Trenutno sam u main metodi");
		ispisiNesto("Milovan");// dodali smo parametar
	}

// OVA FUNKCIJA JE BEZ ARGUMENATA
	public static void ispisiNesto() // ovo je zaglavlje funkcije
	{
		System.out.println("Ispisujem iz funkcije"); // telo funkcije i tu definisemo sta ce ova funkcija uraditi
	}

// ZATO CEMO JE KOPIRATI I DODATI JOJ JEDAN ARGUMENT
	public static void ispisiNesto(String argument1) // dodali smo argument
	{
		System.out.println("Ispisujem iz funkcije " + argument1);
	}
}
