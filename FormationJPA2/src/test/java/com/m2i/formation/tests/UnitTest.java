package com.m2i.formation.tests;
import static org.junit.Assert.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.junit.Test;
import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.repositories.EMFSingleton;
import com.m2i.formation.media.repositories.MediaRepository2;


public class UnitTest  {

	/*@Test
	public void entityManagerTest() {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("FormationJPA2");
		assertNotNull(emf);
		EntityManager em =emf.createEntityManager();
		assertNotNull(em);
	}*/
	

	/*@Test
	public void mediaTest()  {
		
		//EntityManagerFactory emf =Persistence.createEntityManagerFactory("FormationJPA2");
		EntityManagerFactory emf = EMFSingleton.getInstance();
		assertNotNull(emf);
		EntityManager em =emf.createEntityManager();
		assertNotNull(em);
		Media m =em.find (Media.class,2);
		assertNotNull(m);
		assertEquals(m.getTitle(),"Les robots");
		assertNotNull(m.getPrice());
		System.out.println("price=" + m.getPrice());
		
	}*/

	/*@Test
	public void addmediaTest(){
		
		EntityManagerFactory emf = EMFSingleton.getInstance();
		EntityManager em =emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		tx.begin();
		TypedQuery rec =  (TypedQuery) em.createQuery("SELECT COUNT (m) FROM Media m");
	    long nbMedia= (long) rec.getSingleResult();
	    //assertEquals(8, nbMedia);
	    //System.out.println(nbMedia);
		 
		
		Media m= new Media();
		//m.setId(8);
		m.setNbPages(192);
		//m.setDateParution(2001-01-01);
		m.setCategory(1);
		m.setTitle("Carrie");
		m.setPrice(8);
		m.setNumISBN(12348);
		em.persist(m);
		tx.commit();
		
		//modif media
	    rec=  (TypedQuery) em.createQuery("SELECT COUNT (m) FROM Media m");
	    long acrMedia= (long) rec.getSingleResult();
		assertEquals(nbMedia+1,acrMedia);
		//System.out.println(acrMedia);
		m.setTitle("samir");
		tx.begin();
		em.persist(m);
		tx.commit();
		//TypedQuery rec =  (TypedQuery) em.createQuery("SELECT COUNT (m) FROM Media m");
		
		//efface media
		tx.begin();
		em.remove(m);
		tx.commit();
		rec =  (TypedQuery) em.createQuery("SELECT COUNT (m) FROM Media m");
		assertEquals(nbMedia,(long) rec.getSingleResult());
		
	}*/
	@Test
	public void getByIdTest(){
		EntityManagerFactory emf = EMFSingleton.getInstance();
		EntityManager em =emf.createEntityManager();
		EntityTransaction tx= em.getTransaction();
		MediaRepository2 mr= new MediaRepository2();
		Media m= mr.getById(1);
		String titleattendu = "Enquete dans le brouillard";
		assertEquals(titleattendu, m.getTitle());
	
		
	
	}

}
