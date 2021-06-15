package package1;

public class While_Petlja_Sabiranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ZBIR BROJEVE OD 0 DO 10 PRIKAZATI KROZ WHILE PETLJU.

		int i = 0;
		int zbir = 0;

		while (i <= 10) {
			zbir += i; // ili ovako. zbir = zbir + i; ovo mora da stoji ovde

			System.out.println("i je sada " + i + " a trenutni zbir je " + zbir);

			i++; // mora da stoji ovde
		}
	}
}
