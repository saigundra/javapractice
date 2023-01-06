
public class ArrayEnhancedForloop {

	public static void main(String[] args) {
		int a[][] = {
						{1,2,3,4},
						{2,3,4},
						{3,4,5,6}
					};
		
		//Iterating with Enhanced For Loop
		
		for(int array[] : a) {
			for(int arrayElement : array) {
				System.out.print(" "+arrayElement);
			}
			System.out.println();
		}
	}
}
