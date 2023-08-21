package twoarray;

public class index {
    public static void main(String[] args) {
        int [][]  arr= {{3,4,5},
                        {2,4,5},
                        };
                        printArray(arr);
                        
        
    }
    static void printArray(int[][]arr){
        for(int i=0; i<arr.length; i++){//row
            for(int j = 0; j<arr[i].length; j++){//col
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();//to print next row
        }
    }
    
}
