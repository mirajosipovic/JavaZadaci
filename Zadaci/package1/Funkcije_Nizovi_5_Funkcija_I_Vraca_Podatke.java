package package1;

public class Funkcije_Nizovi_5_Funkcija_I_Vraca_Podatke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// definisati niz 5 imena
		// definisati niz 5 prezimena
		// definisati niz 5 fakulteta
		// definisati niz 5 proseka
		// definisati niz 5 godina
		// napraviti funkciju koja stampa
		// Ime i Prezime je zavrsio/la fakulte ima fakulteta
		// sa prosecnom pocenom prosecna ocena a rodjen je godina
		// funkciju pozvati 5 puta (iteracijama)

		// primer zadatka sa ciljem da pokaze da se i kroz for petlju može pozivati
		// funkcija
		// tako sto cete je pozvati 5 puta, zapravo ce svaki put uzeti po jedan element
		// niza koji su gore definisani
		// prvi put ce i biti 0, sve tako do 4 i u svakoj iteraciji ce uzeti po jedan
		// element iz svakog niza i pozvace funkciju koja stampa

		// definisu se nizovi u main metodi
		String[] ime = { "Mirko", "Darko", "Sanja", "Maja", "Risto" };
		String[] prezime = { "Divac", "Nikolic", "Milic", "Markovic", "Vucicevic" };
		String[] fakultet = { "Ekonomski", "Pravni", "FTN", "DIF", "Saobracajni" };
		double[] prosek = { 7.8, 8.2, 9.0, 6.7, 7.65 };
		int[] godine = { 1984, 1985, 1986, 1987, 1988 };

		// i for petlja se pravi u main metodi

		for (int i = 0; i < 5; i++) {

			// sada pozivam funkciju i prosledjujem joj parametre
			stampaj(ime[i], prezime[i], fakultet[i], prosek[i], godine[i]);
		}
	}

	// definisem funkciju i dodeljujem joj argumente
	public static void stampaj(String ime, String prezime, String fakultet, double prosek, int godina) {

		// u ispisu pozivam svaki od nizova
		System.out.println(ime + " " + prezime + " je zavrsio/la fakultet " + fakultet + " sa prosecnom ocenom "
				+ prosek + ", a rodjen/na je " + godina + " godine.");
	}
}
