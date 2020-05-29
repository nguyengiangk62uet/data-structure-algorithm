package DataStructure;

import java.util.Arrays;

public class Array {
	
	public static void insertIntoArray(int[] arr, int item, int index) {
		int j = arr.length - 1;
		int k = 0;
		int[] newArr = new int[arr.length + 1];
		while (j >= index) {
			newArr[j + 1] = arr[j];
			j--;
		}
		while (k < index) {
			newArr[k] = arr[k];
			k++;
		}
		newArr[index] = item;
		System.out.println("Original array:" + Arrays.toString(arr));
		System.out.println("After array:" + Arrays.toString(newArr));
	}
	
	public static void deleteItemFromArray() {
		
	}
	
	public static void main(String args[]) {
		int[] a = {1, 2, 3, 4, 5};
		insertIntoArray(a, 10, 3);
	}
}
