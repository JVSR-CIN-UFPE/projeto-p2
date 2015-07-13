package util.logger;

public class Logger {
	
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
		
		Logger log = new Logger();
		log.setPublic("Hahaha");
		log.setProtected("Hehehe");
		log.setPrivate("Hihihi");
		
	}
	
}
