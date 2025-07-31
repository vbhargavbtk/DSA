package Binary_Search;

public class peak_in_a_mountain_array {
    public static void main(String[] args){
        int[] arr = {3,4,5,1};
        System.out.print(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){
            int mid = (start + end )/ 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start ;
    }
}
