package Recursion3;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 3;
		PrintPath(0,0,n-1,m-1, "");

	}
	public static void PrintPath(int cc, int cr, int er, int ec, String ans) {
	if(cr==er && cc==ec ) {
		System.out.print(ans + " ");
		return;
	}
	if(cr>er || cc>ec) {
		return;
	}
	PrintPath(cr, cc + 1,er,ec,ans + "H");
	PrintPath(cr+1, cc,er,ec,ans + "V");
	

}
}
