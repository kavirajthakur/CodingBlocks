package Lec3pattern;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row = n;
		int star=n;
		while(row<=n) {
			int i =1;
			while(i<=star) {
				System.out.print("*");
			}
			System.out.println();
			row++;
		}

	}

}
