package package1;

public class Funkcije_Vraca_Pozitiva_Ili_Negativan_Broj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Napisati funkciju koja prima broj i vraca text da li je broj pozitivan negativan ili nula. 
//Resenje ispisati iz main metode
					
	//ovako pozivam funkciju koja se zove kakavJeBroj
				String tipBroja = kakavJeBroj(0);
				System.out.println("Broj je " + tipBroja);
			}
			
			//ovo je funkcija koju cu pozvati iz main metode 
			public static String kakavJeBroj(int broj) {

				//moram da deklarisem ovu promenljivu
				String tipBroja;

				if (broj == 0){
					tipBroja= "nula";            
				} else if (broj <0) {
					tipBroja = "Broj je negativan";
				} else {
					tipBroja = "Broj je pozitivan";
				}
				return tipBroja; //return je kljucna rec
			}
		}
	
