
public class ExceptionHandling_CustomException {

	public static void main(String[] args) {
		int i,j;
		i=8;
		j=9;
		 try {
			 int k = i/j;
			 if (k==0) {
				 throw new CustomException("This is not possible");
			 }
		 }
		 catch(CustomException e)
		 {
			 System.out.println("Error "+e.getMessage());
		 }
	}

}
