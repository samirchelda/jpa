package essai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.m2i.formation.geometry.*;
import com.m2i.formation.media.entitys.*;

import Default.CollectionTest;
import Default.Singleton;
import Default.TestFile;

public class Refaire {

	private static Object piistTest;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] tab = { 2, 6, 8, 10, 1, 0, 99, 50, 6, 8 };
		// int []tab= createmonRAndomTab(10);
		// display(tab);
		// System.out.println(sum(tab));
		// System.out.println(max(tab));
		// System.out.println(average(tab));
		// put(tab, 0, 100);
		// permut(tab, 1, 2);
		// permut2(tab, 5);
		// insert(tab, 2, 1);
		// remove(tab, 2);
		// even(tab, 2);

		// display(clone(tab));
		// display(inverse(tab));
		// display(remov2(tab, 2));
		// display(insert2(tab, 5, 2));
		// display(tribulle(tab));

		/*
		 * Book b = new Book(); 
		 * b.setTitle("java");
		 * System.out.println(b.getTitle()); 
		 * Book livre1 = new Book(); Book
		 * livre2 = new Book(); 
		 * livre1.setId(100); 
		 * livre1.setLang("Fr-fr");
		 * livre2.setId(100); 
		 * livre2.setLang("Fr-fr"); Book livre3 = new Book();
		 * livre3.setId(livre1.getId()); 
		 * livre3.setLang(livre1.getLang()); if
		 * (livre1 == livre3) { System.out.println(" identiques"); }
		 * System.out.println(" differents"); //
		 * **************************************** /* Book b = new Book();
		 * b.addAuthor(authors1); b.setPublisherBook(editor);
		 */
		// ---------------------------------------------
		/*
		 * PublisherBook editor = new PublisherBook(); 
		 * editor.setDate("2001");
		 * editor.setNom("Eric"); b.setPublisherBook(editor);
		 * 
		 * // --------------------------------------------- /* Author a1 = new
		 * Author(); a1.setFirstName("Bernard");
		 *  a1.setLastName( " Gruzza");
		 * b.addAuthor(a1); // -----------------------------------------------
		 * Author a2 = new Author(); a2.setFirstName("Samir"); a2.setLastName(
		 * " Chelda"); b.addAuthor(a2);
		 */

		// ************************counter***********
		/*
		 * Counter c1=new Counter(); 
		 * System. out.println(c1.increment());
		 * System. out.println(c1.increment()); System.
		 * out.println(c1.increment()); Counter c2=new Counter(); System.
		 * out.println(c2.increment()); System. out.println(c2.increment());
		 * System. out.println(c2.increment());
		 */
		// System.out.println(Counter.increment());
		// b.setCategory(BookCaterory.Computer);
		// Book livrefinal = new Book();
		// livrefinal.setLang("Fr-fr");
		// livrefinal.setIsbn("112-annee-2000");
		// livrefinal.setNbPage(100);

		// Cd cd1 = new Cd();
		// cd1.setNbTrack(3);

		// Dvd dvd1 = new Dvd();
		// dvd1.setRegion(2);

		// Point3D 3d=new Point3D();
		// 3d.
		// Media b = new Book();
		/*
		 * Media m = new Book(); m.setPrice(10); // m.getVATPrice();
		 * System.out.println(m.getVATPrice());
		 * 
		 * Media mus = new Cd(); mus.setPrice(10); // mus.getVATPrice();
		 * System.out.println(mus.getVATPrice());
		 * 
		 * Media rire = new Dvd(); rire.setPrice(10); // mus.getVATPrice();
		 * System.out.println(rire.getVATPrice()); Book b = new Book();
		 * b.setTitle("java");
		 */

		/*
		 * Author al=new Author(); al.setLastName("Samir"); try{
		 * b.addAuthors(a1); Author a2 = new Author(); a2.setLastName("toto");
		 * b.addAuthor(a2); } catch (MediaException e)
		 * 
		 * }
		 */
		//Book b = new Book();
		/*
		 * CollectionTest test = new CollectionTest();
		 * 
		 * List<Book> i = test.ListTest(); for (Book b5 : c.i) {
		 * System.out.println(b5.getTitle());
		 * 
		 * }
		 */
		/*Media cd1 = new Cd();
		Media dvd1 = new Dvd();
		Media book1 = new Book();
		Cart maCart=new Cart();
		maCart.getMedias();
	    maCart.getMedias().add(b);
		maCart.getMedias().add(b2);
		maCart.getMedias().add(b3);*/
		
	TestFile tf =new TestFile();
	try {
		tf.readFile("C:/Users/adminlocal/Documents/samir/essai/livres.csv");
	} catch (Exception e) {
		// TODO: handle exception
	}
	Singleton singleton=Singleton.getInstance();
			
	
		

	}

	// --------------------------------------------------------------------
	public static void display(int[] tab) {

		for (int i = 0; i < tab.length; i++) {

			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	// ***** somme*****************
	public static int sum(int[] tab) {
		int total = 0;
		for (int i = 0; i < tab.length; i++) {
			total += tab[i];

		}
		return total;

	}

	public static int max(int[] tab) {
		int max = tab[0];
		for (int i = 1; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;

	}

	public static double average(int[] tab) {
		return ((sum(tab)) / tab.length);

	}

	public static int[] createmonRAndomTab(int length) {

		int[] tab = new int[length];
		Random rnd = new Random();
		for (int i = 0; i < tab.length; i++) {
			tab[i] = rnd.nextInt(100);

		}

		return tab;
	}

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

	public static void insert(int[] tab, int index, int value) {
		for (int i = tab.length - 1; i > index; i--) {
			tab[i] = tab[i - 1];

		}
		put(tab, index, value);
	}

	public static void remove(int[] tab, int index) {
		for (int i = index; i < tab.length - 1; i++) {
			tab[i] = tab[i + 1];
		}

	}

	public static int[] even(int[] tab) {

		int[] tab2 = new int[tab.length];
		int j = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] / 2 == 0) {
				tab2[j] = tab[i];
				j++;
			}
		}

		return tab2;

	}

	public static int[] clone(int[] tab) {
		int[] tab2 = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			tab2[i] = tab[i];
		}

		return tab2;

	}

	public static int[] inverse(int[] tab) {
		int[] tab2 = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			tab2[tab.length - 1 - i] = tab[i];
		}
		return tab2;

	}

	public static int[] remov2(int[] tab, int index) {
		int[] tab2 = new int[tab.length - 1];
		remove(tab, index);
		for (int i = 0; i < tab.length - 1; i++) {
			tab2[i] = tab[i];
		}

		return tab2;

	}

	public static int[] insert2(int[] tab, int index, int value) {
		int[] tab2 = new int[tab.length + 1];
		for (int i = 0; i < index; i++) {
			tab2[i] = tab[i];
		}

		tab2[index] = value;
		for (int i = index; i < tab.length; i++) {
			tab2[index + 1] = tab[index];
		}

		return tab2;

	}

	public static int[] tribulle(int[] tab) {
		int j = 1;

		while (j <= tab.length) {
			for (int i = 0; i < tab.length - j; i++) {
				if (tab[i] > tab[i + 1]) {
					permut2(tab, i + 1);
				}
			}
			j++;
		}
		return tab;

	}

	public static int[] tribullemin(int[] tab) {
		int min = tab[0];
		for (int i = 1; i < tab.length; i++) {
			if (tab[i] < min) {
				min = tab[i];
			}

		}
		return tab;

	}

}
