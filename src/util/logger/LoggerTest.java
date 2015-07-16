package util.logger;

public class LoggerTest {
	
	public static void setPublic(String a) {
		System.out.println("Using setPublic()");
	}
	
	protected static void setProtected(String a) {
		System.out.println("Using setProtected()");
	}
	
	private static void setPrivate(String a) {
		System.out.println("Using setPrivate()");
	}
	
	public static void main(String[] args) {
		
		LoggerTest log = new LoggerTest();
		log.setPublic("Bar");
		log.setProtected("Foo");
		log.setPrivate("Still");
		
	}
	
}
