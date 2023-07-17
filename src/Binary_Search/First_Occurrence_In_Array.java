package Binary_Search;

public class First_Occurrence_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,5,5,6,7,8};
		int x = 5;
		System.out.println(firstOcc(arr,x));
	

	}
	public static int firstOcc(int [] arr, int x) {
		int n = arr.length;
		int st=0,end=n-1;
		int fo = -1;
		while(st<=end) {
			int mid = st+(end-st)/2;
			if(arr[mid]==x) {
				fo=mid;
				end = mid-1;
			}else if(x<arr[mid]) {
				end = mid-1;
			}else {
				st=mid+1;
			}
		}
		return fo;
	}

}
