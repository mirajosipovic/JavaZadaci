
package package1;

import java.util.Scanner;

public class While_Petlja_Sabira_Dok_Ne_Unese_iste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji sabira brojeve od korisnika sve dok korisnik ne unese
		// dva ista broja zaredom.
		// Smatrati da korisnik unosi brojeve vece od nule.
		// Primer:
		// Unesite broj: 1
		// Unesite broj: 3
		// Unesite broj: 2
		// Unesite broj: 2
		// Suma je 8
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite prvi broj");
		//System.out.println("Unesite drugi broj");

		int unetiBroj = s.nextInt();
		int prethodniBroj;
		int zbir = unetiBroj;

		while (true) {
			prethodniBroj = unetiBroj;
			System.out.println("Unesite sledeci broj");
			unetiBroj = s.nextInt();
			zbir += unetiBroj;
			if (unetiBroj == prethodniBroj)
				break;
		}
		System.out.println("Suma je " + zbir);
	}
}
/*  drugo resenje 

Scanner s = new Scanner(System.in); 
int unetiBroj = 0; 
int brojZaProveru = -1;
int suma = 0;
while (brojZaProveru !=unetiBroj) {
brojZaProveru = unetiBroj; 
System.out.println("Unesite broj");
unetiBroj = s.nextInt();
suma+=unetiBroj;
}
System.out.println("Uneli ste dva ista broja. Suma je " + suma);
}
}
 */
