package package1;

import java.util.Scanner;

public class IF_Jednocifren_Dvoc_Troc_Cetvoroc_i_Veci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// UNESITE BROJ SA TASTATURE, A PROGRAM TREBA DA ISPISE DA LI JE BROJ
		// JEDNOCIFREN, DVOCIFREN, TROCIFREN, CETVOROCIFREN ILI VECI

		// OVAJ PRIMER JE I ZA POZITIVNE I ZA NEGATIVNE BROJEVE

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite ceo broj:");
		int ceoBroj = s.nextInt();

		if ((ceoBroj < 0 && ceoBroj > -10) || (ceoBroj > 0 && ceoBroj < 10)) {
			System.out.println("Broj je jednocifren.");

		} else if ((ceoBroj <= -10 && ceoBroj > -100) || (ceoBroj >= 10 && ceoBroj < 100)) {
			System.out.println("Broj je dvocifren.");

		} else if ((ceoBroj <= -100 && ceoBroj > -1000) || (ceoBroj >= 100 && ceoBroj < 1000)) {
			System.out.println("Broj je trocifren.");

		} else if (ceoBroj <= -1000 || ceoBroj >= 1000) {
			System.out.println("Broj je cetvorocifren i veci.");

		} else {
			System.out.println("Broj je nula");
		}
		s.close(); //zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
