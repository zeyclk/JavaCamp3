package Core;

public class MailLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("Maile loglandı. "+data);
		
	}
	

}
