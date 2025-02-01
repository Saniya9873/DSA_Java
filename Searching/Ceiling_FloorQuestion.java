package Searching;
public class Ceiling_FloorQuestion {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int result=ceiling(arr, target);
        System.out.println(result);
    }
    static int ceiling(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid] >target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return arr[low];  // -> ceiling of a number
        // return arr[high];  // -> floor of a number
    }
}
