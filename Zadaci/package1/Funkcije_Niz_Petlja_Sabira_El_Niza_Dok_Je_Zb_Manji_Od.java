package package1;

import java.util.Scanner;

public class Funkcije_Niz_Petlja_Sabira_El_Niza_Dok_Je_Zb_Manji_Od {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite dan u nedelji");
		String danUNedelji = s.next();
		String radnoVreme = "od 09.00 do 15.00";
		String radnoVremeVikendom = "od 10.00 do 21.00";

		switch (danUNedelji) {

		case "Ponedeljak": {
			System.out.println("Ringišpil je ponedeljkom u Novom Sadu, a radno vreme mu je " + radnoVreme);
			break;
		}
		case "Utorak": {
			System.out.println("Ringišpil je utorkom u Novom Sadu, a radno vreme mu je " + radnoVreme);
		}
		case "Sreda": {
			System.out.println("Ringišpil je utorkom u Temerinu, a radno vreme mu je " + radnoVreme);
		}
		case "Èetvrtak": {
			System.out.println("Ringišpil je utorkom u Temerinu, a radno vreme mu je " + radnoVreme);
		}
		case "Petak": {
			System.out.println("Ringišpil je utorkom u Kacu, a radno vreme mu je " + radnoVreme);
		}
		case "Subota": {
			System.out.println("Ringišpil je utorkom u Novom Sadu, a radno vreme mu je " + radnoVremeVikendom);
		}
		case "Nedelja": {
			System.out.println("Ringišpil je utorkom u Kacu, a radno vreme mu je " + radnoVremeVikendom);
		}
		default: {
			System.out.println("Pogrešan unos.");
		}
		}
	}
}
