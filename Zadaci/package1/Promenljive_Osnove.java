package package1;

public class Promenljive_Osnove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String prviString = "prvi string";
		System.out.println("Naš prvi string: " + prviString);

		String ime = "Mira";
		char karakter = 'M';
		boolean istina = true;
		byte maliBroj = 127;
		boolean neistina = false;
		short kratakBroj = 32767;
		int obicanBroj = 2147483647;
		long dugacakBroj = 9223372036854775807L;
		float decBroj = 5951241264f;
		double decBrojVeliki = 12E4d;

		String a = "inicijalizovano";
		System.out.println("Naš prvi string " + a);
		a = "nova vrednost";
		System.out.println("Naš prvi string nakon prve promene: " + a);
		a = "nesto treæe";
		System.out.println("Naš prvi string nakon druge promene: " + a);

		String prvoIme = "Milovan";
		String prezime = "Pocek";
		String celoIme = prvoIme + " " + prezime + ".";
		System.out.println("Moje ime je: " + celoIme);

		int prviPrirodniBroj = 8;
		int drugiPrirodniBroj = 4;
		System.out.println("Moj prvi broj je " + prviPrirodniBroj);
		System.out.println("Moj drugi broj je " + drugiPrirodniBroj);

		int zbir = prviPrirodniBroj + drugiPrirodniBroj;
		int razlika = prviPrirodniBroj - drugiPrirodniBroj;
		int proizvod = prviPrirodniBroj * drugiPrirodniBroj;
		int kolicnik = prviPrirodniBroj / drugiPrirodniBroj;
		System.out.println("Zbir je " + zbir);
		System.out.println("Razlika je " + razlika);
		System.out.println("Proizvod je " + proizvod);
		System.out.println("Kolicnik je " + kolicnik);

		float decimalniBroj = 3f; // float je broj sa decimalom ali moze da se zapise kao ceo broj
		float decimalniBrojDrugi = 4f;
		float kolicnikNovi = decimalniBroj / decimalniBrojDrugi;
		System.out.println("Kolicnik brojeva 3 i 4 je " + kolicnikNovi + " Ovo je tacno jer su obe promenljive float.");

//VAZNO - KADA RADIMO DELJENJE VAZNO JE IMATI JEDNU PROMENLJIVU FLOAT JER SE U SUPROTNOM DOBIJA POGRESAN REZULTAT.
//NPR:
		int brojBroj = 3;
		int brojBrojNovo = 4;
		int kolicnikProvera = brojBroj / brojBrojNovo;
		System.out.println("Kolicnik brojeva 3 i 4 je " + kolicnikProvera
				+ " Ovo je netacno zato sto su obe promenljive integer.");// mozemo
		System.out.println("Kolicnik brojeva 3 i 4 je " + (brojBroj / brojBrojNovo)
				+ " Ovo je netacno zato sto su obe promenljive integer."); // mozemo i ovako da zapisemo

		double prviBroj = 3.5d;
		double drugiBroj = 2d;
		double treciBroj = prviBroj / drugiBroj;
		System.out.println(
				"Kolicnik ova dva broja je: " + treciBroj + " Ovo je prvi nacin da dobijemo rezultat sa decimalom.");

//drugi nacin da dobijemo rezultat sa decimalom je:
		double cetvrtiBroj = (double) prviBroj / drugiBroj;
		System.out.println(
				"Kolicnik ova dva broja je: " + cetvrtiBroj + " Ovo je drugi nacin da dobijemo rezultat sa decimalom.");
	}
}
