import java.util.Scanner;

public class UserInput_Scanner {

	public static void main(String[] args) {
		int n=0;
		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
		}
		System.out.println(n);
	}

}
