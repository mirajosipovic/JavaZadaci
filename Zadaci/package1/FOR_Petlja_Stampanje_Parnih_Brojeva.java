package package1;

public class FOR_Petlja_Stampanje_Parnih_Brojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//NAPISATI PROGRAM KOJI STAMPA SVE PARNE BROJEVE OD 3 DO 33

	int brojac = 1; 
		for (int i = 3; i <=33; i++) { 
			if (i%2==0) {
				System.out.println(brojac + ". broj koji je paran je: " + i); 
				brojac++;
				}
			}
		} 
	}
 
