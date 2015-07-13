
public aspect Debug {

	pointcut debug() : call(* *.*(..)) && !within(Debug);
	
	after() : debug() {
		
	}
}
