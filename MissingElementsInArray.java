package week1.day2.Assignment2;

import java.util.Arrays;

public class MissingElementsInArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8};
		Arrays.sort(arr);
		int i = 1;
	    while(i < arr.length) {
			if( arr[i] - arr[i-1] == 1) {
			}
			else {
				
	    System.out.println("missing number " + (arr[i-1] + 1) );
		}
			i++;
	}
	    
	}
	
}
