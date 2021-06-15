package package1;

import java.util.Scanner;

public class Switch_Mesec_Broj_Dana_U_Mesecu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//UNETI SA TASTATURE REDNI BROJ MESECA U GODINI. A PROGRAM DA ISPISE
//KOJI JE TO MESEC I KOLIKO IMA DANA U NJEMU.
//NPR: PRVI MESEC U GODINI JE JANUAR. U NJEMU IMA 31 DAN

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite redni broj meseca.");
		int mesecUGodini = s.nextInt();

		switch (mesecUGodini) {
		case 1: {
			System.out.println("Prvi mesec u godini je Januar. U njemu ima 31 dan.");
			break;
		}
		case 2: {
			System.out.println("Drugi mesec u godini je Februar. U njemu ima 28 ili 29 dana, ako je godina prestupna.");
			break;
		}
		case 3: {
			System.out.println("Treci mesec u godini je Mart. U njemu ima 31 dan.");
			break;
		}
		case 4: {
			System.out.println("Cetvrti mesec u godini je April. U njemu ima 30 dan.");
			break;
		}
		case 5: {
			System.out.println("Peti mesec u godini je Maj. U njemu ima 31 dan.");
			break;
		}
		case 6: {
			System.out.println("Šesti mesec u godini je Jun. U njemu ima 30 dan.");
			break;
		}
		case 7: {
			System.out.println("Sedmi mesec u godini je Jul. U njemu ima 31 dan.");
			break;
		}
		case 8: {
			System.out.println("Osmi mesec u godini je Avgust. U njemu ima 31 dan.");
			break;
		}
		case 9: {
			System.out.println("Deveti mesec u godini je Septembar. U njemu ima 30 dan.");
			break;
		}
		case 10: {
			System.out.println("Deseti mesec u godini je Oktobar. U njemu ima 31 dan.");
			break;
		}
		case 11: {
			System.out.println("Jedanaesti mesec u godini je Novembar. U njemu ima 30 dan.");
			break;
		}
		case 12: {
			System.out.println("Dvanaesti mesec u godini je Decembar. U njemu ima 31 dan.");
			break;
		}
		default:
			System.out.println("Uneli ste nevalidan redni broj.");
			break;
		}
		s.close(); //zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
