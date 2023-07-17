package Recursion;

public class last_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,5,5,6,7,8};
		int x = 5;
		System.out.println(lastOcc(arr,x,0));
	

	}
	public static int lastOcc(int [] arr, int x, int i) {
		if(arr.length==i) {
			return -1;
		}
		if(arr[i]==x) {
			return i;
		}
		return lastOcc(arr,x,i+1);
	}

}
