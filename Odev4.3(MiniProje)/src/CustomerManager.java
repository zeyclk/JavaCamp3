
public class CustomerManager {
	
	BaseDatabaseManager databaseManager; 
	//Müşteri bir veritabanı kullanmak zorunda
	//biz ise hepsini içeren sınıfı tanımlarız
	
	public void getCustomers()
	{
		 databaseManager.getData();
	}
}
