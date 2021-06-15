package package1;

import java.util.Scanner;

public class Switch_Dani_U_Nedelji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//POMOCU SWITCH-A SE IZVRSAVA JEDAN OD VISE BLOKOVA KODA 

//ZA SVAKI DAN U NEDELJI, ZA SVAKI REDNI BROJ KOJI UNESEMO
//ZELIMO DA IMAMO RAZLICITO PONASANJE

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite redni broj dana u nedelji:");
		int redniBrDanaUNedelji = s.nextInt();

		switch (redniBrDanaUNedelji) {

		case 1: {
			System.out.println("Ponedeljak je.");
			break;
		}
		case 2: {
			System.out.println("Utorak je.");
			break;
		}
		case 3: {
			System.out.println("Sreda je.");
			break;
		}
		case 4: {
			System.out.println("Cetvrtak je.");
			break;
		}
		case 5: {
			System.out.println("Petak je.");
			break;
		}
		case 6: {
			System.out.println("Subota je.");
			break;
		}
		case 7: {
			System.out.println("Nedelja je.");
			break;
		}
		default:
			System.out.println("Redni broj dana u nedelji nije validan.");
			break;
		}
		s.close(); //zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
