package Recursion3;

public class x_power_n {
	public static int power(int x, int n) {
		if(n==0) return 1;
		return x * power(x,n-1);
		//int xnm1 = power(x,n-1);
		//int xn = x * xnm1;
		//return xn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(power(2,10));

	}

}
