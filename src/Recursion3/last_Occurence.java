package Recursion3;

public class last_Occurence {
	public static int lastOcc(int [] a, int key, int i) {
		if(i==a.length) return -1;
		int isFound = lastOcc(a,key,i+1);
		if(isFound==-1 && a[i]==key) {
			return i;
		}
		return isFound;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,5,5,5,5};
		System.out.print(lastOcc(a,5,0));

	}

}
