package javaCamp_3;

public class EmailLogger extends BaseLogger{
	
	public void log(String message)
	{
		System.out.println("Log to email: " + message); //log overriding 
	}

}
