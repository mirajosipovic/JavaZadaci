package package1;

import java.util.Scanner;

public class While_Petlja_Sabiranje_OD_0_DO_Unetog_res2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj do kojeg želite da saberete: ");
		int brojDoKogSabiramo = s.nextInt();
		int zbir = 0;
		int i = 0;

		while (i <= brojDoKogSabiramo) {
			zbir += i;
			i++;}		
		System.out.println("zbir je " + zbir);
		}
	}

