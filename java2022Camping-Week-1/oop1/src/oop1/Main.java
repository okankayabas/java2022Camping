package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		// set value
		product1.setName("coffe machine");
		product1.setDiscount(5);
		product1.setUnitsInStock(3);
		product1.setUnitPrice(6000);
		product1.setImageUrl("bilmemne.png");
		
		//System.out.println(product.name + product2.name);
		
		Product product2 = new Product();

		product2.setName("toast machine");
		product2.setDiscount(10);
		product2.setUnitsInStock(6);
		product2.setUnitPrice(1000);
		product2.setImageUrl("bilmemne2.png");

		
		Product product3 = new Product();

		product3.setName("washing machine");
		product3.setDiscount(7);
		product3.setUnitsInStock(42);
		product3.setUnitPrice(8000);
		product3.setImageUrl("bilmemne3.png");

		Product[] products = {product1,product2,product3};

		for (Product product : products) 
		{
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		//IndividualCustomer class'ından gelen
		individualCustomer.setFirstName("onur");
		individualCustomer.setLastName("metin");
		//Customer'den inherit edilen
		individualCustomer.setId(1);
		individualCustomer.setPhone("0555000000");
		
		
		CoorporateCustomer coorporateCustomer = new CoorporateCustomer();
		//CoorporateCustomer class'ından gelen
		coorporateCustomer.setCompanyName("OM Games Company");
		coorporateCustomer.setTaxNumber("xxxxxxxx");
		//Customer'den inherit edilen
		coorporateCustomer.setId(2);
		coorporateCustomer.setPhone("0242000000");
		
		Customer[] customers = {individualCustomer, coorporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}
	}

}
