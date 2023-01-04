package loopDemo;

public class Main {

	private static int i = 1;

	public static void main(String[] args) {
		//for    //i++ = i+1 
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("For Döngü bitti");
		
		
		//While
		while(i<10) {
			System.out.println(i);
			i++;
		}

		System.out.println("While döngüsü bitti");
		
		//Do-While
		int j=1;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		System.out.println("Do-While döngüsü bitti");

	}

}
