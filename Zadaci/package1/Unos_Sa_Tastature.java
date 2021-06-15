package package1;

import java.util.Scanner;

public class Unos_Sa_Tastature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//UNOS SA TASTATURE: 

		Scanner s = new Scanner(System.in);// samo jednom se ovo pise

		System.out.println("Unesite prvi broj: ");
		int prviBroj = s.nextInt();
		System.out.println("Broj koji ste uneli je " + prviBroj + ".");

		System.out.println("Unesite drugi broj: ");
		int drugiBroj = s.nextInt();
		System.out.println("Broj koji ste uneli je " + drugiBroj + ".");

		System.out.println("Zbir unetih brojeva iznosi: " + (prviBroj + drugiBroj));
		System.out.println("Razlika unetih brojeva iznosi " + (prviBroj - drugiBroj));
		System.out.println("Proizvod unetih brojeva iznosi " + (prviBroj * drugiBroj));
		System.out.println("Kolicnik unetih brojeva iznosi " + (prviBroj / drugiBroj));
		
		s.close(); //zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
