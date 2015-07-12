package logger;

import java.io.File;

public aspect MyLogger {
	
//	private File logs;
//	
//	pointcut command() : call (* *.*(..)) && within(MyLogger);
//	
//	after() : command() {
//		
//		if (logs == null) { logs = new File("logs.txt"); }
//		
//		else if (!logs.exists()) { 
//			try {
//				logs.createNewFile();
//			} catch(Exception e) {
//				e.printStackTrace();
//			}		
//		}
//		
//		else {
//			System.out.println("call someting");
//		}
//	}
}
