package package1;

public class Funkcije_Osnove_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//FUNKCIJE - OSNOVE
		
System.out.println("Trenutno sam u main metodi");
		
		for (int i = 0; i < 5; i++) {
			ispisiNesto(); // pozvali smo funkciju
			//i ona ce se u ovom slucaju izvrsiti 5 puta
		}
	}
	
//PRAVIM FUNKCIJU
	public static void ispisiNesto() // ovo je zaglavlje funkcije
	{
		System.out.println("Ispisujem iz funkcije"); // telo funkcije i tu definisemo sta ce ova funkcija uraditi
	}
}

//OVDE SMO URADILI SLEDECE:
//1. NAPRAVILI SMO MAIN METODU SA FOR PETLJOM 
//2. NAPRAVILI SMO FUNKCIJU
//3. POZVALI SMO FUNKCIJU DA IZVRSI SVOJ KOD
//4. OBE OBE METODE SU U OKVIRU KLASE

