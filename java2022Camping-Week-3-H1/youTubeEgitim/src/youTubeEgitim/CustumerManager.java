package youTubeEgitim;

public class CustumerManager {
	private Custumer _custumer;
	private ICreditManager _creditManager;
	
	public CustumerManager(Custumer custumer, ICreditManager creditManager) {
		_custumer = custumer;
		_creditManager = creditManager;
	}
	public void Save() {
		System.out.println("Müşteri kaydedildi : ");
	}
	public void Delete() {
		System.out.println("Müşteri silindi : ");
	}
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
	}
	
}
