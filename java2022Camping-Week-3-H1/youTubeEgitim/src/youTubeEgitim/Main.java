package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {10,20,30};
		sayilar1 = sayilar2;
		
		sayilar2[0]=1000;
		
		System.out.println(sayilar1[0]);
		
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Custumer custumer = new Custumer();
		custumer.id= 1;		
		custumer.City = "Tekirdag";
					
		Company company = new Company();
		company.TaxNumber= "12346";
		company.CompanyName = "Arçelik";
		company.id = 100;
			
		Person person = new Person();
		person.NationalIdentity= "";
		
		Custumer custumer1 = new Custumer();
		Custumer custumer2 = new Person();
		Custumer custumer3 = new Company();
		
		CustumerManager custumerManager = new CustumerManager(new Custumer(), new MilitaryCreditManager());
		custumerManager.GiveCredit();
		
		
	}

}
