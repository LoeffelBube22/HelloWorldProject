package basics;

public class Quicksort {

	
static int[] zahlen = {4, 2, 5, 9, 6, 10, 9, 7};
	
	public static void main(String[] args) {
		
	int[] zahlen = {4, 2, 5, 9, 6, 10, 9, 7};
	for (int i = 0; i < zahlen.length; i++) {
		System.out.println(zahlen[i]);
		quicksort(0,zahlen.length-1);
	}}
		
		static void quicksort(int links, int rechts) {
			if (links < rechts) {
				int teiler = teile(links, rechts);
				quicksort(links, teiler-1);
				quicksort(teiler+1, rechts);
				
			
				
			}
		}
	public static int teile(int links, int rechts) {
		int i = links;
		int j = rechts;
	
		do {
			if (i < j)   { 

				 

				} 
		} while (i < j); 

		 

		 if(i > j);
		 System.out.println(x);
			 

		         

		          

		         return i; 
	}
	}


