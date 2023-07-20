package Bubble_Sort;

public class decreasing_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if jaha se element sorted ho waha pr swapping na ho iski TC bhi o(n) ki form m aaye
		int [] arr = {3,4,6,3,5,7,0};
		bubblesort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void bubblesort(int [] arr) {
		int n = arr.length;
		for(int i =0; i<arr.length-1; i++) {
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
