package problemsOnBinarySearch;



public class floorOfANumberOfANumber{
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,7,8};
        
        
        int target=6;
        int position=floor(arr,target);
        System.out.println(arr[position]);
        
    }
    static int floor(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
              
            }
            else{
                return mid;
            }
            
        }
        return high;
    }
}
