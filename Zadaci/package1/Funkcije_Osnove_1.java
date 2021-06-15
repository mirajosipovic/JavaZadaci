package package1;

public class Funkcije_Osnove_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//FUNKCIJE - OSNOVE
		
//SVA IZVRSAVANJA FUNKCIJE IDU IZ MAIN METODE	
//DA BI SE IZVRSILA FUNKCIJA, MORAM JE POZVATI U MAIN METODI 
		
	System.out.println("Trenutno sam u main metodi");
		ispisiNesto(); // ovako se poziva ova funkcija
	}
	
//PRAVIM FUNKCIJU
	public static void ispisiNesto() // ovo je zaglavlje funkcije
	{
		System.out.println("Ispisujem iz funkcije"); // telo funkcije
	}
}

// DA BI MI IZVRSILI KOD KOJI JE U FUNKCIJI, MI MORAMO FUNKCIJU DA POZOVEMO
// POZIVAMO JE TAKO STO U MAIN METODI ISPISEMO NJEN NAZIV tj ispisiNesto()

