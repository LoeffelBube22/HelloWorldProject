package basics;

public class Bubblesort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Länge der Reihe
		
				int[] zahlen = { 17, 1, 10, 9, 2, 8, 6, 5, 16, 15 };
				System.out.println("Die Reihe hat " + zahlen.length + " Zahlen");
				for (int i = 0; i < zahlen.length; i++) {
					System.out.println(zahlen[i]);
				}
				//
				System.out.println("-------------");
				//
				
				for (int z = zahlen.length; z > 1; z--) {
					for (int s = 0; s < z - 1; s++) {
						if (zahlen[s] > zahlen[s + 1]) {
							int a = zahlen[s];
							zahlen[s] = zahlen[s + 1];
							zahlen[s + 1] = a;

						}
					}
				}
				for (int i = 0; i < zahlen.length; i++) {
					System.out.println(zahlen[i]);
				}


	}

}
