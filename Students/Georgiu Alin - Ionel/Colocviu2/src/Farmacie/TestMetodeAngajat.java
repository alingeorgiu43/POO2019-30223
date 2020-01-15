package Farmacie;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMetodeAngajat {

	@Test
	void testGetStoc() {
		
		AngajatFarmacie angajat= new AngajatFarmacie("Altul", 3);
		
		assertEquals(angajat.getNume(),"Altul");
	}

}
