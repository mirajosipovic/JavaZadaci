package package1;

import java.util.Scanner;

public class While_Petlja_Dva_Broja_GranVrednosti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UNETI DVA BROJA SA TASTATURE, JEDAN MANJI, JEDAN VECI
		// ISPISATI GRANICNE VREDNOSTI

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite manji broj:");
		int manjiBroj = s.nextInt();

		System.out.println("Unesite veci broj:");
		int veciBroj = s.nextInt();

		while (manjiBroj <= veciBroj) {
			System.out.println(manjiBroj);
			manjiBroj++;
		}
	}
}
