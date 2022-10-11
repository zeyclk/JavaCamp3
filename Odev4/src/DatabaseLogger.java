
public class DatabaseLogger extends BaseLogger{
	public void log(String message)
	{
		//ortak kod dışındakiler yazılır
		System.out.println("Logged to database : "+message);
	}
}
