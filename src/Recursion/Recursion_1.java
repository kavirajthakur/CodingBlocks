package Recursion;

public class Recursion_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fac(5));
		

	}
	public static int fac(int n) {
		if(n==1) {
			return 1;
		}
		
		int fn = fac(n-1);
		return n*fn;	

}
}
