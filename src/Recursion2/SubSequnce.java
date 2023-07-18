package Recursion2;

public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		PrintSubSequence(ques, "");
		

	}
	public static void PrintSubSequence(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans + " ");
			return;
		}
		char ch = ques.charAt(0);//a
		PrintSubSequence(ques.substring(1),ans);//no
		PrintSubSequence(ques.substring(1),ans + ch);//yes
		
	}

}
