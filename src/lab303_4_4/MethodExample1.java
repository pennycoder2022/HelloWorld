package lab303_4_4;

public class MethodExample1 {
	public int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		MethodExample1 me = new MethodExample1();
		int result = me.add(2, 10);
		System.out.println("Sum is:" + result);
	}
}
