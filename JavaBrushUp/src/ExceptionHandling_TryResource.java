import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling_TryResource {

	public static void main(String[] args) throws IOException {
		int n = 0;
		System.out.println("Enter a number");

		// BufferReader is Resource
		// We can write Try block without catch and finally which is introduced in java
		// 7
		// the resource is BufferReader object as the class implements the interface
		// java.lang.AutoCloseable and it will be closed whether the try block executes
		// successfully or not which means that you won't have to write br.close()
		// explicitly.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			n = Integer.parseInt(br.readLine());
		}

		System.out.println(n);
	}

}
