package package1;

public class Niz_Sabiranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// SABIRANJE U NIZU

	
		int[] nizBrojeva = { 3, 34, 8, 1, 5, 67 };
		// da bismo sabrali treba nam promenljiva kojoj dajem naziv zbir i vrednost 0
		int zbir = 0;

	
		for (int i = 0; i < nizBrojeva.length; i++) {
			// promenljivu zbir cemo povecati za nizBrojeva[i]
			zbir += nizBrojeva[i];
		}
		System.out.println("Zbir elemenata niza je " + zbir);
	}
}
