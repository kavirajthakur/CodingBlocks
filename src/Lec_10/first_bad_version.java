package Lec_10;

public class  first_bad_version {
   public static void main(String args[]) {
	   int n= 5;
	   int lo = 1;
	   int hi = n;
	   int ans = 0;
	   while(lo<=hi) {
		   int mid = lo+(hi-lo)/2;
		   if(isBadVersion(mid)==true) {
			   ans = mid;
			   hi = mid -1;
		   }else {
			   lo = mid +1;
		   }
	   }
	   System.out.println(ans);
   }
   public static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
}
}
