package twoarray;

import java.util.Scanner;

public class userinput_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        
        System.out.println("enter number of col");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];//total r*c
        System.out.println("Enter " + r*c +" elements");
        for(int i =0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }
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
