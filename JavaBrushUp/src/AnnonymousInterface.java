interface Abb{
	public void show();
}
public class AnnonymousInterface {

	public static void main(String[] args) {
		Abb obj = new Abb() {

			@Override
			public void show() {
				System.out.println("Annonymous Interface implementation");
			}
			
		};
		obj.show();
	}

}
