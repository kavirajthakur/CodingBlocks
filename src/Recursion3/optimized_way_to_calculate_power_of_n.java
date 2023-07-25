package Recursion3;

public class optimized_way_to_calculate_power_of_n {
	public static int power(int x , int n) {
		if(n==0) {
			return 1;
		}
		int halfpower = power(x,n/2);
		int halfpowerSq = halfpower * halfpower;
		
		//if n is odd
		if(n%2!=0) {
			halfpowerSq = x * halfpowerSq;
		}
		return halfpowerSq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(power(2,5));

	}

}

// Time Complexity == o(logn)
