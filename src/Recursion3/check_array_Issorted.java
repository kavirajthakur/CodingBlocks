package Recursion3;
public class  check_array_Issorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,5,4};
		System.out.print(isSorted(arr,0));

	}
	public static boolean isSorted(int[] arr , int i) {
		if(i==arr.length-1) return true;
		if(arr[i]>arr[i+1]) {
			return false;

		}
		return isSorted(arr, i+1);
	}

}
