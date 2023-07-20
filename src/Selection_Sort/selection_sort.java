package Selection_Sort;

public class selection_sort {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a []= {2,5,1,6,3,8};
		selection_s(a);
		for(int i :a) {
			System.out.print(i+ " ");
		}
	}
	public static void selection_s(int []a) {
		int n = a.length;
		for (int i = 0; i<n-1; i++){//i represent the current index 
		int  min_index = i;
		for(int j = i+1; j<n; j++) {
			if(a[j]<a[min_index]) {
				min_index=j;		
			}
		}
		//swap current element and minimum element -> current index i will have correct element
		//a[min_index],a[i]
		int temp = a[i];
		a[i]=a[min_index];
		a[min_index]=temp;
		
			
		}
		
	}

}
