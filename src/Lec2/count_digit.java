package Lec2;

public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3743747;
		int digit = 3;
		int count = 0;
		while(n>0) {
			int rem = n%10;
			if(rem==digit) {
				count++;
			}
			n = n/10;
			
		}
		System.out.println(count);

	}

}
