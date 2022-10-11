
public class Main {

	public static void main(String[] args) {
		EmailLogger logger=new EmailLogger();
		logger.log("Log mesajı");
		System.out.println("       ");
		
		//BaseLogger diğer log türleri için ata görevi görürü
		/*Bu yöntem ile her log sınıfı içerisinde metodlar  ekleyip silmek yerine
		 referans alınan sınıfı değiştirmek yeterli olacaktır. 
		 Bununla birlikte yeni eklenecek bir log snıfını da Baselogger dan miras almak yeterli olacaktır. */
		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger()};
		for(BaseLogger loggie:loggers)
		{
			loggie.log("Kayıt");
		}
		System.out.println(" ");
		System.out.println("***** Kullanışlı olan yöntem *****");

		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
