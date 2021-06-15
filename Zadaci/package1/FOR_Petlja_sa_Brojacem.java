package package1;

public class FOR_Petlja_sa_Brojacem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//ISPIS BROJEVE OD 0 DO 25 KOJI SU DELJIVI SA 10
//TAKO DA U ISPISU PISE: PRVI BROJ KOJI JE DELJIV SA 10, DRUGI BROJ...TRECI BROJ...
		
		int brojac = 1;
		
		for (int i = 0; i <=25; i++) {
			if (i%10==0) {
				System.out.println(brojac + ". broj koji je deljiv sa 10 je " + i);
				brojac+=1;				
			}		
		}
	}
}
// DA IZBACIM ISPIS "BROJ 0 JE DELJIV SA 10 NAPISACU   if (i%10==0 && !==0)