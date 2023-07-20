package Bubble_Sort;

public class best_optimized_way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if jaha se element sorted ho waha pr swapping na ho iski TC bhi o(n) ki form m aaye
		int [] arr = {3,4,6,3,5,7,0};
		bubblesort(arr);
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	}
	public static void bubblesort(int [] arr) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			boolean flag = false;/*yaha isliye liya kyuki ye for loop hi toh tranverse kr raha h saare elements
			ko.. dekh raha h kaha need h or kaha nhi swapping ki*/
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;//have any swapped happened?	
				}
			}
			if(flag==false) {
				return;
			}
		}
	}

}
