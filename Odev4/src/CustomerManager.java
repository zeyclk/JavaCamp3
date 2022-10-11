public class CustomerManager {
	private BaseLogger Logger;
	
	public CustomerManager(BaseLogger logger) {
		this.Logger=logger;
	}
	
	public void add()
	 {
		 System.out.println("Müşteri eklendi.");
		 
		 this.Logger.log("log mesajı");
		 
		 /*Aşağıdaki gibi bir sınıfa bağlı kalmak yerine private field eklemek
		  ve onu construucter ile birleştirmek daha kullanışlı
		  */
		 // DatabaseLogger dtLogger=new DatabaseLogger();
		 // dtLogger.Log
	 }
}
