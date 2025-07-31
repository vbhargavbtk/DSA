package Binary_Search;

public class floor_of_a_number {
    public static void main(String[] args){
        int[] arr = {2,5,8,10,15};
        int target = 11;
        if (target < arr[0]){
             System.out.println("Floor of this number is not present in this array");
        }
        else if(target > arr[arr.length - 1]){
            System.out.println("Floor of this number is "+ arr[arr.length - 1]);
           
        }
        else{
            System.out.print(arr[floor(arr,target)]);
        }
        
    }
    public static int floor(int[] arr,int target){
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
        return high ;
        
    }
}
