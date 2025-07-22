public class binarysearch{
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8};
        int target = 5;
        int low = 0;
        int high = arr.length - 1 ;
        while(low <= high){
            int mid = (low + high ) / 2 ;
            if(arr[mid] == target){
                System.out.println("Element found at index "+ mid);
                break;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1 ;
            }
        }
        
        }
        
    }

