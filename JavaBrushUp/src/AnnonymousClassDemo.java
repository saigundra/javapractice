class D1{
	public void show() {
		System.out.println("Im D1");
	}
}

//Insted of extending below class and overriding we can use annonymous class .
//class D2 extends D1{
//	public void show() {
//			System.out.println("Im D2");
//		}
//	}
public class AnnonymousClassDemo {

	public static void main(String[] args) {
		//Below code is Annonymous class implementation.
		D1 obj = new D1() {
			public void show() {
				System.out.println("Im D2");
			}
			};
		obj.show();
	}

}
