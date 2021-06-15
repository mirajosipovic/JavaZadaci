package package1;

public class IF_I_ILI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DA LI SU BROJEVI POZITIVNI ILI NEGATIVNI

		// AND => &&
		// OR => ||
		int a = 0;
		int b = 0;

		if (a > 0 && b > 0) {
			System.out.println("Oba broja su pozitivna.");

		} else if (a < 0 && b < 0) {
			System.out.println("Oba broja su negativna.");

		} else if (a == 0 && b == 0) {
			System.out.println("Oba broja su 0.");

		} else if (a > 0 && b < 0) {
			System.out.println("Prvi broj je pozitivan, drugi broj je negativan");

		} else if (a < 0 && b > 0) {
			System.out.println("Prvi broj je negativan, drugi broj je pozitivan");

		} else {
			System.out.println("Kraj programa");
		}
	}
}

// U ovom primeru ima 5 kombinacija
// - oba pozitivna
// - oba negativna
// - oba broja nula
// - prvi pozitivan a drugi negativan
// - prvi negativan a drugi pozitivan
