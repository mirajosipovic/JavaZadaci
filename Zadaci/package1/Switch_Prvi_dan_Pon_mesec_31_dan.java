package package1;

import java.util.Scanner;

public class Switch_Prvi_dan_Pon_mesec_31_dan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prvi dan u mesecu je ponedeljak, a mesec ima 31 dan
		// korisnik unosi dan u nedelji, a program treba da kaze
		// na koje dane u mesecu pada taj dan
	// primer ispisa:  utorak pada na  2, 9, 16,  23, 30, dan u mesecu

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite dan u nedelji: ");
		String danUNedelji = s.next();
		int redniBrDana = 0;
		
		switch (danUNedelji) {
		case "Ponedeljak":{
			redniBrDana = 1;
			System.out.println(danUNedelji + " pada na ");
		}	
			break;

		case "Utorak":{
			 redniBrDana = 2;
			System.out.println(danUNedelji + " pada na ");
		}	
			break;

		case "Sreda":{
			redniBrDana = 3;
			System.out.println(danUNedelji + " pada na ");
		}	
			break;

		case "Cetvrtak":{
			redniBrDana = 4;
			System.out.println(danUNedelji + " pada na ");
		}	
			break;

		case "Petak":{
			redniBrDana = 5;
			System.out.println(danUNedelji + " pada na ");
		}	
			break;

		case "Subota":{
			 redniBrDana = 6;
			System.out.println(danUNedelji + " pada na ");
		}	
			break;
		case "Nedelja":{
		 redniBrDana = 7;
			System.out.println(danUNedelji + " pada na ");
		}	
			break;
		default:{
			System.out.println("Unos nije validan");
		}
			break;
		}
		while(redniBrDana <= 31) {
			System.out.println(redniBrDana);
			redniBrDana += 7;
		}
		System.out.println("Dan u mesecu.");
	}
}















