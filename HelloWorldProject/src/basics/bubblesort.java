package basics;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] zahlen = { 3, 1, 9, 5, 2, 8, 6, 5 };
		// System.out.println(zahlen[0]);
		// System.out.println(zahlen[1]);
		//
		// System.out.println(zahlen.length);
		//
		for (int i = 0; i < zahlen.length; i++) {

			System.out.println(zahlen[i]);
		}
		//
		System.out.println("------");
		//
		for (int n = zahlen.length; n > 1; --n) {
			for (int i = 0; i < i - 1; ++i) {
				if (zahlen[i] > zahlen[i + 1]) {
					int help = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = i;
				}
			}
		}

		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}

	}

}
