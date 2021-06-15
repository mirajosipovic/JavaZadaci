package package1;

import java.util.Scanner;

public class IF_Dvoc_Broj__Koji_Je_Prvi_Drugi {

	// NAPISATI ZADATAK KOJI ZA UNETI DVOCIFRENI BROJ NAPISE KOJA JE PRVA CIFRA
	// A KOJA DRUGA. PRIMER ISPISA: UNELI STE BROJ 35; PRVI BROJ JE 3, DRUGI BROJ JE
	// 5.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite dvocifreni broj: ");

		int dvocifreniBroj = s.nextInt();

		if (dvocifreniBroj > 9 && dvocifreniBroj < 100) {
			System.out.println("Uneli ste broj " + dvocifreniBroj + "." + " Prva cifra je: " + dvocifreniBroj / 10
					+ " druga cifra je: " + dvocifreniBroj % 10 + ".");
		} else {
			System.out.println("Niste uneli dvocifreni broj.");
		}
	}
}

/* 2. RESENJE
Scanner s = new Scanner(System.in);
System.out.println("Unesite dvocifreni broj: ");
int dvocifreniBroj = s.nextInt();

int prviBroj = dvocifreniBroj /10;
int drugiBroj = dvocifreniBroj % 10;
	System.out.println("Prvi broj je " + prviBroj);
	System.out.println("DrugiBroj je " + drugiBroj);
	}
	}
 */

