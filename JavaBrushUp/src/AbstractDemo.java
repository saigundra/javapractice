abstract class Human{  // Abstract class.
	public abstract void eat(); //Declaring method (Abstract Method) 
	
	public void walk() { //Defined method(Non abstract method)
		
	}
}

class Man extends Human{  //Concrete Class

	public void eat() {   //Abstract method must be defined in concrete class.
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		Human obj = new Man();
	}

}
