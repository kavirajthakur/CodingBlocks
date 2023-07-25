package Recursion3;

public class Calculate_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.print(Sum(n));

	}
	public static int Sum(int n) {
		if(n==1) return 1;
		
		return n + Sum(n-1);
	}

}
