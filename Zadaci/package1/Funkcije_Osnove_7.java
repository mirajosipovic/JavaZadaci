package package1;

public class Funkcije_Osnove_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//punoletstvo poziva funkciju daLiJePunoletan i prosleðuje broj
				String punoletstvo = daLiJePunoletan(32);
				System.out.println("Milovan je " + punoletstvo);
			}
			
		//ovde je funkcija daLiJePunoletan primila brojGodina 
			public static String daLiJePunoletan(int brojGodina) {
				
				//deklarisali smo jedan string
				String punoletstvo;
				
				//ako je brojGodina >=18 ovaj string ce imati vrednost Punoletan
				if (brojGodina >= 18) {
					punoletstvo = "Punoletan";
		//ako je brojGodina manje od 18 ovaj string ce imati vrednost Maloletan
				} else {
					punoletstvo = "Maloletan";
				}
		//vratice taj string nazad i onda ce string rezultatFunkcije dobiti //vrednost ovoga sto je vraceno
		//tako da ce u ispisu biti "Milovan je + rezultatFunkcije
				return punoletstvo;
			}
		}
