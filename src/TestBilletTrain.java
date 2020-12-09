import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBilletTrain {
	
	


	@Test (expected=IllegalArgumentException.class)
	public void testDistanceParcourueAuMoins2km() {
		BilletTrain sncf = new BilletTrain(2F);
	}
	
	@Test
	public void testTarifBar�meBordPlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(10,sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(50,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBar�meBordPlusde25kms() {
		BilletTrain sncf = new BilletTrain(25F);
		assertEquals(15,sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde25kms() {
		BilletTrain sncf = new BilletTrain(25F);
		assertEquals(50,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBar�meBordPlusde50kms() {
		BilletTrain sncf = new BilletTrain(50F);
		assertEquals(25,sncf.getTarif(true));
	}
	
	
	@Test
	public void testTarifBar�meContr�lePlusde50kms() {
		BilletTrain sncf = new BilletTrain(50F);
		assertEquals(50,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBar�meBordPlusde100kms() {
		BilletTrain sncf = new BilletTrain(100F);
		assertEquals(35,sncf.getTarif(true));
	}
	
	
	@Test
	public void testTarifBar�meContr�lePlusde100kms() {
		BilletTrain sncf = new BilletTrain(100F);
		assertEquals(50,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBar�meBordPlusde150kms() {
		BilletTrain sncf = new BilletTrain(150F);
		assertEquals(60,sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde150kms() {
		BilletTrain sncf = new BilletTrain(150F);
		assertEquals(90,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBar�meBordPlusde300kms() {
		BilletTrain sncf = new BilletTrain(300F);
		assertEquals(90,sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBar�meContr�lePlusde300kms() {
		BilletTrain sncf = new BilletTrain(300F);
		assertEquals(120,sncf.getTarif(false));
	}
	

}
