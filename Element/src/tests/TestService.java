package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.m2i.formation.element.entities.Semiconductor;
import com.m2i.formation.element.service.MonService;


public class TestService {

	@Test
	public void testaddSemiconductorToElementchimi() {
		Semiconductor addsc =new Semiconductor();
		addsc.setGroupeSC("groupeSC");
		addsc.setSemiconducteur("semiconducteur");
		MonService ms =new MonService();
		int ElementchimiId=3;
		ms.addSemiconductorToElementchimi(addsc, ElementchimiId);
	}

}
