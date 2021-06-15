package package1;

import java.util.Scanner;

public class Switch_Bonus_bez_Zareza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Bonus deo: Zelim da mi ispis izgleda ovako Utorak pada na:
//2, 9, 16, 23, 30 dan u mesecu, Obratite paznju da ne bude zaraz nakon poslednjeg broja.


		String danUNedelji;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dan u nedelji: ");

		danUNedelji = sc.next();

		switch (danUNedelji) {
		case "Ponedeljak": {
			System.out.print("Ponedeljak pada na: ");
			for (int i = 1; i <= 31; i = i + 7) {
				if ((31 - i) >= 7) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
			System.out.print(" dan u mesecu");
			break;
		}
		case "Utorak": {
			System.out.print("Utorak pada na: ");
			for (int i = 2; i <= 31; i = i + 7) {
				if ((31 - i) >= 7) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
			System.out.print(" dan u mesecu");
			break;
		}
		case "Sreda": {
			System.out.print("Sreda pada na: ");
			for (int i = 3; i <= 31; i = i + 7) {
				if ((31 - i) >= 7) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
			System.out.print(" dan u mesecu");
			break;
		}
		case "Cetvrtak": {
			System.out.print("Cetvrtak pada na: ");
			for (int i = 4; i <= 31; i = i + 7) {
				if ((31 - i) >= 7) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
			System.out.print(" dan u mesecu");
			break;
		}
		case "Petak": {
			System.out.print("Petak pada na: ");
			for (int i = 5; i <= 31; i = i + 7) {
				if ((31 - i) >= 7) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
			System.out.print(" dan u mesecu");
			break;
		}
		case "Subota": {
			System.out.print("Subota pada na: ");
			for (int i = 6; i <= 31; i = i + 7) {
				if ((31 - i) >= 7) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
			System.out.print(" dan u mesecu");
			break;
		}
		case "Nedelja": {
			System.out.print("Nedelja pada na: ");
			for (int i = 7; i <= 31; i = i + 7) {
				if ((31 - i) >= 7) {
					System.out.print(i + ", ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println(" dan u mesecu.");
			break;
		}
		default:
			System.out.println("Uneli ste pogresan dan u nedelji.");
		}  }    }

