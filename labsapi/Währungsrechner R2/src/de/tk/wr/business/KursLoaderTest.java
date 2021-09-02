package de.tk.wr.business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import de.tk.wr.models.KursModel;

class KursLoaderTest {

	@Test
	void testGetKurse() {
		try {
			List<KursModel> li=new KursLoader().getKurse();
			assertTrue(li.size()>0);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}

}
