package Recursion;

public class binart_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 1;
        search(arr,0,arr.length-1,target); 
    }

    public static void search(int[] arr,int start,int end,int target){
        if(start <= end){
        int mid = (start + end ) / 2 ;
        if(arr[mid] == target){
            System.out.println("Element found at "+ mid + " index");
            return;
        }
        else if(arr[mid] < target){
            search( arr, mid + 1,end,target);
            
        }
        
        else search( arr, start,mid - 1,target);
        }
        

    }
}
