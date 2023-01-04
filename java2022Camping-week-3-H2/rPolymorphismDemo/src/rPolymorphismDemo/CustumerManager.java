package rPolymorphismDemo;

public class CustumerManager {
	private BaseLogger logger;
	
	public CustumerManager(BaseLogger logger) {
		this.logger= logger;
	}
	
	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("Log mesajı");		
	}
}
