package package1;

public class Funkcije_NIzovi_Osnove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Finkcija i rad sa nizovima

		int[] niz = { 2, 5, 6, 4, 3, 5 };
		// pozivam ovako funkciju: pozivom naziva funkcije radSaNizom i prosledjujem joj
		// promenljivu niz
		System.out.println("Treci element niza je " + radSaNizom(niz));
	}

	// ova funkcija prima niz integera, i vratice samo 3 element niza
	public static int radSaNizom(int[] nizIntegera) {
		// return nizIntegera[2];
		// ovako postavljam vracanje samo 3 elementa niza:
		// pravim ovu promenljivu i definisem po indeksu koji element zelim znaci
		// nizIntegerint[2]
		int treciElementNiza = nizIntegera[2];
		// trazim da vrati ovu promenljivu
		return treciElementNiza;
	}
}
// Hocu ovoj funkciji da proslednim niz i da mi vrati samo 3 element niza.
