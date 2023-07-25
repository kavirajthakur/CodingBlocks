package Recursion3;
import java.util.List;
import java.util.ArrayList;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		Parenthesis(n,0,0, "",ll);
		System.out.println(ll);

	}
	public static void Parenthesis(int n,int open,int close,String ans,List<String> ll) {
		if(open==n && close==n) {
			//System.out.print(ans+ "");
			ll.add(ans);
			return;
		}
		if(open<n) {
			Parenthesis(n,open+1,close,ans + "(",ll);
		}
		if(close<open) {
			Parenthesis(n,open,close+1,ans + ")",ll);
		}
	}

}
