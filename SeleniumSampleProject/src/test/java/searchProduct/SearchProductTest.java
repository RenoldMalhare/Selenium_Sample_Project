package searchProduct;

import org.testng.annotations.Test;

public class SearchProductTest {
	@Test
	public void productSearch() {
		String product1 = System.getProperty("P1");
		String product2 = System.getProperty("P2");
		String product3 = System.getProperty("P3");
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
		System.out.println("Product displayed.");
	}

	@Test
	public void productSearchwithmodelNo() {
		System.out.println("Product displayed with model no.");
	}
}
