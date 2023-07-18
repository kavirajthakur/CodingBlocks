package Recursion;

public class Recursion_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		int b=4;
		System.out.println(pow(a,b));
			
		

	}
public static int pow(int a, int b) {
	if(b==0) {
		return 1;
	}
	int pow = pow(a,b-1);
	return a*pow;
}
}
