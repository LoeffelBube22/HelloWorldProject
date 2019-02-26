package rekursion;

public class Methoden {
		//main Methode - ist die Methode
		//die beim Start des Programmes / der Klasse
		//aufgerufen wird

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			spezielleMethode();
			spezielleMethode();
			spezielleMethode();
			//
			addiere(10, 5);
			System.out.println(mult(20, 2));
			
	}
		//
	public static void spezielleMethode() {
		System.out.println("ich bin speziell.");
	}
	public static void addiere(int zahlA, int zahlB) {
		System.out.println(zahlA + zahlB);
	}
	public static int mult(int zahlA, int zahlB) {
	int ergebnis = zahlA * zahlB;
			return ergebnis;
			
	}
}



