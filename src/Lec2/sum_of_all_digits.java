package Lec2;

public class sum_of_all_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3467;
		int sum = 0;
		while(n>0) {
			int rem= n%10;
			sum = sum+rem;
			n=n/10;
		}
		System.out.println(sum);

	}

}
