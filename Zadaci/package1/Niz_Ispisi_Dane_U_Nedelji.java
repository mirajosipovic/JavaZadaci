package package1;

public class Niz_Ispisi_Dane_U_Nedelji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] daniUNedelji = new String[7]; {
			daniUNedelji[0] = "Ponedeljak";
			daniUNedelji[1] = "Utorak";
			daniUNedelji[2] = "Sreda";
			daniUNedelji[3] = "Cetvrtak";
			daniUNedelji[4] = "Petak";
			daniUNedelji[5] = "Subota";
			daniUNedelji[6] = "Nedelja";
			for (int i = 0; i < daniUNedelji.length; i++) {
				System.out.println((i+1) + ". dan u nedelji je: " + daniUNedelji[i]);
				
			}
		}

//2. nacin ispisa niza
String[] nizDana = {"Ponedeljak", "Utorak", "Sreda", "Cetvrtak", "Petak", "Subota", "Nedelja"};
for(int i = 0; i < nizDana.length; i++) {
	System.out.println((i+1) + ". dan u nedelji je: " + nizDana[i]);
}
}
}
	