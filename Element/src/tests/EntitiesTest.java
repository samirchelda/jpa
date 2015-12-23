package tests;



import org.junit.Assert;
import org.junit.Test;

import com.m2i.formation.element.*;
import com.m2i.formation.element.entities.Semiconductor;



public class EntitiesTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {

		Semiconductor sc = new Semiconductor();
		sc.setId(2);
		sc.setGroupeSC("III-V");
		sc.setSemiconducteur("InP");
		sc.setEg(1.42);
		// Assert.assertEquals("III", sc.getGroupeSC());
		Assert.assertEquals("InP", sc.getSemiconducteur());

	}

	@Test
	public void test1() {
		Semiconductor a = new Semiconductor();
		a.setId(4);
		a.setGroupeSC("II-V");
		Assert.assertEquals(4, a.getId());

	}

	@Test
	public void test2() {
		Semiconductor sc = new Semiconductor();
		sc.setdopagep();
		sc.setSemiconducteur("InP");
		sc.setId(2);
		Assert.assertEquals(2, sc.getId());

	}

}
