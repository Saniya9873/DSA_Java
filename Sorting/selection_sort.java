package Sorting;

import java.util.Arrays;

public class selection_sort {
    // public static void main(String[] args) {
    //     int[] arr={5,3,8,1,9,0,4,7,2};
    //     selectionsort(arr);
    //     System.out.println(Arrays.toString(arr));
    // }
    // static void selectionsort(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         int last=arr.length-i-1;
    //         int maxIndex=getMaxIndex(arr,0,last);
    //         swap(arr,maxIndex,last);
    //     }
    // }
    // private static int getMaxIndex(int[] arr, int start, int end){
    //     int max=start;
    //     for(int i=start;i<= end; i++){
    //         if(arr[max]< arr[i]){
    //             max=i;
    //         }
    //     }
    //     return max;
    // }
    // static void swap(int[] arr, int first, int second){
    //     int temp=arr[first];
    //     arr[first]=arr[second];
    //     arr[second]=temp;
    // }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;           
        }
    }

    // static void printArray(int[] arr){
    //     for (int val : arr) {
    //         System.out.print(val + " ");
    //     }
    //     System.out.println();
    // }
  
    public static void main(String[] args){
        int[] arr = {3,1,5,4,2};

        //System.out.print(Arrays.toString(arr));
        // printArray(arr);

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

        // System.out.print("Sorted array: ");
        // printArray(arr);
    }
}
