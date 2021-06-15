package package1;

public class Funkcije_Dva_Stringa_Vraca_String_I_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati funkciju koja od dva ulazna Stringa
		// formira rezultujuci string.
		// Parametri funkcije su
		// firstStr, secondStr i swap(boolean)
		// Ako se unesu vrednosti:
		// firstStr = "xxx"
		// secondStr = "zzz"
		// swap = false
		// Vraca string:
		// "xxxzzz"
			
		// Ako se unesu vrednosti:
		// firstStr = "xxx"
		// secondStr = "zzz"
		// swap = true
		// Vraca string:
		// "zzzxxx"
	 
{
			// TODO Auto-generated method stub		
			boolean zamena=false;
			String ispis = zamenaMesta("prvi", "drugi", zamena);
			if (zamena) {
				//ako je doslo do zamene ispis ce biti:
			System.out.println("Zamenili smo stringove " + ispis);}
	//ako  nije doslo do zamene ispis ce biti:
			else {
	System.out.println("Nismo zamenili stringove " + ispis);

			} 
}
	}
		//pravimo funkciju koja ce primiti dva stringa i boolean
			public static String zamenaMesta (String firstStr, String secondStr, boolean swap) { 
			String ispis=" ";
			//ako je swap true jednako sa false onda ne treba da zamenimo mesta i ispis ce biti:
			if (swap==false){ispis= firstStr + " " + secondStr; }
	//
			else {ispis= secondStr + " " + firstStr;}
			return ispis; }}
