package com.m2i.formation.tests;

import org.junit.*;

import com.m2i.formation.media.entitys.*;

public class EntitiesTests {

	@Test
	public void test() {
		Book b = new Book();
		b.setId(3);
		Assert.assertEquals(3, b.getId());
	}

	@Test
	public void vatPricetest() {
		Media m = new Book();
		m.setId(10);
		// Assert.assertEquals(10.5, m.getVATPrice(), 0.001);
		Assert.assertEquals(12.0, m.getVATPrice(), 0.0001);
	}

	@Test
	public void testFirstTest() {
		Book b = new Book();
		int eval=b.getEvalution();
				Assert.assertEquals(0, eval);
	


	
		
	}

}
