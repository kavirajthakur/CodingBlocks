package Bubble_Sort;

public class worst_approach_0nn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,4,6,3,5,7,0};
		bubblesort(arr);
		for(int i:arr) {
			System.out.println(i+ "");
		}
		

	}
	public static void bubblesort(int [] arr) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;			
					
				}
			}
		}
	}

}
