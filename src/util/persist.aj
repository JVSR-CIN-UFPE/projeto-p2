package util;

import java.lang.reflect.Field;

public aspect persist {
	
	pointcut save() : execution(* *.save());
	
	before() : save() {
		// Make connection
		System.out.println("Starting connection...");
		System.out.println(thisJoinPoint.getTarget());
		
	}
	
	after() : save() {
		System.out.println("Finishing connection...");

//		System.out.println(thisJoinPoint.getTarget().getClass().getName());
//		
//		for(Field fi : thisJoinPoint.getTarget().getClass().getFields()) {
//			try {
//				Object a = fi.get(thisJoinPoint.getTarget());
//				System.out.println("[" + a.getClass().getSimpleName() +"] " + fi.getName() + "=" + a);
//			
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
	}
	
}
