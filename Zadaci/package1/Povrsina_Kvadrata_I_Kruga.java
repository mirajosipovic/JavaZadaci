package package1;

public class Povrsina_Kvadrata_I_Kruga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// IZRACUNATI POVRSINU KVADRATA
		int stranicaKvadrata = 4;
		int povrsinaKvadrata = stranicaKvadrata * stranicaKvadrata;
		System.out.println("Povrsina kvadrata je: " + povrsinaKvadrata);
		System.out.println(
				"Povrsina kvadrata cija je stranica " + stranicaKvadrata + " iznosi " + povrsinaKvadrata + ".");

//IZRACUNATI POVRSINU KRUGA
		double poluprecnik = 4d;
		double pi = 3.14;
		double povrsinaKruga = poluprecnik * poluprecnik * pi;
		System.out.println("Povrsina kruga ciji je poluprecnik " + poluprecnik + " iznosi: " + povrsinaKruga);
	}
}
