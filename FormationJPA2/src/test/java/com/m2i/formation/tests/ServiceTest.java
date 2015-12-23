package com.m2i.formation.tests;


import org.junit.Test;
import com.m2i.formation.media.entities.Author;
import com.m2i.formation.services.MainService;
import com.m2i.formation.services.ServiceException;




public class ServiceTest {

	@Test 
	public void addAuthorToMediaTest() throws ServiceException {
		
		Author addAuthor= new Author();
		addAuthor.setName("London");
		addAuthor.setSurName("Jack");
		MainService ms =new MainService();
		int mediaId=10;
		ms.addAuthorToMedia(addAuthor, mediaId);
		
	}
	
	
}
