package Recursion3;
import java.util.*;

public class fibo {
	
	public static int Fibonacci(int n) {
		if(n==0 || n==1)return n;
		
		// recursive work
		int p = Fibonacci(n-1);
		int prep = Fibonacci(n-2);
		return p + prep;
		// return Fibonacci(n-1) + Fibonacci(n-2)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0; i<= 10; i++) {
		System.out.println(Fibonacci(i));
		}
		

	}

}
