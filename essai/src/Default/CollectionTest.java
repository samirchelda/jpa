package Default;
import java.util.ArrayList;
import java.util.List;

import com.m2i.formation.media.entitys.Author;
import com.m2i.formation.media.entitys.Book;
import com.m2i.formation.media.entitys.Item;
import com.m2i.formation.media.entitys.MediaException;
import com.m2i.formation.media.entitys.PublisherBook;;


public class CollectionTest {

	public List<Book> ListTest() throws MediaException {

		List<Book> listTest = new ArrayList<Book>();

		Book b1 = new Book();
		b1.setId(123);
		b1.setTitle("Java");
		
		Book b2 = new Book();
		b2.setId(1234);
		b2.setTitle("Java2");
		
		Book b3 = new Book();
		b3.setId(12345);
		b3.setTitle("Java3");
		
		
		
		/*Author aut1 = new Author();
		aut1.setFirstName("Samir");
		aut1.setLastName("chelda");
		
		Author aut2 = new Author();
		aut2.setFirstName("Samir2");
		aut2.setLastName("chelda2");
		
		Author aut3 = new Author();
		aut3.setFirstName("Samir3");
		aut3.setLastName("chelda3");

		PublisherBook publisher1 = new PublisherBook();
		PublisherBook publisher2 = new PublisherBook();
		PublisherBook publisher3 = new PublisherBook();*/

		listTest.add(b1);
		listTest.add(1,b1);
		
		
		listTest.add(b2);
		listTest.add(b3);
		
		listTest.remove(2);
		listTest.add(2, b1);
		
		return listTest;

	}

}
