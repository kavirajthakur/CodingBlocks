package Binary_Search;

public class recursive_binary_search {
		public static void main(String args[]) {
			int [] arr = {1,2,3,4,5};
			int target = 4;
			System.out.println(recBinarySearch(arr,0,arr.length-1,target));
		}
		public static boolean recBinarySearch(int []arr,int st, int end, int target) {
			if(st>end) return false;//base case
			int mid = (st+end)/2;
			if(target==arr[mid]) {
				return true;
			}else if (target < arr[mid]) {
				return recBinarySearch(arr,st, mid -1, target);//subproblems
			}else {
				return recBinarySearch(arr,mid+1,end,target);//subproblems
			}
			
		}

	}


