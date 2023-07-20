package Sorting_Problems;

public class moves_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {3,4,0,5,0,0,43};
		int n = a.length;
		for(int i=0; i<n-1;i++) {
			for(int j=0;j<n-i-1; j++) {
				if(a[j]==0 && a[j+1]!=0) {
					//swap kro a[i] and a[j+1]
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
		for(int i:a) {
			System.out.print(i + " ");
		}

	}

}
