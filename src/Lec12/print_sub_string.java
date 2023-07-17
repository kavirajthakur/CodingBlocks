package Lec12;

public class print_sub_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		PrintString(s);		

	}
	public static void PrintString(String s) {
		for(int i = 0; i<s.length(); i++) {
			for(int j =i+1; j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}

}
