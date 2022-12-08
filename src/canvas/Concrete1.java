package canvas;

public class Concrete1 extends Abstract1 implements Interface1 {

	@Override
	public void sayAh() {
		System.out.println("ConcreteClass1 - sayAh(): Ah!");
	}

	@Override
	public void protectedMethod1() {
		System.out.println("Concrete1 - protectedMethod1(): method 1");
	}

	@Override
	void doSomething() {
		// TODO Auto-generated method stub
		
	}

}
