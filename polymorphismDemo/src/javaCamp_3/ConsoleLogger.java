package javaCamp_3;

public class ConsoleLogger extends BaseLogger{
	
	public void log(String message)
	{
		System.out.println("Log to console: " + message); // log overriding 
	}

}
