package Assignment_3;

import java.util.*;


public class TripletSum {

	public static void main(String[] args) {
		int arr[] = {5, 7, 9, 1, 2, 4, 6, 8, 3};
		int target = 10;
		tripletSum(arr, target);
	}

	public static void tripletSum(int arr[], int target) {
		int n = arr.length;
		Arrays.sort(arr);

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
					}
				}
			}
		}
	}
}
