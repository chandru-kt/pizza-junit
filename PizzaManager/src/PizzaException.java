
//Pizza Exception class that extends RuntimeException
public class PizzaException extends RuntimeException{

	//Default no-arg constructor
	public PizzaException() {
		super();
	}
	
	//Constructor that passes the passed String to RuntimeException
	public PizzaException(String msg){
		super(msg);
	}

}
