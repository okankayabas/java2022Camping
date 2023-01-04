package rabstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	
	//override edilemez
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
