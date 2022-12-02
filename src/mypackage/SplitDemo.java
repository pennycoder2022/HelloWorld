package mypackage;

import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String vowels = "a::b::c::d:e";

	    // splitting the string at "::"
	    // storing the result in an array of strings
	    String[] result = vowels.split("::",3);
	    

	    // converting array to string and printing it
	    System.out.println("result = " + Arrays.toString(result));
	    System.out.println("result = " + result);
	 
	}
}
