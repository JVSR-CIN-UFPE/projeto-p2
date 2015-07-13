package util;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Vector;

public privileged aspect persist {
	
	pointcut save() : call(* *.save());
	
	before() : save() {
		// Open connection
	}
	
	void around() : save() {
		try {
			List objects = new Vector();
			
			String file = thisJoinPoint.getTarget().getClass().getSimpleName().toLowerCase();
			ObjectOutput output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("db/" + file + ".txt")));
			
//			thisJoinPoint.getTarget().getClass().getDeclaredFields();
			
			for(Field f : thisJoinPoint.getTarget().getClass().getDeclaredFields()) {
				f.setAccessible(true);
				System.out.println(f.getName());
			}
			
			objects.add(thisJoinPoint.getTarget());
			
			output.writeObject(objects);
			
			output.flush();
			output.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	after() : save() {

		System.out.println(thisJoinPoint.getTarget().getClass().getName());
		
		for(Field fi : thisJoinPoint.getTarget().getClass().getFields()) {
			try {
				Object a = fi.get(thisJoinPoint.getTarget());
				System.out.println("[" + a.getClass().getSimpleName() +"] " + fi.getName() + "=" + a);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
