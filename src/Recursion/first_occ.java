package Recursion;

public class first_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,5,5,6,7,8};
		int x = 5;
		System.out.println(firstOcc(arr,x,0));
	

	}
	public static int firstOcc(int [] arr, int x, int i) {
		if(arr[i]==x) {
			return i;
		}
		return firstOcc(arr,x,i+1);
	}

}
