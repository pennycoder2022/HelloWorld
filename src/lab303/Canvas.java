package lab303;

import java.util.Arrays;
import java.util.Iterator;

public class Canvas {
	public static void main(String[] args) {
		int [] firstArr = new int[] {1,2,3, 4};
		int [] secondArr = new int[] {10,20,30,40, 50, 60, 77};
		
		int [] increasedArray = increaseArraySize(firstArr,secondArr);

		System.out.println(Arrays.toString(increasedArray));
	}
	
	public static int[] increaseArraySize(int[] srcArr, int[] newArr) {
		int lengthSum = srcArr.length + newArr.length;
		
		int[] increasedArray = new int[lengthSum];
		for (int i = 0; i < increasedArray.length; i++) {
			if(i < srcArr.length ) {
				increasedArray[i] = srcArr[i];
			} else {
				increasedArray[i] = newArr[i - srcArr.length];
			}
		}
		
		return increasedArray;
	}
}
