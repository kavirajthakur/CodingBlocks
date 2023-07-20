package Sorting_Problems;

public class lexicographical_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = {"kiwi" , "papaya","mango","apple"};
		sortFruits(fruits);
		for(String i:fruits) {
			System.out.print(i+ " ");
		}
		

	}

	public static void sortFruits(String[] fruits) {
		// TODO Auto-generated method stub
		int n = fruits.length;
		for(int i =0; i<n-1; i++) {
			int min_index = i;
			for( int j=i+1; j<n; j++) {
				if(fruits[j].compareTo(fruits[min_index])<0) {
					min_index=j;
				}
				
			}
			//swap fruits[min_index],fruits[i]
			String temp = fruits[i];
			fruits[i]=fruits[min_index];
			fruits[min_index]=temp;
			
		}
		
		
	}

}
