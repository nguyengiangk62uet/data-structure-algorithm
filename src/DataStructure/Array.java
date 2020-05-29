package DataStructure;

import java.util.Arrays;

public class Array {
	
	public static void insertIntoArray(int[] arr, int item, int index) {
		System.out.println("Insert into array:");
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
	
	public static void deleteItemFromArray(int[] arr, int index) {
		System.out.println("Delete item from array:");
		int[] newArr = new int[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) continue;
			newArr[k++] = arr[i];
		}
		System.out.println("Original array:" + Arrays.toString(arr));
		System.out.println("After array:" + Arrays.toString(newArr));
	}
	
	public static void main(String args[]) {
		int[] a = {1, 2, 3, 4, 5};
		insertIntoArray(a, 10, 3);
		deleteItemFromArray(a, 2);
	}
}
