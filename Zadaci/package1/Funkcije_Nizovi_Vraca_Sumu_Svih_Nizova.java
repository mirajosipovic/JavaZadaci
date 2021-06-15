package package1;

public class Funkcije_Nizovi_Vraca_Sumu_Svih_Nizova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] niz = { 2, 5, 6, 4, 3, 5 };
		int[] nizJedan = { 3, 4, 6, 4, 2, 4 };

		int sumaElemenataNiza = zbirElemenataNiza(niz);

		int sumaElemenataDvaNiza = zbirElemenataDvaNiza(niz, nizJedan);
		System.out.println("Suma brojeva niza je " + sumaElemenataNiza);
		System.out.println("Suma brojeva dva niza je " + sumaElemenataDvaNiza);
	}

	public static int zbirElemenataNiza(int[] nizIntidzera) {
		int suma = 0;

		for (int i = 0; i < nizIntidzera.length; i++) {
			suma = suma + nizIntidzera[i];
		}
		return suma;
	}

	public static int zbirElemenataDvaNiza(int[] prviNiz, int[] drugiNiz) {
		int suma = 0;
		for (int i = 0; i < prviNiz.length; i++) {
			suma += prviNiz[i];
		}
		for (int i = 0; i < drugiNiz.length; i++) {
			suma += drugiNiz[i];
		}
		return suma;
	}
}
