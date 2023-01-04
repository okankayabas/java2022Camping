package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		int enBüyük = sayi1;
		
		if(enBüyük<sayi2) {
			enBüyük = sayi2;
		}
		if(enBüyük<sayi3) {
			enBüyük = sayi3;
		}
		
		System.out.println("En Büyük = "+enBüyük);
		
	}

}
