package package1;

public class While_Petlja_Osnove_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//WHILE PETLJA - IZVRSAVA SE DOK GOD JE USLOV ISPUNJEN
		int i = 5;
		while (i > 3 ) {
			System.out.println("Usao sam u petlju, vrednost promenljive i je " + i);
			//OVO BI SE IZVRSAVALO BESKONACNO
			i--;	//ovako smanjujem vrednost promenljive i
		}
	}
}
