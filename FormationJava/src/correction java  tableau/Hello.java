

public class Hello {

	/**
	 * Fonction add
	 * @param i Premier paramètre
	 * @param j Deuxième paramètre
	 * @return retourne l'addition de i et j
	 */
	public static int add(int i, int j) {
		return i + j;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Hello World");
		int i = 3;
		int j = 4;
		System.out.println(i);
		System.out.println(j);
		int k = j;
		j = i;
		i = k;
		System.out.println(i);
		System.out.println(j);
		
		
		for(i=0;i<100;i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		for(i=10;i>0;i--) {
			System.out.print(i+ " ");
		}
		System.out.println("BOOOOM");
		
		j = 1;
		for(i=0;i<10;i++) {
			j *= 2;
			System.out.print(j+" ");
		}
		System.out.println();

		int toTest = 2;
		for(i=0;i<500;i++) {
			boolean isPrime = true;
			j = 2;
			while(isPrime && j<toTest) {
				if(toTest % j == 0) {
					isPrime = false;
				}
				j++;
			}
			if(isPrime) {
				System.out.println(toTest);
			}
			toTest++;
		}
		
		System.out.println(add(2,3));
		*/
		int[] tab = {2,6,9,-10,0,5,77,99,4,10};
		//int[] tab = createRandomlyTab(10);
		display(tab);
		System.out.println(sum(tab));
		System.out.println(max(tab));
		System.out.println(average(tab));
		put(tab,2,99);
		display(tab);
		permut(tab,2,4);
		display(tab);
		permut2(tab,3);
		display(tab);
		remove(tab,3);
		display(tab);
		insert(tab,3,88);
		display(tab);
		int[] tab2 = clone(tab);
		display(tab2);
		display(clone(tab));
		display(even(tab));
		
	}
	
	public static void display(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}
	
	public static int sum(int[] tab) {
		int total = 0;
		for(int i = 0;i < tab.length; i++) {
			//total = total + tab[i];
			total += tab[i];
		}
		return total;
	}
	
	public static int max(int[] tab) {
		int max = tab[0];
		for(int i=1;i<tab.length;i++) {
			if(tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}
	
	public static double average(int[] tab) {
		return ((double)sum(tab)) / tab.length;
	}
	
	public static int[] createRandomlyTab(int length) {
		int[] tab = new int[length];
		Random rnd = new Random();
		
		for(int i=0;i<tab.length;i++) {
			tab[i] = rnd.nextInt(100);
		}
		return tab;
	}
	
	public static void put(int[] tab, int index, int value) {
		tab[index]=value;
	}
	
	public static void permut(int[] tab, int index1, int index2) {
		int tampon = tab[index1];
		tab[index1] = tab[index2];
		tab[index2] = tampon;
	}
	
	public static void permut2(int[] tab, int index) {
		permut(tab,index,index-1);
	}
	
	public static void remove(int[] tab, int index ) {
		for(int i=index; i<tab.length - 1; i++) {
			tab[i]=tab[i+1];
		}
	}
	
	public static void insert(int[] tab, int index, int value ) {
		for(int i=tab.length - 1; i > index; i--) {
			tab[i]=tab[i-1];
		}
		put(tab,index,value);
	}
	
	public static int[] clone(int[] tab) {
		int[] tab2 = new int[tab.length];
		for(int i=0;i<tab.length;i++) {
			tab2[i] = tab[i];
		}
		return tab2;
	}
	
	public static int[] even(int[] tab) {
		int[] tab2 = new int[tab.length];
		int i2 = 0;
		for(int i=0; i<tab.length;i++) {
			if(tab[i] % 2 == 0) {
				tab2[i2] = tab[i];
				i2++;
			}
		}
		return tab2;
	}
	
	public static int[] inverse(int[] tab) {
		int[] tab2 = new int[tab.length];
		for(int i=0; i<tab.length;i++) {
			tab2[tab.length - 1 - i] = tab[i];
		}
		return tab2;
	}
	
	public static int[] remove2(int[] tab, int index) {
		int[] tab2 = new int[tab.length - 1];
		remove(tab,index);
		for(int i=0;i<tab.length - 1;i++) {
			tab2[i] = tab[i];
		}
		return tab2;
	}
	
	public static int[] insert2(int[] tab, int index, int value) {
		int[] tab2 = new int[tab.length + 1];
		for(int i=0;i<index;i++) {
			tab2[i] = tab[i];
		}
		tab2[index] = value;
		for(int i=index;i<tab.length;i++) {
			tab2[index + 1] = tab[index];
		}
		return tab2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
