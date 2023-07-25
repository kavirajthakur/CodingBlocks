package Recursion3;



import java.util.*;

public class factorial {
	public static int printfact(int n) {
//		if(n==0) return 1;//base case
//		//smalller work
//		int ans = printfact(n-1);
//		
//		// self work
//		int finalans= n*ans;
//		return finalans;
		
		
		// other way //
		if(n==0) return 1;
		return n * printfact(n-1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(printfact(n));

	}

}
