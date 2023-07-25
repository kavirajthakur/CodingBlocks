package Recursion3;

public class First_Occurence {
	public static int firstOcc(int arr[], int key ,int i) {
		if(i == arr.length) { 
			return -1;
		}
		if(arr[i]==key) { 
			return i;
			}
		
		return firstOcc(arr,key,i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {3,4,2,5,7,8};
		System.out.print(firstOcc(arr,6,0));

	}

}
