package Assignment_3;
import java.util.*;

public class Arrays_Target_Sum_Pairs {


		public static void main(String args[]) {
			int arr[] = {5,1,3,4,2,5,5};
					
			int target = 5;
			doublepair(arr, target);

	        }
		
		
	    public static void doublepair(int [] arr, int target){
	        int n = arr.length;
	        Arrays.sort(arr);
	        for (int i = 0; i < n - 2; i++) {
				for (int j = i + 1; j < n - 1; j++) {
						if (arr[i] + arr[j]== target ) {
							System.out.println(arr[i] + " and " + arr[j]);
						}
					}
				}

	}
}

