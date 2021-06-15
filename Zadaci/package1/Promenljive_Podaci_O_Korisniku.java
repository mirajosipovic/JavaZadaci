package package1;

public class Promenljive_Podaci_O_Korisniku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PROGRAM KOJI CUVA PODATKE O KORISNIKU: 
//IME, PREZIME, EMAIL; GODINA RODJENJA, FAKULTET, PROSECNA OCENA, OMILJENO SLOVO, VOLI/NE VOLI PROGRAMIRANJE

		String ime = "Mira";
		String prezime = "Josipovic";
		String eMail = "mira7mira@gmail.com";
		int godRodjenja = 1971;
		String fakultet = "Prirodno-Matematicki fakultet";
		float prosecnaOcena = 7.8f;
		char omiljenoSlovo = 'M';
		boolean voliProgramiranje = true;

		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("eMail: " + eMail);
		System.out.println("Godina rodjenja: " + godRodjenja + ".");
		System.out.println("Fakultet: " + fakultet);
		System.out.println("Prosecna ocena: " + prosecnaOcena);
		System.out.println("Omiljeno slovo: " + omiljenoSlovo);
		System.out.println("Voli programiranje: " + voliProgramiranje);
//ISPIS U NOVOM REDU: 
		System.out.println("Ime " + ime + "\nPrezime " + prezime + "\nGodina rodjenja " + godRodjenja);

	}

}
