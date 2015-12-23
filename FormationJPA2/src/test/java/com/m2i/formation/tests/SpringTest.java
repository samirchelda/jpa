package com.m2i.formation.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.repositories.IRepository;
import com.m2i.formation.media.repositories.MediaRepository;
import com.m2i.formation.services.MainService;

public class SpringTest {

	@Test
	public void Test1() {
        
		@SuppressWarnings("deprecation")
		BeanFactory m = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		assertNotNull(m);
	}
	@Test
	public void FactoryGener() {
	 
		@SuppressWarnings("deprecation")
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		// ou comme 
		ApplicationContext  factory = new ClassPathXmlApplicationContext("spring.xml");

      
		Media med=  (Media)factory.getBean("media");
		assertNotNull(med);
		MediaRepository mr= factory.getBean("mediaRepository",MediaRepository.class);
		//ou comme 
		IRepository <Media> mm= (IRepository<Media>) factory.getBean("mediaRepository");
		assertNotNull(mr);
	}
	public void Maintest(){
		
		ApplicationContext  factory = new ClassPathXmlApplicationContext("spring.xml");
		MainService  service = factory.getBean("MainService", MainService.class);
		assertNotNull(service);
		assertNotNull(service.getAuthorRepository());
		assertNotNull(service.getMediaRepository());
		
	}
;

	

	

}

