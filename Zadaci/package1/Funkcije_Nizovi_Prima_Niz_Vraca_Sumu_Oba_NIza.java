package package1;

public class Funkcije_Nizovi_Prima_Niz_Vraca_Sumu_Oba_NIza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// napisati funkciju koja prima niz brojeva i vraca sumu svih brojeva niza

		int[] niz = { 1, 2, 3, 4, 5 };
		int[] drugiNiz = { 2, 3, 4 };
		System.out.println("Suma svih ?lanova prvog niza je " + SumaNiza(niz));
		System.out.println("Suma svih ?lanova iz oba niza je: " + SumaDvaNiza(niz, drugiNiz));  }
			
	public static int SumaNiza(int[] nizBrojeva) {
				int suma = 0;
				for (int i = 0; i < nizBrojeva.length; i++) {
					suma += nizBrojeva[i];   }
				return suma;  }
			public static int SumaDvaNiza(int[] prviNiz, int[] drugiNiz) {
				int suma = SumaNiza(prviNiz) + SumaNiza(drugiNiz);
				return suma;  }

	}


