package rPolymorphismDemo;

public class Main {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger();
		logger.log("Log mesajı");
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		
		for (BaseLogger logger1 :loggers) {
			logger1.log("Log mesajı");
		}
		
		CustumerManager custumerManager = new CustumerManager(new DatabaseLogger());
		custumerManager.add();
	}

}
