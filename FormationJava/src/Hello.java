import java.util.Random;

public class Hello {

	/**
	 * *
	 * 
	 * @param i
	 *            premiere paramètre
	 * @param j
	 *            Deuxieme paramètre
	 * @return Addition de i+j
	 */
	public static int add(int i, int j) {
		return i + j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Word");
		/*
		 * int i=10; int j=20;
		 * 
		 * System.out.println(i); System.out.println(j); int k=j; j=i; i=k;
		 * System.out.println(i); System.out.println(j);
		 */

		// -//afficher 0-90------------------------------------

		for (int i = 1; i < 100; i++) {
			System.out.println(i + " ");
		}

		System.out.println(" bommm");

		// afichier 10 premier puissance de 2------

		int j = 1;
		for (int i = 0; i < 10; i++) {
			j *= 2;
			System.out.println(j + " ");
		}

		System.out.println(" bommm2");

		// -----------------------afficher les 50 premieres nombres
		// premiere-------------------
		/*
		 * int toTest = 2; for (int i = 0; i < 500; i++) { boolean isPrime =
		 * true; j = 2; while (isPrime && j < toTest) { if (toTest % j == 0) {
		 * isPrime = false; } j++; } if (isPrime) { System.out.println(toTest);
		 * 
		 * } toTest++; } System.out.println(add(2, 3));
		 */
		// ******************Tableau***************

		int[] montab = { 2, 5, 8, 9, 3, 7, 6, 1, 8, 10 };
		// int[] montab = createRandomlyTab(10);
		display(montab);
		// put(montab, 3, 5);
		// display(montab);
		// permut(montab, 1, 4);
		// display(montab);
		// permut2(montab, 3);
		// display(montab)
		// remove(montab, 2);
		// display(montab);
		// insert(montab, 2, 22);
		// display(montab);

		// int[] tab2 = clone(montab);
		// display(tab2);
		/*
		 * System.out.println(som(montab)); System.out.println(max(montab));
		 * System.out.println(average(montab));
		 */
		// display(even(montab));
		// display(inverse(montab));
		//display(remove2(montab));
	}

	public static void display(int[] tab) {

		for (int i = 0; i < tab.length; i++) {

			System.out.print(tab[i] + "   ");
		}
		System.out.println();
	}

	public static int som(int[] tab) {
		int som = 0;
		for (int i = 0; i < tab.length; i++) {
			som += tab[i];
		}
		return som;

	}

	public static int max(int[] tab) {
		// int max = 0;// attention valeurs negative
		int max = tab[0];
		for (int i = 1; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}

	public static double average(int[] tab) {
		double average = 0;
		for (int i = 0; i < tab.length; i++) {

			average = ((double) som(tab)) / tab.length;
		}
		return average;
	}

	public static int[] createRandomlyTab(int length) {
		int[] tab = new int[length];
		Random rnd = new Random();

		for (int i = 0; i < tab.length; i++) {
			tab[i] = rnd.nextInt(100);

		}
		return tab;
	}

	// ********************************* fonction tableau**********************

	public static void put(int[] tab, int index, int value) {
		tab[index] = value;
	}

	public static void permut(int[] tab, int index1, int index2) {
		int tampon = tab[index1];
		tab[index1] = tab[index2];
		tab[index2] = tampon;
	}

	public static void permut2(int[] tab, int index) {
		permut(tab, index, index - 1);
	}

	// attention length-1------ puisque remove efface la valeur et decalé les
	// autres
	// ************************ remove********************
	public static void remove(int[] tab, int index) {
		for (int i = index; i < tab.length - 1; i++) {
			tab[i] = tab[i + 1];
		}
	}

	// ----------------
	// insert--------------------------------------------------------
	public static void insert(int[] tab, int index, int value) {
		for (int i = tab.length - 1; i > index; i--) {
			tab[i] = tab[i - 1];
		}
		put(tab, index, value);
	}

	// ------------ clone un tableau-------------------------------------
	public static int[] clone(int[] tab) {
		int[] tab2 = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			tab2[i] = tab[i];
		}
		return tab2;
	}

	// ------------------even =nombre
	// paire--------------------------------------

	public static int[] even(int[] tab) {
		int[] tab2 = new int[tab.length];
		int j = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				tab2[j] = tab[i];
				j++;
			}
		}
		return tab2;
	}

	// ---------------inverse-------------------------------------------------------
	public static int[] inverse(int[] tab) {
		int[] tab2 = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			tab2[tab.length - 1 - i] = tab[i];
		}
		return tab2;
	}
	// -----------remove2 avec prendre consideration le debut du
	// tableau------------------

	public static int[] remove2(int[] tab, int index) {
		int[] tab2 = new int[tab.length - 1];
		remove(tab, index);
		for (int i = 0; i < tab.length - 1; i++) {
			tab2[i] = tab[i];
		}
		return tab2;
	}

	// ---------------insert2-------------------------------------------------------
	public static int[] insert2(int[] tab, int index, int value){
		int[] tab2 = new int[tab.length + 1];
		for (int i=0;i<index; i++){
			tab2[i]=tab[i];
					
		}
		tab2[index]=value;
		for (int i=index;i<tab.length;i++){
			tab2[i+1]=tab[i];
		}
		return tab2;
	}
}
