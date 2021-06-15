package package1;

public class Niz_Osnove_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//NIZ - OSNOVE
		// VAZNO - VAZNO: U nizu elementi se indeksiraju od nule.
		
		//definisanje nizova
		String[] nizBoja = new String[4];
		int[] nizBrojeva = new int[7];
		double[] nizDablova = new double[5];
		
		nizBoja[0] = "zuta";
		nizBoja[2] = "plava";
		nizBoja[1] = "braon";
		nizBoja[3] = "crvena";
		
		int duzinaNiza = nizBoja.length;//da prebrojimo sve el niza
		System.out.println("Niz sadrzi " + duzinaNiza + " elemenata");
		
		for (int i = 0; i < nizBoja.length; i++) {//da ispisemo sve el niza
			System.out.println((i + 1) + ". element niza je " + nizBoja[i]);
		}
		System.out.println("Kraj programa");
		
		// alternatvno inicijalizovanje niza
		String[] nizCveca = { "Ruza", "Ljubicica", "Lala", "Fikus", "Lavanda" };
		System.out.println("Element sa indexom 3 je " + nizCveca[3]);
		System.out.println("Duzina niza je " + nizCveca.length);
		nizCveca[2] = "maslacak";
		
		for (int i = 0; i < nizCveca.length; i++) {//da ispisemo sve el niza
			System.out.println((i + 1) + ". element niza je " + nizCveca[i]);
		}
		
		//int[] nizBrojeva = new int[3]; //ne mozemo da menjamo duzinu niza naknadno, zato ce ovde javiti gresku
		//System.out.println(nizBrojeva[1]);
	}
}
