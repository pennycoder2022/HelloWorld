package mypackage;
//LEI GARAY 2022-11-23
public class AutoTypeConversion {
	public static void main(String[] args) {
		int x = 20;
		double y = 40.50;
		long p = 30;
		float q = 10.60F;
		//int z = x + y; (1) // Error; Cannot convert from double to int.
		double z = x + y;
		System.out.println("Sum of two numbers: " + z);
		
		//long r = p - q; (2) // Error; cannot convert from float to long.
		float r = p - q;
		System.out.println("Subtraction of two numbers: " + r);
	}
}
