package package1;

public class Niz_Ispis_Najmanjeg_Broja_Niza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//u ovom nizu brojeva ispisite koji je najmanji broj 
		
		int[] nizBrojeva = { 3, 34, 0, 1, 5, 67 };
		
		// definisem promenljivu min i dajem joj najvecu mogucu vrednost
		int min = nizBrojeva[0];

		for (int i = 0; i < nizBrojeva.length; i++)
			// petlja proverava redom za svaku vrednost da li je manja od te
			// ako je manja promenljiva min postaje ta vrednost
			if (nizBrojeva[i] < min) {
				min = nizBrojeva[i];
			}
		System.out.println("Najmanji broj u ovom nizu je broj " + min);
	}
}
//ovo ne razumem