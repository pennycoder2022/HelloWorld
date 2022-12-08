package lab303_4_4;

public class MethodExample2 {
	public static int square(int a) {
		return a  * a;
	}
	
	public static void main(String[] args) {
		int result, inputValue = 10;
		
		result = square(inputValue);
		
		System.out.println("Squared value is:" + result);
	}
}
