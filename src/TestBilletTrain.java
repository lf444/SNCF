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
	public void testTarifBarêmeBordPlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(10,sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBarêmeContrôlePlusde2kms() {
		BilletTrain sncf = new BilletTrain(2.5F);
		assertEquals(50,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBarêmeBordPlusde25kms() {
		BilletTrain sncf = new BilletTrain(25F);
		assertEquals(15,sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBarêmeContrôlePlusde25kms() {
		BilletTrain sncf = new BilletTrain(25F);
		assertEquals(50,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBarêmeBordPlusde50kms() {
		BilletTrain sncf = new BilletTrain(50F);
		assertEquals(25,sncf.getTarif(true));
	}
	
	
	@Test
	public void testTarifBarêmeContrôlePlusde50kms() {
		BilletTrain sncf = new BilletTrain(50F);
		assertEquals(50,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBarêmeBordPlusde100kms() {
		BilletTrain sncf = new BilletTrain(100F);
		assertEquals(35,sncf.getTarif(true));
	}
	
	
	@Test
	public void testTarifBarêmeContrôlePlusde100kms() {
		BilletTrain sncf = new BilletTrain(100F);
		assertEquals(50,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBarêmeBordPlusde150kms() {
		BilletTrain sncf = new BilletTrain(150F);
		assertEquals(60,sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBarêmeContrôlePlusde150kms() {
		BilletTrain sncf = new BilletTrain(150F);
		assertEquals(90,sncf.getTarif(false));
	}
	
	@Test
	public void testTarifBarêmeBordPlusde300kms() {
		BilletTrain sncf = new BilletTrain(300F);
		assertEquals(90,sncf.getTarif(true));
	}
	
	@Test
	public void testTarifBarêmeContrôlePlusde300kms() {
		BilletTrain sncf = new BilletTrain(300F);
		assertEquals(120,sncf.getTarif(false));
	}
	

}
