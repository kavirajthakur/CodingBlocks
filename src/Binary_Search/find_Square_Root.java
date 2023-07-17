package Binary_Search;

public class find_Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 24;
		System.out.println(sqrt(x));

	}

	 static int sqrt(int x) {
		// TODO Auto-generated method stub
		int st= 0,end=x;
		int ans = -1;
		
		while(st<=end) {
			int mid = st+(end-st)/2;
			int val = mid * mid;
			if(val==x) {
				return mid;
			}else if (val<x) {
				ans = mid;
				st = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return ans;
	}

}
