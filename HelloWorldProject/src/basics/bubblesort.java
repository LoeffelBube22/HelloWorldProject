package basics;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] zahlen = {1, 3, 2, 8, 5, 20, 11, 16, 13 };
		// System.out.println(zahlen[0]);
		// System.out.println(zahlen[1]);
		//
		// System.out.println(zahlen.length);
		System.out.println("Die Row hat " + zahlen.length + " Numbs");
		for (int i = 0; i < zahlen.length; i++) {

			System.out.println(zahlen[i]);
		}
		//
		System.out.println("------");
		// bubblesort
		for (int n = zahlen.length; n > 1; n--) {
			for (int i = 0; i < n - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					int a = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = a;
				}
			}
		}

		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}

	}

}
