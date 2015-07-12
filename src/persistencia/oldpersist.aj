package persistencia;

import java.lang.reflect.Field;

public aspect oldpersist {
	
	pointcut save() : call(* *.save());
	
	before() : save() {
		// Make connection
	}
	
	after() : save() {
		
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
