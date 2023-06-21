package java_oops_15thApr_2023;

public class Dummy extends Concept{

	public static void main(String[] args) {
		
		//Can I create the object of the Abstract Class ???
		// No we can not , An abstract class cannot be instantiated on its own.
		// so it does not make much sense to have instance variables inside abstract class
		
		//Concept abstractparent = new Concept(); "This is an error "
		
		Concept ref = new Dummy();
		ref.sample();
		ref.world();
		ref.logic(10);

	}

	@Override
	public void sample() {
		System.out.println("This is over-ridden, implimentes method");
		
	}

	@Override
	public void world() {
		System.out.println("This is over-ridden, implimented method world");
		
	}

	@Override
	public void logic(int i) {
		System.out.println("This is over-ridden, implemented method with one int parameter");
		
	}

}
