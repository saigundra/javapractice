
//Unchecked Exceptions are RuntimeErrors
public class ExceptionHandling_UnChecked {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6] = 0;
			int i=7;
			int j=0;
			int k=i/j;
			System.out.println("Out is "+k);
		}
//		catch(ArithmeticException e) {
//			System.out.println("cannot divide by zero");
//		}
//		catch(IndexOutOfBoundsException e) {
//			System.out.println("Stay in limit");
//		}
		//Multiple catch blocks can write as follows from java1.7
		catch(ArithmeticException  | IndexOutOfBoundsException e) {
			System.out.println("cannot divide by zero");
		}
		catch(Exception e){
			System.out.println("Any Exception can handle");
		}
		finally {
			System.out.println("Finally block execute with or without exception");
		}
	}

}
