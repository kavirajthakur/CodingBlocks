package Lec13;

import java.util.ArrayList;

public class Arraylist_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>(); 
		
		//4 things to learn 1. add 2. get 3. update 4. Remove 5.Transversl
		
		
		System.out.println(ll);
		System.out.println(ll.size());
		
		//add
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1,-9);//index ka range 0 to size
		System.out.println(ll);
		//get
		System.out.println(ll.get(2));
		//update
		ll.set(2, -40);//index ka range 0 tosize-1
		System.out.println(ll);
		
		// remove
		System.out.println(ll.remove(1));
		System.out.println(ll);
	

	}

}
