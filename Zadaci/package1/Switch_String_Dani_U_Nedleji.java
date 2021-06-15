package package1;

import java.util.Scanner;

public class Switch_String_Dani_U_Nedleji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite dan u nedelji:");
		String danUNedelji = s.next();

//DANI U NEDELJI SA SWITCH I STRING
		switch (danUNedelji) {

		case "Ponedeljak": {
			System.out.println(danUNedelji + " je 1. dan u nedelji");
			break;
		}
		case "Utorak": {
			System.out.println(danUNedelji + " je 2. dan u nedelji");
			break;
		}
		case "Sreda": {
			System.out.println(danUNedelji + " je 3. dan u nedelji");
			break;
		}
		case "Cetvrtak": {
			System.out.println(danUNedelji + " je 4. dan u nedelji");
			break;
		}
		case "Petak": {
			System.out.println(danUNedelji + " je 5. dan u nedelji");
			break;
		}
		case "Subota": {
			System.out.println(danUNedelji + " je 6. dan u nedelji");
			break;
		}
		case "Nedelja": {
			System.out.println(danUNedelji + " je 7. dan u nedelji");
			break;
		}
		default: {
			System.out.println("Nevalidan unos");
			break;
		}
		}
		s.close(); //zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
