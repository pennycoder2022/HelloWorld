package lab303_4;

import java.util.Arrays;

public class Labs {
	//PER SCHOLAS - TEK SYSTEMS - LEI GARAY - 2022 
	public static void main(String[] args) {
		//lab01_arraysSort();
		String[] names = {"Carol", "Bob", "Alice", "John", "Tim", "Kate", "Mary"};
		lab02_arrayBinarySearch(names, "Mary");
	}

	private static void lab01_arraysSort() {
		int[] integers = { 30, 57, 88, 12, 34, 54, 90, 62, 82, 10 };
		System.out.println("Before sort: " + Arrays.toString(integers));
		
		int unsorted = 0;
		
		for (int i = 0; i < integers.length; i++) {
			//compares the integer at current index with the element of the next index
			//switches if necessary and adds to unsorted count
			if(i < integers.length - 1) { // makes sure it does not go past second to last when comparing
				if(integers[i + 1] < integers[i]) {
					int lesser = integers[i + 1]; //store lesser value
					integers[i + 1] = integers[i];//switching
					integers[i] = lesser;//switching
					unsorted++; //adds one to unsorted count
				} 
			}
			//checks if it is sorted using unsorted count when it reaches end of array
			//if unsorted count is not zero then it resets both loop index and unsorted count
			if(i == integers.length - 1 && unsorted > 0) {
				i = -1; //-1 because when it reaches the for loop statement it adds one making zero
				unsorted = 0; //unsorted count reset
			}
		}

		System.out.println("After sort: " + Arrays.toString(integers));
	}
	private static String[] lab01_arraysSort(String[] inStrArr) {
		//System.out.println("Before sort: " + Arrays.toString(inStrArr));
		
		int unsorted = 0;
		
		for (int i = 0; i < inStrArr.length; i++) {
			//compares the string at current index with the element of the next index
			//switches if necessary and adds to unsorted count
			if(i < inStrArr.length - 1) { // makes sure it does not go past second to last when comparing
				if(inStrArr[i + 1].compareTo(inStrArr[i]) < 0) {
					String lesser = inStrArr[i + 1]; //store lesser value
					inStrArr[i + 1] = inStrArr[i];//switching
					inStrArr[i] = lesser;//switching
					unsorted++; //adds one to unsorted count
				} 
			}
			//checks if it is sorted using unsorted count when it reaches end of array
			//if unsorted count is not zero then it resets both loop index and unsorted count
			if(i == inStrArr.length - 1 && unsorted > 0) {
				i = -1; //-1 because when it reaches the for loop statement it adds one making zero
				unsorted = 0; //unsorted count reset
			}
		}

		//System.out.println("After sort: " + Arrays.toString(inStrArr));
		return inStrArr;
	}
	private static Integer lab02_arrayBinarySearch(String[] inStrArr, String element) {
		Integer index = null, alpha = 0, mid = inStrArr.length/2, 
				omega = inStrArr.length, maxSplits = (int) (Math.log(inStrArr.length) / Math.log(2));;
		inStrArr = lab01_arraysSort(inStrArr);
        
        for (int i = 0; i <= maxSplits; i++) {
        	String strToCompare = inStrArr[mid];
        	
        	if(element.compareTo(strToCompare) == 0) {
        		index = mid;
        	} else if(element.compareTo(strToCompare) > 0) {
        		alpha = mid;
        		mid = alpha + (omega - alpha)/2;
        	} else {
        		omega = mid;
        		mid = (alpha + omega)/2;
        	}       	
        }
        System.out.println(element==null? element + " could not be found in array":element + " is at " + index);

        return index;
	}
}
