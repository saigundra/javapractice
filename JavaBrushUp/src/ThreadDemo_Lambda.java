//To reduce lines of code with Lambda and anonymous class.

public class ThreadDemo_Lambda {

	public static void main(String[] args) throws InterruptedException {
//		Runnable obj1 = () -> {
//			for(int i=1; i<=5; i++) {
//				System.out.println("Hi");
//				try { Thread.sleep(1000);} catch(Exception e) {}
//			}
//		};
//		Runnable obj2 = () -> {
//			for(int i=1; i<=5; i++) {
//				System.out.println("Hello");
//				try { Thread.sleep(1000);} catch(Exception e) {}
//			}
//		};
		
		Thread t1 = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				System.out.println("Hi");
				try { Thread.sleep(1000);} catch(Exception e) {}
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				System.out.println("Hello");
				try { Thread.sleep(1000);} catch(Exception e) {}
			}
		});
		
		//we can set the priority
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		//Thread Priority
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
		
		//Printing thread name
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.start();
		try { Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
		System.out.println(t1.isAlive());
		t1.join();// Mainly used to wait MAIN thread.
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");

	}

}
