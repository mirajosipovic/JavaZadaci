package package1;

public class Funkcije_Boolean_vezba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Trenutno sam u main metodi");
		
		boolean punoletstvo = daLiJePunoletanBool(15);
		if (punoletstvo) {
			System.out.println("Milovan je punoletan");
		} else {
			System.out.println("Milovan je maloletan");
		}
	}

	public static boolean daLiJePunoletanBool(int brGodina) {
		boolean punoletstvo;
		if (brGodina >= 18) {
			punoletstvo = true;
		} else {
			punoletstvo = false;
		}
		return punoletstvo;
	}
}

	/*
	public static String daLiJePunoletan(int brGodina) {
		String punoletstvo;
		if (brGodina >= 18) {
			punoletstvo = "Punoletan";
		} else {
			punoletstvo = "Maloletan";
		}
		return punoletstvo;
	}
*/

