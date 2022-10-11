
public class Main {

	public static void main(String[] args) {
		//Müşteri nesnesine bir veritabanı sınıfı atanmalı 
		//yoksa metod içerisindeki databaseManager alanı hata verir
		//veritabanı değişmesi halinde aşağıdaki tanımı değiştirmek yeterli olacaktır
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.databaseManager=new OracleDatabaseManager();
		customerManager.getCustomers();

	}

}
