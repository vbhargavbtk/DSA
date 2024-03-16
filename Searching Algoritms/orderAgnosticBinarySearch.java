public class orderAgnosticBinarySearch{
    public static void main(String[] args) {
        int[] array={8,7,6,5,4,3,2,1,0};
        int low=0;
        int high=array.length-1;
        
        int target=0;
        if(array[low]<array[high]){
          
             while(low<=high){
               int mid=low+(high-low)/2;
               if(target<array[mid]){
                  high=mid-1;
               }
               else if(target>array[mid]){
                  low=mid+1;
      
               }
               else{
                   System.out.println("element found at "+mid+" index");
                   break;
               }
            }
        }
        else{
            while(low<=high){
                int mid=low+(high-low)/2;
                if(target<array[mid]){
                   low=mid+1;
                }
                else if(target>array[mid]){
                   high=mid-1;
       
                }
                else{
                    System.out.println("element found at "+mid+" index");
                    break;
                }
             }
        }
        
        
    }
}



