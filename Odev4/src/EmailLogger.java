
public class EmailLogger extends BaseLogger{
	public void log(String message)
	{
		//ortak kod dışındakiler yazılır
		System.out.println("Logged to email : "+message);
	}
}
