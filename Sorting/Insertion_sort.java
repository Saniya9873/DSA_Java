package Sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,6,9,0,2};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j > 0; j--){
                if(arr[j]< arr[j-1]){
                    //swap(arr, j, j-1);
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

    }
    // static void swap(int[] arr, int first, int second){
    //     int temp=arr[first];
    //     arr[first]=arr[second];
    //     arr[second]=temp;
    // }
    
}
