package util.persistencia;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Vector;

import p2.entidades.Livro;

public privileged aspect persist {
	
	pointcut save() : call(* *.save());
	
	final String DIR = "db/";
	
	before() : save() {
		// Open connection
		try {
			String file = DIR + thisJoinPoint.getTarget().getClass().getSimpleName().toLowerCase();
			File a = new File(file);
			
			// Create if does not exist
			if(!a.exists()) {
				a.createNewFile();
				System.out.println("Created a new file");
			}
			
			// Start buffer
//			if(new FileInputStream(a).available() == 0) {
//				ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(a)));
//				oos.flush();
//				oos.close();
//				System.out.println("Writing a empty file");
//			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("unchecked")
	void around() : save() {
		
		Object target = thisJoinPoint.getTarget();
		
		try {
			String file = DIR + target.getClass().getSimpleName().toLowerCase();
			
			List objects = new Vector();
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while(br.ready()) {
				br.readLine();
//				objects.add((Livro)ois.readObject());
				System.out.println("reading...");
			}
			
//			ois.close();
			
			System.out.println("Quantit: " + objects.size());
			
			// Insert new TODO: Change save to create a new or update a knowledge
//			if(is_new(thisJoinPoint.getTarget())) {
				objects.add((Livro)set_model_id(target, objects.size() + 1));
				System.out.println(is_new(target));
//			}
			System.out.println(objects.size());
			
			Field id = target.getClass().getSuperclass().getDeclaredField("__internal_id__");
			id.setAccessible(true);
			System.out.println("Your internal ID is: "+id.get(target));
			
			ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			
			for(Object obj : objects) {
				oos.writeObject(obj);
				System.out.println("Saved?");
			}
			
			System.out.println("Go close file");
			
			oos.flush();
			oos.close();
			
			System.out.println("File closed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean is_new(Object target) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field id = target.getClass().getSuperclass().getDeclaredField("__internal_id__");
		id.setAccessible(true);
		return (id.get(target) == null);
	}
	
	private Object set_model_id(Object target, int id_max) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field id = target.getClass().getSuperclass().getDeclaredField("__internal_id__");
		id.setAccessible(true);
		id.set(target, new Integer(id_max));
		return target;
	}
}
