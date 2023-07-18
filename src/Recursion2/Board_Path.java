package Recursion2;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		PrintPath(0, n, "");
		
	}
	public static void PrintPath(int curr, int end, String ans) {
		if(curr == end) {
			System.out.print(ans + " ");
			return ;
		}
		 if(curr>end) {
			 return;
		 }
		 for (int dice = 1; dice<=3; dice++) {
			 PrintPath(curr + dice, end, ans+dice);
			 
		 }
//		-
//		
	}

}
