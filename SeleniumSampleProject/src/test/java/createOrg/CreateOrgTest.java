package createOrg;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test
	public void createOrg() {
		String product1 = System.getProperty("P1");
		String product2 = System.getProperty("P2");
		System.out.println(product1);
		System.out.println(product2);
		System.out.println("Org created");
	}

	@Test
	public void createOrgWithAddress() {
		System.out.println("Org created with Address");
	}
}
