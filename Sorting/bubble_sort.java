package Sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={2,-5,0,81,56,9,36};

        //bubble sort
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        // printArray(arr);
    }

    // static void printArray(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    
}
