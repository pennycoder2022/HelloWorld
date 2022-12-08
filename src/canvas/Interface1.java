package canvas;

public interface Interface1 {
	public static void sayHi() {
		System.out.println("Interface1 - sayHi(): Hi");
	}
	
	private static void eat() {
		System.out.println("Interface1 - eat(): Eating");
	}
	
	// interface- private 
	// if private access modifier is used on a method in an interface, it should be used locally.
	//  otherwise it would never be used.
	
	abstract void protectedMethod1();
	public default void protectedMethod2() {
		System.out.println("Interface1 - protectedMethod2(): method 2");
	}
	
	
	// only public, private, abstract, default, static, and strictfp
	
	public abstract void sayAh();
}
