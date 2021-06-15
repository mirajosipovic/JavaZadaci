package package1;

import java.util.Scanner;

public class While_Petlja_Sabiranje_OD_0_DO_Unetog_res1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//NAPISATI PROGRAM KOJI SABIRA BROJEVE OD 0 DO BROJA KOJI STE UNELI NA TASTATURI
//I PRIKAZUJE SUMU (NE U SVAKOM KORAKU VEC SAMO NA KRAJU)
//ZBIR SVIH BROJEVA OD 0 DO 3 JE 6

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj do kog zelite da sabere: ");
		int brojDoKogSabiramo = s.nextInt();
			
		int zbir = 0;
		int i = 0;
		
		while (i <= brojDoKogSabiramo) {
			zbir+=i;
			i++;
		}
			System.out.println("Zbir svih brojeva od 0 do " + brojDoKogSabiramo + " je " + zbir);
		}
	}



