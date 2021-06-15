package package1;

import java.util.Scanner;

public class Switch_String_Zima_Leto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite godisnje doba");
		String godisnjeDoba = s.next();

		switch (godisnjeDoba) {
		case "Zima": {
			System.out.println(godisnjeDoba + " je duga i hladna");
		}
			break;
		case "Prolece": {
			System.out.println(godisnjeDoba + " lepo i toplo.");
		}
			break;
		case "Leto": {
			System.out.println(godisnjeDoba + " je i idemo na more.");
		}
			break;
		case "Jesen": {
			System.out.println(godisnjeDoba + " je i lisce opada.");
		}
			break;

		default: {
			System.out.println("Niste uneli naziv godisnjeg doba.");
		}
			break;
		}
		s.close(); // zatvaranje skenera - nije obavezno, dobra je praksa
	}
}
