public class binarysearch{
    public static void main(String[] args) {
        int[] array={0,1,2,3,4,5,6,7,8};
        int low=0;
        int high=array.length-1;
        
        int target=8;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<array[mid]){
                high=mid-1;
            }
            else if(target>array[mid]){
                low=mid+1;
              
            }
            else{
                System.out.println("element found at "+mid+" position");
                break;
            }
        }
        
    }
}
