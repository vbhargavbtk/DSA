package Binary_Search;

public class leetcode34 {
    public static void main(String[] args){

        int[] arr ={5,7,7,8,8,10};
        int target = 7;
        int[] result = searchRange(arr,  target);
        System.out.println(result[0]+" "+ result[1]);
    }
    public static int[] searchRange(int[] arr, int target) {
        int[] result = {-1 , -1};
        result[0] = search(arr,target , true);
        result[1] = search(arr,target , false);
        return result;
    }
    public static int search(int[] arr,int target ,boolean start){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high ) / 2;
            if(arr[mid]  > target){
                high = mid -1;
            }
            else if(arr[mid] < target){
                low = mid  + 1;

            }
            else{
                ans = mid ;
                if(start){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return ans;
    }
}
