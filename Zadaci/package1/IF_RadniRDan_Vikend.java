package package1;

import java.util.Scanner;

public class IF_RadniRDan_Vikend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//UNETI PREKO TASTATURE BROJ OD 1 DO 7. ISPIS DA BUDE
//RADNI DAN ZA BR OD 1 DO 5, ILI VIKEND ZA BROJEVE OD 6 DO 7

		// I NACIN

		Scanner s = new Scanner(System.in);
		System.out.println("Unesita broj od 1 do 7.");
		int sedmica = s.nextInt();

		if (sedmica >= 1 && sedmica <= 5) {
			System.out.println("Radni dan.");
		} else if (sedmica > 5 && sedmica <= 7) {
			System.out.println("Vikend.");
		} else {
			System.out.println("Uneli ste pogresan broj.");
		}

		// II NACIN
		System.out.println("Unesite broj od 1 do 7.");
		int daniUNedelji = s.nextInt();

		if (daniUNedelji == 1) {
			System.out.println("Radni dan.");
		} else if (daniUNedelji == 2) {
			System.out.println("Radni dan.");
		} else if (daniUNedelji == 3) {
			System.out.println("Radni dan.");
		} else if (daniUNedelji == 4) {
			System.out.println("Radni dan.");
		} else if (daniUNedelji == 5) {
			System.out.println("Radni dan.");
		} else if (daniUNedelji == 6) {
			System.out.println("Vikend je.");
		} else if (daniUNedelji == 7) {
			System.out.println("Vikend je.");
		} else {
			System.out.println("Uneli ste pogresan broj.");
		}
		s.close(); //zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
