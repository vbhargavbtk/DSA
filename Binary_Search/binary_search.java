package Binary_Search;

public class binary_search {
    public static void main(String[] args){
        int[] arr = {1,2,5,8,10,15};
        int target = 10;
        int index = binary(arr,target);
        if (index == -1 ){
            System.out.print("element not found");
        }
        else{
            System.out.print("element found at "+ index +" index");
        }
        
    }
    public static int binary(int[] arr,int target){
        int low = 0 ;
        int high = arr.length -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] < target){
                low = mid + 1 ;
            }
            else if(arr[mid] > target){
                high = mid -1 ;

            }
            else{
                return mid;
            }
            
           
        }
        return -1;
        
    }
}
