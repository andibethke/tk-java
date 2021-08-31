package de.tk.ab.hm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DasSpielTest {

	@Test
	void testeKonstruktor() {
		try {
			DasSpiel s=new DasSpiel();
			assertTrue(s.getAnzeige().length()>0);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
	}

}
