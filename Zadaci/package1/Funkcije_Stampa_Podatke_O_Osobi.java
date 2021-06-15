package package1;

public class Funkcije_Stampa_Podatke_O_Osobi {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		// napisati funkciju koja stampa podatke o osobi.
		// salju joj se ime, prezime i br godina, a funkcija to odstampa
		podaciOsobe("Mira", "Josipovic", 49);
	}

	public static void podaciOsobe(String ime, String prezime, int godine) {
		System.out.println("Ime: " + ime + "\nPrezime: " + prezime + "\nGodine: " + godine);
	}
}
