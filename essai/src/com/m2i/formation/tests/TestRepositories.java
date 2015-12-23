package com.m2i.formation.tests;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;
import com.m2i.formation.media.entitys.Book;
import com.m2i.formation.media.repositorys.BookRepository;

public class TestRepositories {

/*	@Test
	public void test() {
	}

	BookRepository l = new BookRepository();

	@Test
	public void TestBookRepositoriesgetAll() {

		List<Book> bo = new ArrayList<Book>();

		l.SetUri("C:\\Users\\adminlocal\\Documents\\samir\\essai\\livres.csv");
		try {
			bo = l.getAll();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals(3, bo.size());

	}

	@Test
	public void TestBookRepositoriesgetByPrice() {

		List<Book> bo = new ArrayList<Book>();

		l.SetUri("C:/Users/adminlocal/Documents/samir/essai/livres.csv");
		try {
			bo = l.getByPrice(10.00);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals(3, bo.size());

	}

	@Test
	public void insertBookTest() throws IOException {

		Book b = new Book();
		b.setTitle("Java");
		b.setPrice(9.99);
		BookRepository br = new BookRepository();
		int nbBook;

		try {
			nbBook = br.getAll().size();
			br.insert(b);
			Assert.assertEquals(nbBook + 1, br.getAll().size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/

	@Test
	public void getAll() throws Exception {
		BookdbRepository br = new BookdbRepository();
		List<Book> bo;
		bo = br.getAll();
		Assert.assertTrue(bo.size() > 0);
		

	}

}
