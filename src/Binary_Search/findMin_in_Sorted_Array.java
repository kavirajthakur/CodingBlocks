package Binary_Search;

public class findMin_in_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {3,4,5,6,7,8,9,1,2};
		System.out.println(findMin(a));

	}
	public static int findMin(int []a) {
		int n = a.length;
		int st=0,end=n-1;
		int ans =-1;
		while(st<=end) {
			int mid = st+(end-st)/2;
			if(a[mid]<=a[n-1]) {
				ans = mid;
				end = mid -1;
			}else {
				st= mid+1;
			}
		}

	return ans;
		
	}

}
