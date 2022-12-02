package mypackage;
//LEI GARAY 2022-11-23
public class ArithmeticOperatorsDemo {
	public static void main(String[] args) {
		int x, y =10, z = 5;	String resulted = " operator resulted in ";
		
		x = y + z;	System.out.println("+" + resulted + x);
		x = y - z;	System.out.println("-" + resulted + x);
		x = y * z;	System.out.println("*" + resulted + x);
		x = y / z;	System.out.println("/" + resulted + x);
		x = y % z;	System.out.println("%" + resulted + x);
		x = y++;	System.out.println("Postfix ++" + resulted + x);
		x = ++z;	System.out.println("Prefix ++" + resulted + x);
		x = -11;	System.out.println("Unary" + resulted + x);
		System.out.println("tooBig becomes " + Double.NEGATIVE_INFINITY);		
		System.out.println("tooSMall becomes " + Double.POSITIVE_INFINITY);		
		System.out.println(Double.NEGATIVE_INFINITY);		
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY);
	}
	
}
