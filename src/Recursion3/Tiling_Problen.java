package Recursion3;

public class Tiling_Problen {
	public static int TilingProb(int n) {
		//base case
		if(n==0 || n==1) {
			return 1;
		}
		//vertical
		int fnm1 = TilingProb(n-1);
		//horizontal
		int fnm2 = TilingProb(n-2);
		
		int totalways = fnm1 + fnm2;
		return totalways;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(TilingProb(6));

	}

}
