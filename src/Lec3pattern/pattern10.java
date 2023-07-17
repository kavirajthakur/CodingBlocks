package Lec3pattern;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row = 1;
		int star = 2*n-1;
		int space = 0;
		while(row<=n) {
			//space
			int i =1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//next row prep..
			System.out.println();
			row++;
			star-=2;
			space++;
		}
		
		

	}

}
